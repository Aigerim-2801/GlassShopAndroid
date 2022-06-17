package com.example.glassshop.api;

import com.example.glassshop.models.User;
import com.example.glassshop.models.response.DefaultResponse;
import com.example.glassshop.models.response.LoginResponse;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface Api {

    @GET("auth/login")
    Call<LoginResponse> loginUser(
            @Query("email") String email,
            @Query("password") String password
    );

    @GET("auth/reset-password-request")
    Call<String> forgotPassword(
            @Query("email") String email
    );

    @GET("auth/change-password")
    Call<DefaultResponse> resetPassword(
            @Query("token") String token,
            @Query("password") String password
    );

}