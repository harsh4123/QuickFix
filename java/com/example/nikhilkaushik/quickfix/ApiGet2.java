package com.example.nikhilkaushik.quickfix;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;
import static com.example.nikhilkaushik.quickfix.GlobalVariables.url;
/**
 * Created by Nikhil Kaushik on 2/7/2017.
 */

public interface ApiGet2 {
    String BASE_URL = url;

    @GET("/notify.php")
    Call<Example2> getRequest(@Query("email") String emailid);

    class Factory {
        public static ApiGet2 service;

        public static ApiGet2 getInstance() {
            if (service == null) {
                Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
                service = retrofit.create(ApiGet2.class);
            }
            return service;
        }
    }


}
