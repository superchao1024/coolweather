package com.coolweather.android.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 92828 on 2018/8/11.
 */

public class Now {              //包含当前的天气信息

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;



    public class More{
        @SerializedName("txt")
        public String info;
    }
}
