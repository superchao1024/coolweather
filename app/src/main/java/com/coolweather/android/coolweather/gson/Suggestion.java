package com.coolweather.android.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 92828 on 2018/8/11.
 */

public class Suggestion {           //包含一些天气相关的生活建议

    @SerializedName("comf")
    public Comfort mComfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;


    public class Comfort{

        @SerializedName("txt")
        public String info;
    }
    public class CarWash{

        @SerializedName("txt")
        public String info;
    }
    public class Sport{

        @SerializedName("txt")
        public String info;
    }
}
