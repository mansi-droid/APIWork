package com.example.apiwork.APIResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Registration {
    @SerializedName("success")
    @Expose
    private String success;

    @SerializedName("msg")
    @Expose
    private String msg;

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
