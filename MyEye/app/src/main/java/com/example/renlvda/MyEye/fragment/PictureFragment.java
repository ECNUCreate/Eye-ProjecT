package com.example.renlvda.MyEye.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.renlvda.MyEye.R;

/**
 * 项目名:  MyEye
 * 包名:    com.example.renlvda.MyEye.fragment
 * 文件名:  PictureFragment
 * 创建者:  任律达
 * 创建时间:  2017/11/2 19:50
 * 描述:    图片协助
 */
public class PictureFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState) {
        View view = inflater.inflate(R.layout.fragment_picture, null);
        return view;
    }

}
