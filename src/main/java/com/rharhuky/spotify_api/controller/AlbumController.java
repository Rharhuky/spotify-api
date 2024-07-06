package com.rharhuky.spotify_api.controller;

import com.rharhuky.spotify_api.clients.spotify.AlbumSpotify;
import com.rharhuky.spotify_api.clients.spotify.AuthSpotify;
import com.rharhuky.spotify_api.config.PropertiesConfig;
import com.rharhuky.spotify_api.payload.spotify.LoginRequest;
import com.rharhuky.spotify_api.payload.spotify.LoginResponse;
import com.rharhuky.spotify_api.payload.spotify.NewReleasesResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.rharhuky.spotify_api.util.ResourceURI.BASE_URI;

@RestController
@RequestMapping(value = BASE_URI)
@RequiredArgsConstructor
public class AlbumController {

    private final AuthSpotify authSpotify;

    private final AlbumSpotify albumSpotify;

    private final PropertiesConfig propertiesConfig;

    @PostMapping
    public ResponseEntity<LoginResponse> login(){
        LoginRequest loginRequest = new LoginRequest(
                "client_credentials",
                propertiesConfig.getClientId(),
                propertiesConfig.getClientSecret());
        return ResponseEntity.status(HttpStatus.CREATED).body(authSpotify.login(loginRequest));
    }

    @GetMapping
    public ResponseEntity<NewReleasesResponse> getNewReleases(){
        LoginRequest loginRequest = new LoginRequest(
                "client_credentials",
                propertiesConfig.getClientId(),
                propertiesConfig.getClientSecret());
        var accessToken = authSpotify.login(loginRequest).getAccessToken();
        return ResponseEntity.ok(albumSpotify.getReleases("Bearer " + accessToken));
    }
}