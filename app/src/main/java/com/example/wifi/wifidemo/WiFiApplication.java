package com.example.wifi.wifidemo;

import android.app.Application;
import android.util.Log;

public class WiFiApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("CSF_TAG","WiFiApplication：onCreate");
        WiFiHandler.instance().init(this);
    }
}
