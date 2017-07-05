package com.example.clweather.gosn;

import com.google.gson.annotations.SerializedName;

/**
 * 创建时间：2017/7/4.
 * <p>
 * 类备注：天气建议
 */

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort {
        @SerializedName("txt")
        public String info;
    }

    public class CarWash {
        @SerializedName("txt")
        public String info;
    }

    public class Sport {
        @SerializedName("txt")
        public String info;
    }
}
