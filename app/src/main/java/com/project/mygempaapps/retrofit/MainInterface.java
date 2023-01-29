package com.project.mygempaapps.retrofit;

import com.project.mygempaapps.pjModels.DetailGempa.DetailGempaResponse;
import com.project.mygempaapps.pjModels.ListGempa.ListGempaResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface MainInterface {

    @GET("summary/2.5_day")
    Call<ListGempaResponse> listGempa (

    );

    @GET("/detail/{id_gempa}")
    Call<DetailGempaResponse> detailGempa (
            @Path("id_gempa") int id
    );

}
