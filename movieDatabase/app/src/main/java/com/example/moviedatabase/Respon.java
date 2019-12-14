package com.example.moviedatabase;

import com.google.gson.annotations.SerializedName;

public class Respon {

    @SerializedName("shubuh")
    private String shubuh;
    @SerializedName("dzuhur")
    private String dzuhur;
    @SerializedName("ashar")
    private String ashar;
    @SerializedName("maghrib")
    private String maghrib;
    @SerializedName("isya")
    private String isya;

    public String getShubuh() {
        return shubuh;
    }

    public void setShubuh(String shubuh) {
        this.shubuh = shubuh;
    }

    public String getDzuhur() {
        return dzuhur;
    }

    public void setDzuhur(String dzuhur) {
        this.dzuhur = dzuhur;
    }

    public String getAshar() {
        return ashar;
    }

    public void setAshar(String ashar) {
        this.ashar = ashar;
    }

    public String getMaghrib() {
        return maghrib;
    }

    public void setMaghrib(String maghrib) {
        this.maghrib = maghrib;
    }

    public String getIsya() {
        return isya;
    }

    public void setIsya(String isya) {
        this.isya = isya;
    }


}
