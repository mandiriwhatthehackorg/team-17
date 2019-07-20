package com.software.tempe.mandirikita.service;

import com.software.tempe.mandirikita.model.JWTServicing;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface ServicingAPI {

    @GET("getJsonWebToken")
    Call<JWTServicing> getJWTServicing (
            @Query("app_id") String app_id,
            @Header("Authorization") String auth,
            @Header("Content-Type") String content_type
    );
}
