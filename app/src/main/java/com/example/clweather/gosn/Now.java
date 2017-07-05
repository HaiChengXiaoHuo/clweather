package com.example.clweather.gosn;

import com.google.gson.annotations.SerializedName;

/**
 * 创建时间：2017/7/4.
 * <p>
 * 类备注：天气情况
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
