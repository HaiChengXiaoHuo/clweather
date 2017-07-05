package com.example.clweather.gosn;

import com.google.gson.annotations.SerializedName;

/**
 * 创建时间：2017/7/4.
 * <p>
 * 类备注：时间地点
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Updata updata;

    public class Updata {
        @SerializedName("loc")
        public String UpdataTime;
    }
}
