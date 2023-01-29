package com.project.mygempaapps.pjModels.ListGempa;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Geometry{

    @SerializedName("coordinates")
    private List<Object> coordinates;

    @SerializedName("type")
    private String type;

    public void setCoordinates(List<Object> coordinates){
        this.coordinates = coordinates;
    }

    public List<Object> getCoordinates(){
        return coordinates;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }
}