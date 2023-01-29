package com.project.mygempaapps.pjModels.DetailGempa;

import com.google.gson.annotations.SerializedName;

public class ContentsXml{

    @SerializedName("length")
    private int length;

    @SerializedName("lastModified")
    private long lastModified;

    @SerializedName("contentType")
    private String contentType;

    @SerializedName("url")
    private String url;

    public void setLength(int length){
        this.length = length;
    }

    public int getLength(){
        return length;
    }

    public void setLastModified(long lastModified){
        this.lastModified = lastModified;
    }

    public long getLastModified(){
        return lastModified;
    }

    public void setContentType(String contentType){
        this.contentType = contentType;
    }

    public String getContentType(){
        return contentType;
    }

    public void setUrl(String url){
        this.url = url;
    }

    public String getUrl(){
        return url;
    }
}