package com.example.renlvda.MyEye.application;

import android.app.Application;

import com.example.renlvda.MyEye.utils.StaticClass;
import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechUtility;
import com.tencent.bugly.crashreport.CrashReport;

import cn.bmob.v3.Bmob;

/**
 * 项目名:  MyEye
 * 包名:    com.example.renlvda.MyEye.application
 * 文件名:  BaseApplication
 * 创建者:  任律达
 * 创建时间:  2017/10/27 14:24
 * 描述:    Application
 */
public class BaseApplication extends Application{

    //创建
    @Override
    public void onCreate() {
        super.onCreate();
        //初始化Bugly
        CrashReport.initCrashReport(getApplicationContext(), StaticClass.BUGLY_APP_ID, true);
        //初始化Bmob
        Bmob.initialize(this,StaticClass.BMOB_APP_ID);
        //语音
        SpeechUtility.createUtility(getApplicationContext(), SpeechConstant.APPID +"="+StaticClass.VOICE_KEY);
    }
}
