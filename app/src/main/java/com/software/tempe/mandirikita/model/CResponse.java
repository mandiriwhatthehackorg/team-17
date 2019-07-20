package com.software.tempe.mandirikita.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CResponse {
    @SerializedName("Exception")
    @Expose
    private Exception exception;

    @SerializedName("balance")
    @Expose
    private Balance balance;

    public Exception getException() {
        return exception;
    }

    public Balance getBalance() {
        return balance;
    }
}
