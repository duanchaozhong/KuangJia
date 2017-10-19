package com.example.dell.kuang.DCZ_application;

import android.app.Application;
import android.content.Context;

/**
 * Created by DELL on 2017/10/19.
 */

public class MyApplication extends Application{
    private static Context context;
    public static Context getContext(){
        return context;
    }
}
