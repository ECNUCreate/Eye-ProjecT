package com.example.renlvda.MyEye.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
/**
 * 项目名:  MyEye
 * 包名:    com.example.renlvda.MyEye.ui
 * 文件名:  BaseActivity
 * 创建者:  任律达
 * 创建时间:  2017/10/27 14:29
 * 描述:    Activity 基类
 */

/**
 *  主要做的事情：
 *  1.统一的属性
 *  2.统一的接口
 *  3.统一的方法
 */
public class BaseActivity extends AppCompatActivity{

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //显示返回键
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
    //菜单栏操作
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}
