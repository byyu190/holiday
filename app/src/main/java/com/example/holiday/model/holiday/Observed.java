package com.example.holiday.model.holiday;

import com.google.gson.annotations.SerializedName;

public class Observed{

    @SerializedName("name")
    private String name;

    @SerializedName("numeric")
    private String numeric;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setNumeric(String numeric){
        this.numeric = numeric;
    }

    public String getNumeric(){
        return numeric;
    }

    @Override
     public String toString(){
        return 
            "Observed{" + 
            "name = '" + name + '\'' + 
            ",numeric = '" + numeric + '\'' + 
            "}";
        }
}