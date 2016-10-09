package com.example.hc.triputil;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/**
 * Created by hc on 2016-10-08.
 */

public interface RetrofitService {
    @GET("index.php")
    Call<RetrofitRepo> getIndex(
            @Query("name") String name
    );

    @GET("test.php")
    Call<RetrofitRepo> getItem(
            @QueryMap Map<String, String> option
    ) ;

    @FormUrlEncoded
    @POST("post.php")
    Call<RetrofitRepo> getPost(
            @Field(
                    "name") String name
    );
}
