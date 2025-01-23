
package com.example.seekhoanime.appPojoClasses.animemain;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AnimMain {

    @SerializedName("pagination")
    @Expose
    private Pagination pagination;
    @SerializedName("data")
    @Expose
    private List<Datum> data;

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

}
