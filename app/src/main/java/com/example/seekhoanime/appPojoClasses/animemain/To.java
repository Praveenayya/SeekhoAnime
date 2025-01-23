
package com.example.seekhoanime.appPojoClasses.animemain;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class To {

    @SerializedName("day")
    @Expose
    private Object day;
    @SerializedName("month")
    @Expose
    private Object month;
    @SerializedName("year")
    @Expose
    private Object year;

    public Object getDay() {
        return day;
    }

    public void setDay(Object day) {
        this.day = day;
    }

    public Object getMonth() {
        return month;
    }

    public void setMonth(Object month) {
        this.month = month;
    }

    public Object getYear() {
        return year;
    }

    public void setYear(Object year) {
        this.year = year;
    }

}
