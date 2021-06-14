package com.example.holiday.model.holiday;

import com.google.gson.annotations.SerializedName;

public class HolidaysDiscoverItem {

    @SerializedName("date")
    private String date;

    @SerializedName("country")
    private String country;

    @SerializedName("public")
    private Boolean jsonMemberPublic;

    @SerializedName("name")
    private String name;

    @SerializedName("weekday")
    private Weekday weekday;

    @SerializedName("uuid")
    private String uuid;

    @SerializedName("observed")
    private String observed;

    public void setDate(String date){
        this.date = date;
    }

    public String getDate(){
        return date;
    }

    public void setCountry(String country){
        this.country = country;
    }

    public String getCountry(){
        return country;
    }

    public void setJsonMemberPublic(Boolean jsonMemberPublic){
        this.jsonMemberPublic = jsonMemberPublic;
    }

    public boolean isJsonMemberPublic(){
        return jsonMemberPublic;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setWeekday(Weekday weekday){
        this.weekday = weekday;
    }

    public Weekday getWeekday(){
        return weekday;
    }

    public void setUuid(String uuid){
        this.uuid = uuid;
    }

    public String getUuid(){
        return uuid;
    }

    public void setObserved(String observed){
        this.observed = observed;
    }

    public String getObserved(){
        return observed;
    }

    @Override
     public String toString(){
        return 
            "HolidaysItem{" + 
            "date = '" + date + '\'' + 
            ",country = '" + country + '\'' + 
            ",public = '" + jsonMemberPublic + '\'' + 
            ",name = '" + name + '\'' + 
            ",weekday = '" + weekday + '\'' + 
            ",uuid = '" + uuid + '\'' + 
            ",observed = '" + observed + '\'' + 
            "}";
        }
}