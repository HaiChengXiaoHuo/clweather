package com.example.clweather.gosn;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 创建时间：2017/7/4.
 * <p>
 * 类备注：用于引用各个实体类的实体类
 */

public class Weather {

    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
