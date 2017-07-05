package com.example.clweather.gosn;

/**
 * 创建时间：2017/7/4.
 * <p>
 * 类备注：pm2.5
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
