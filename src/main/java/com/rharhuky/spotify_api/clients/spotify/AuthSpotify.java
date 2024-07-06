package com.rharhuky.spotify_api.clients.spotify;

import com.rharhuky.spotify_api.payload.spotify.LoginRequest;
import com.rharhuky.spotify_api.payload.spotify.LoginResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import static com.rharhuky.spotify_api.clients.spotify.ResourceUriSpotify.BASE_URI_AUTH;
import static com.rharhuky.spotify_api.clients.spotify.ResourceUriSpotify.LOGIN_URI;

@FeignClient(name = "AuthSpotify", url = BASE_URI_AUTH)
public interface AuthSpotify {

    @PostMapping(value = LOGIN_URI, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    LoginResponse login(@RequestBody LoginRequest loginRequest);
}