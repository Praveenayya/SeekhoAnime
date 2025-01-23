
package com.example.seekhoanime.appPojoClasses.animemain;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Images__1 {

    @SerializedName("image_url")
    @Expose
    private String imageUrl;
    @SerializedName("small_image_url")
    @Expose
    private String smallImageUrl;
    @SerializedName("medium_image_url")
    @Expose
    private String mediumImageUrl;
    @SerializedName("large_image_url")
    @Expose
    private String largeImageUrl;
    @SerializedName("maximum_image_url")
    @Expose
    private String maximumImageUrl;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getSmallImageUrl() {
        return smallImageUrl;
    }

    public void setSmallImageUrl(String smallImageUrl) {
        this.smallImageUrl = smallImageUrl;
    }

    public String getMediumImageUrl() {
        return mediumImageUrl;
    }

    public void setMediumImageUrl(String mediumImageUrl) {
        this.mediumImageUrl = mediumImageUrl;
    }

    public String getLargeImageUrl() {
        return largeImageUrl;
    }

    public void setLargeImageUrl(String largeImageUrl) {
        this.largeImageUrl = largeImageUrl;
    }

    public String getMaximumImageUrl() {
        return maximumImageUrl;
    }

    public void setMaximumImageUrl(String maximumImageUrl) {
        this.maximumImageUrl = maximumImageUrl;
    }

}
