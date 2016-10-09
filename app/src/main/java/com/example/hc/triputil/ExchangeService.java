package com.example.hc.triputil;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


/**
 * Created by hc on 2016-10-08.
 */

public interface ExchangeService {

    @GET("latest.json")
    Call <ExchangeRepo> getLast(
            @Query("app_id") String id,
            @Query("baes") String base ,
            @Query("symbols") String symbols
    );
}
