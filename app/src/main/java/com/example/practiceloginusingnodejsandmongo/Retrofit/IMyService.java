package com.example.practiceloginusingnodejsandmongo.Retrofit;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface IMyService {
    @POST("registerUser")
    @FormUrlEncoded
    Observable<String> registerUser(@Field("email") String email,
                                    @Field("name") String name,
                                    @Field("password") String password);

    @POST("loginUser")
    @FormUrlEncoded
    Observable<String> loginUser(@Field("email") String email,
                                    @Field("password") String password);
}
