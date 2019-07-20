package com.software.tempe.mandirikita.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Balance {
    @SerializedName("branchNumber")
    @Expose
    private String branchNumber;

    @SerializedName("shortName")
    @Expose
    private String shortName;

    @SerializedName("holdAmount")
    @Expose
    private String holdAmount;

    @SerializedName("availableBalance")
    @Expose
    private String availableBalance;

    @SerializedName("loanType")
    @Expose
    private String loanType;

    @SerializedName("loanCategory")
    @Expose
    private String loanCategory;

    @SerializedName("loanInterestRate")
    @Expose
    private String loanInterestRate;

    @SerializedName("maxWithdrawalLimit")
    @Expose
    private String maxWithdrawalLimit;

    @SerializedName("originalLoanDate")
    @Expose
    private String originalLoanDate;

    @SerializedName("maturityDate")
    @Expose
    private String maturityDate;

    @SerializedName("dueLateCharge")
    @Expose
    private String dueLateCharge;

    @SerializedName("accruedInterest")
    @Expose
    private String accruedInterest;

    @SerializedName("outstandingBalance")
    @Expose
    private String outstandingBalance;

    @SerializedName("balanceFlagDRCR")
    @Expose
    private String balanceFlagDRCR;

    @SerializedName("overdraft")
    @Expose
    private String overdraft;

    @SerializedName("statusDate")
    @Expose
    private String statusDate;

    @SerializedName("currencyType")
    @Expose
    private String currencyType;

    @SerializedName("currentBalance")
    @Expose
    private String currentBalance;

    @SerializedName("billedIntAmtOD")
    @Expose
    private String billedIntAmtOD;

    @SerializedName("lateCharges")
    @Expose
    private String lateCharges;

    @SerializedName("otherCharges")
    @Expose
    private String otherCharges;

    @SerializedName("miscCost")
    @Expose
    private String miscCost;

    @SerializedName("memoPostAmount")
    @Expose
    private String memoPostAmount;

    public String getBranchNumber() {
        return branchNumber;
    }

    public String getShortName() {
        return shortName;
    }

    public String getHoldAmount() {
        return holdAmount;
    }

    public String getAvailableBalance() {
        return availableBalance;
    }

    public String getLoanType() {
        return loanType;
    }

    public String getLoanCategory() {
        return loanCategory;
    }

    public String getLoanInterestRate() {
        return loanInterestRate;
    }

    public String getMaxWithdrawalLimit() {
        return maxWithdrawalLimit;
    }

    public String getOriginalLoanDate() {
        return originalLoanDate;
    }

    public String getMaturityDate() {
        return maturityDate;
    }

    public String getDueLateCharge() {
        return dueLateCharge;
    }

    public String getAccruedInterest() {
        return accruedInterest;
    }

    public String getOutstandingBalance() {
        return outstandingBalance;
    }

    public String getBalanceFlagDRCR() {
        return balanceFlagDRCR;
    }

    public String getOverdraft() {
        return overdraft;
    }

    public String getStatusDate() {
        return statusDate;
    }

    public String getCurrencyType() {
        return currencyType;
    }

    public String getCurrentBalance() {
        return currentBalance;
    }

    public String getBilledIntAmtOD() {
        return billedIntAmtOD;
    }

    public String getLateCharges() {
        return lateCharges;
    }

    public String getOtherCharges() {
        return otherCharges;
    }

    public String getMiscCost() {
        return miscCost;
    }

    public String getMemoPostAmount() {
        return memoPostAmount;
    }
}
