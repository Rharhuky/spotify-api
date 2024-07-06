package com.rharhuky.spotify_api.payload.spotify;

import feign.form.FormProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class LoginRequest {

    @FormProperty(value = "grant_type")
    private String grantType;

    @FormProperty(value = "client_id")
    private String clientId;

    @FormProperty(value = "client_secret")
    private String clientSecret;
}