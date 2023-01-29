package com.project.mygempaapps.pjModels.ListGempa;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ListGempaResponse{

    @SerializedName("features")
    private List<FeaturesItem> features;

    @SerializedName("metadata")
    private Metadata metadata;

    @SerializedName("bbox")
    private List<Object> bbox;

    @SerializedName("type")
    private String type;

    public void setFeatures(List<FeaturesItem> features){
        this.features = features;
    }

    public List<FeaturesItem> getFeatures(){
        return features;
    }

    public void setMetadata(Metadata metadata){
        this.metadata = metadata;
    }

    public Metadata getMetadata(){
        return metadata;
    }

    public void setBbox(List<Object> bbox){
        this.bbox = bbox;
    }

    public List<Object> getBbox(){
        return bbox;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }
}