
package com.example.seekhoanime.appPojoClasses.animemain;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Aired {

    @SerializedName("from")
    @Expose
    private String from;
    @SerializedName("to")
    @Expose
    private Object to;
    @SerializedName("prop")
    @Expose
    private Prop prop;
    @SerializedName("string")
    @Expose
    private String string;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public Object getTo() {
        return to;
    }

    public void setTo(Object to) {
        this.to = to;
    }

    public Prop getProp() {
        return prop;
    }

    public void setProp(Prop prop) {
        this.prop = prop;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

}
