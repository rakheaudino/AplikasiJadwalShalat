package com.example.moviedatabase;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Post {

    @SerializedName("status")
    private String status;
    @SerializedName("respon")
    private Respon respon;
    @SerializedName("peta_gambar")
    private String petaGambar;
    @SerializedName("creator")
    private String creator;

    public String getStatus() {
        return status;
    }

    public Respon getRespon() {
        return respon;
    }

    public String getPetaGambar() {
        return petaGambar;
    }

    public String getCreator() {
        return creator;
    }


}
