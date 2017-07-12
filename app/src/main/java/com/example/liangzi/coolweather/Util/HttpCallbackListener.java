package com.example.liangzi.coolweather.Util;

/**
 * Created by liangzi on 2017/7/12.
 */

public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
