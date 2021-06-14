package com.example.holiday.model.holiday;

import com.google.gson.annotations.SerializedName;

public class Requests{

    @SerializedName("available")
    private Integer available;

    @SerializedName("resets")
    private String resets;

    @SerializedName("used")
    private Integer used;

    public void setAvailable(Integer available){
        this.available = available;
    }

    public Integer getAvailable(){
        return available;
    }

    public void setResets(String resets){
        this.resets = resets;
    }

    public String getResets(){
        return resets;
    }

    public void setUsed(Integer used){
        this.used = used;
    }

    public Integer getUsed(){
        return used;
    }

    @Override
     public String toString(){
        return 
            "Requests{" + 
            "available = '" + available + '\'' + 
            ",resets = '" + resets + '\'' + 
            ",used = '" + used + '\'' + 
            "}";
        }
}