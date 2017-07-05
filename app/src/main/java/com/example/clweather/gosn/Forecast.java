package com.example.clweather.gosn;

import com.google.gson.annotations.SerializedName;

/**
 * 创建时间：2017/7/4.
 * <p>
 * 类备注：每日天气
 */

public class Forecast {

    public String data;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature{
        public String max;
        public String min;
    }

    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
