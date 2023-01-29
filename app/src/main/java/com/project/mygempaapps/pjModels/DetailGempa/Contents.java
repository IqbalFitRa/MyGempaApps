package com.project.mygempaapps.pjModels.DetailGempa;

import com.google.gson.annotations.SerializedName;

public class Contents{

    @SerializedName("quakeml.xml")
    private QuakemlXml quakemlXml;

    @SerializedName("contents.xml")
    private ContentsXml contentsXml;

    public void setQuakemlXml(QuakemlXml quakemlXml){
        this.quakemlXml = quakemlXml;
    }

    public QuakemlXml getQuakemlXml(){
        return quakemlXml;
    }

    public void setContentsXml(ContentsXml contentsXml){
        this.contentsXml = contentsXml;
    }

    public ContentsXml getContentsXml(){
        return contentsXml;
    }
}