package com.project.mygempaapps.pjModels.DetailGempa;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Products{

    @SerializedName("phase-data")
    private List<PhaseDataItem> phaseData;

    @SerializedName("origin")
    private List<OriginItem> origin;

    public void setPhaseData(List<PhaseDataItem> phaseData){
        this.phaseData = phaseData;
    }

    public List<PhaseDataItem> getPhaseData(){
        return phaseData;
    }

    public void setOrigin(List<OriginItem> origin){
        this.origin = origin;
    }

    public List<OriginItem> getOrigin(){
        return origin;
    }
}