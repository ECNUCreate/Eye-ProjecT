package com.example.renlvda.MyEye.utils;

import android.util.Log;

/**
 * 项目名:  MyEye
 * 包名:    com.example.renlvda.MyEye.utils
 * 文件名:  L
 * 创建者:  任律达
 * 创建时间:  2017/11/3 15:56
 * 描述:    LOG 封装类
 */
public class L {

    //开关
    public static final boolean DEBUG = true;
    //TAG
    public static final String TAG = "MyEye";

    //五个等级 DIWE(F)(注：未定义F）

    public static void d(String text) {
        if (DEBUG) {
            Log.d(TAG, text);
        }
    }

    public static void i(String text) {
        if (DEBUG) {
            Log.i(TAG, text);
        }
    }

    public static void w(String text) {
        if (DEBUG) {
            Log.w(TAG, text);
        }
    }

    public static void e(String text) {
        if (DEBUG) {
            Log.e(TAG, text);
        }
    }
}
