package com.rharhuky.spotify_api.clients.spotify;

import com.rharhuky.spotify_api.payload.spotify.NewReleasesResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import static com.rharhuky.spotify_api.clients.spotify.ResourceUriSpotify.BASE_URI;

@FeignClient(name = "AlbumSpotify",url = BASE_URI)
public interface AlbumSpotify {

    @GetMapping(value = "/v1/browse/new-releases")
    NewReleasesResponse getReleases(@RequestHeader(value = "Authorization")String authorization);
}