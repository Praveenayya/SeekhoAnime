
package com.example.seekhoanime.appPojoClasses.animechild;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Broadcast {

    @SerializedName("day")
    @Expose
    private String day;
    @SerializedName("time")
    @Expose
    private String time;
    @SerializedName("timezone")
    @Expose
    private String timezone;
    @SerializedName("string")
    @Expose
    private String string;

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

}
