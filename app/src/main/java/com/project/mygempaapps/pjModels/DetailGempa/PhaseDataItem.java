package com.project.mygempaapps.pjModels.DetailGempa;

import com.google.gson.annotations.SerializedName;

public class PhaseDataItem{

    @SerializedName("indexTime")
    private long indexTime;

    @SerializedName("code")
    private String code;

    @SerializedName("contents")
    private Contents contents;

    @SerializedName("indexid")
    private String indexid;

    @SerializedName("preferredWeight")
    private int preferredWeight;

    @SerializedName("updateTime")
    private long updateTime;

    @SerializedName("id")
    private String id;

    @SerializedName("source")
    private String source;

    @SerializedName("type")
    private String type;

    @SerializedName("properties")
    private Properties properties;

    @SerializedName("status")
    private String status;

    public void setIndexTime(long indexTime){
        this.indexTime = indexTime;
    }

    public long getIndexTime(){
        return indexTime;
    }

    public void setCode(String code){
        this.code = code;
    }

    public String getCode(){
        return code;
    }

    public void setContents(Contents contents){
        this.contents = contents;
    }

    public Contents getContents(){
        return contents;
    }

    public void setIndexid(String indexid){
        this.indexid = indexid;
    }

    public String getIndexid(){
        return indexid;
    }

    public void setPreferredWeight(int preferredWeight){
        this.preferredWeight = preferredWeight;
    }

    public int getPreferredWeight(){
        return preferredWeight;
    }

    public void setUpdateTime(long updateTime){
        this.updateTime = updateTime;
    }

    public long getUpdateTime(){
        return updateTime;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return id;
    }

    public void setSource(String source){
        this.source = source;
    }

    public String getSource(){
        return source;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }

    public void setProperties(Properties properties){
        this.properties = properties;
    }

    public Properties getProperties(){
        return properties;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public String getStatus(){
        return status;
    }
}