package com.example.holiday.service;

import com.example.holiday.model.holiday.HolidayDiscoverResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface HolidayRepository {
    @GET("v1/holidays?pretty&key=384872b7-9d2c-4a4b-84af-9c5ad6b1dfbe&country=ID&year=2020")
    Call<HolidayDiscoverResponse> getHolidayDiscover();
}

