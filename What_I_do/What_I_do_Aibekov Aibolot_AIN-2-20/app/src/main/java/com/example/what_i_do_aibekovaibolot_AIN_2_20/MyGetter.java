package com.example.what_i_cac_do_kubatbekov_alaken_ain_2_20;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MyGetter {
    @GET("activity")
    Call<Message> getMessage();
}
