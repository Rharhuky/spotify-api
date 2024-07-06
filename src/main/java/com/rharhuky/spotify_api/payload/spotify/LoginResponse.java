package com.rharhuky.spotify_api.payload.spotify;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LoginResponse {

    @JsonAlias(value = {"access_token"})
    private String accessToken;
}