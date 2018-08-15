package com.coolweather.android.coolweather.gson;

/**
 * Created by 92828 on 2018/8/11.
 */

public class AQI {                  //包含当前空气质量的情况

    public AQICity city;

    public class AQICity{

        public String aqi;

        public String pm25;

    }

}
