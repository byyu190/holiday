package com.example.holiday.view.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.holiday.model.holiday.HolidayDiscoverResponse;
import com.example.holiday.model.holiday.HolidaysDiscoverItem;
import com.example.holiday.service.ApiMain;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HolidayViewModel extends ViewModel {
    private ApiMain apiMain;

    private MutableLiveData<ArrayList<HolidaysDiscoverItem>> listDiscoverHoliday = new MutableLiveData<>();

    public void setHolidayDiscover(){
        if (this.apiMain == null){
            apiMain = new ApiMain();
        }
        apiMain.getApiHoliday().getHolidayDiscover().enqueue(new Callback<HolidayDiscoverResponse>() {
            @Override
            public void onResponse(Call<HolidayDiscoverResponse> call, Response<HolidayDiscoverResponse> response) {
                HolidayDiscoverResponse renponseDiscover = response.body();
                if(renponseDiscover != null && renponseDiscover.getHolidays() != null){
                    ArrayList<HolidaysDiscoverItem> holidaysDiscoverItems = renponseDiscover.getHolidays();
                    listDiscoverHoliday.postValue(holidaysDiscoverItems);
                }
            }

            @Override
            public void onFailure(Call<HolidayDiscoverResponse> call, Throwable t) {

            }
        });
    }

    public LiveData<ArrayList<HolidaysDiscoverItem>> getHolidayDiscover(){
        return listDiscoverHoliday;
    }
}
