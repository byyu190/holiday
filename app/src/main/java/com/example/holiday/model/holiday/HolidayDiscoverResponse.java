package com.example.holiday.model.holiday;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.SerializedName;

public class HolidayDiscoverResponse{

    @SerializedName("holidays")
    private ArrayList<HolidaysDiscoverItem> holidays;

    @SerializedName("warning")
    private String warning;

    @SerializedName("requests")
    private Requests requests;

    @SerializedName("status")
    private Integer status;

    public void setHolidays(ArrayList<HolidaysDiscoverItem> holidays){
        this.holidays = holidays;
    }

    public ArrayList<HolidaysDiscoverItem> getHolidays(){
        return holidays;
    }

    public void setWarning(String warning){
        this.warning = warning;
    }

    public String getWarning(){
        return warning;
    }

    public void setRequests(Requests requests){
        this.requests = requests;
    }

    public Requests getRequests(){
        return requests;
    }

    public void setStatus(Integer status){
        this.status = status;
    }

    public Integer getStatus(){
        return status;
    }

    @Override
     public String toString(){
        return 
            "HolidayDiscoverResponse{" + 
            "holidays = '" + holidays + '\'' + 
            ",warning = '" + warning + '\'' + 
            ",requests = '" + requests + '\'' + 
            ",status = '" + status + '\'' + 
            "}";
        }
}