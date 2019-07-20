package com.software.tempe.mandirikita.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CustomerLoan {
    @SerializedName("Response")
    @Expose
    private CResponse response;

    public CResponse getResponse() {
        return response;
    }
}
