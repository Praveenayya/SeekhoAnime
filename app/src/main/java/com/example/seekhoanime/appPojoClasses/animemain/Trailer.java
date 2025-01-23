
package com.example.seekhoanime.appPojoClasses.animemain;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Trailer {

    @SerializedName("youtube_id")
    @Expose
    private String youtubeId;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("embed_url")
    @Expose
    private String embedUrl;
    @SerializedName("images")
    @Expose
    private Images__1 images;

    public String getYoutubeId() {
        return youtubeId;
    }

    public void setYoutubeId(String youtubeId) {
        this.youtubeId = youtubeId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getEmbedUrl() {
        return embedUrl;
    }

    public void setEmbedUrl(String embedUrl) {
        this.embedUrl = embedUrl;
    }

    public Images__1 getImages() {
        return images;
    }

    public void setImages(Images__1 images) {
        this.images = images;
    }

}
