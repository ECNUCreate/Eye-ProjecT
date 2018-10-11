package com.example.renlvda.MyEye.view;

import android.app.Dialog;
import android.content.Context;
import android.view.Gravity;
import android.view.Window;
import android.view.WindowManager;

import com.example.renlvda.MyEye.R;

/**
 * 项目名:  MyEye
 * 包名:    com.example.renlvda.MyEye.view
 * 文件名:  CustomDialog
 * 创建者:  任律达
 * 创建时间:  2017/12/10 12:44
 * 描述:    自定义Dialog
 */
public class CustomDialog extends Dialog{
    //定义模板 1
    public CustomDialog(Context context,int layout,int style) {
        this(context,WindowManager.LayoutParams.MATCH_PARENT,
                WindowManager.LayoutParams.WRAP_CONTENT,layout,style, Gravity.CENTER);
    }

    //定义属性 2
    public CustomDialog(Context context,int width,int height,int layout,int style,int gravity,int anim){
        super(context,style);
        //设置属性
        setContentView(layout);
        Window window = getWindow();
        WindowManager.LayoutParams layoutParams = window.getAttributes();
        layoutParams.width = WindowManager.LayoutParams.MATCH_PARENT;
        layoutParams.height = WindowManager.LayoutParams.WRAP_CONTENT;
        layoutParams.gravity = gravity;
        window.setAttributes(layoutParams);
        window.setWindowAnimations(anim);
    }

    //实例
    public CustomDialog(Context context,int width,int height,int layout,int style,int gravity){
        /**
         * 注释：这个this引用的就是上面1的模板 调用的是上面2的属性
         *      这样的话就可以直接去引用了
         *      2017/6/6
         */
        this(context,width,height,layout,style,gravity,R.style.pop_anim_style);
    }
}
