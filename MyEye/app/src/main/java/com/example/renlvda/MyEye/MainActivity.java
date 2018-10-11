package com.example.renlvda.MyEye;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.renlvda.MyEye.fragment.PictureFragment;
import com.example.renlvda.MyEye.fragment.VideoFragment;
import com.example.renlvda.MyEye.fragment.CompanyFragment;
import com.example.renlvda.MyEye.fragment.UserFragment;
import com.example.renlvda.MyEye.ui.SettingActivity;

/**
 * 这里这一行应该是腾讯bugly的导入
 * 但是不知道为什么会有一点问题
 * 如果android studio在更新的时候这里一直报错
 * 解决方法：把下面这一行注释掉，等Gradle更新好之后再取消注释
 */

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //TabLayout
    private TabLayout mTabLayout;
    //ViewPager
    private ViewPager mViewPager;
    //Title
    private List<String> mTitle;
    //Fragment
    private List<Fragment> mFragment;
    //悬浮窗
    private FloatingActionButton feb_setting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //去掉阴影(设置阴影度为0）
        getSupportActionBar().setElevation(0);

        initData();
        initView();


    }
    //初始化数据
    private void initData() {
        mTitle = new ArrayList<>();
        mTitle.add("视频协助");
        mTitle.add("图片协助");
        mTitle.add("出行陪同");
        mTitle.add("个人中心");

        mFragment = new ArrayList<>();
        mFragment.add(new VideoFragment());
        mFragment.add(new PictureFragment());
        mFragment.add(new CompanyFragment());
        mFragment.add(new UserFragment());
    }
    //初始化View
    private void initView(){
        feb_setting = (FloatingActionButton) findViewById(R.id.fab_setting);
        feb_setting.setOnClickListener(this);
        //默认隐藏右下角设置按钮
        feb_setting.setVisibility(View.GONE);

        mTabLayout = (TabLayout)findViewById(R.id.mTabLayout);
        mViewPager = (ViewPager) findViewById(R.id.mViewPager);

        //预加载
        mViewPager.setOffscreenPageLimit(mFragment.size());

        //mViewPager滑动监听
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener(){
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels){

            }
            @Override
            public void onPageSelected(int position){
                Log.i("TAG","position "+position);
                if(position == 0){
                    feb_setting.setVisibility(View.GONE);
                }else{
                    feb_setting.setVisibility(View.VISIBLE);
                }
            }
            @Override
            public void onPageScrollStateChanged(int state){

            }
        });

        //设置适配器
        mViewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            //选中的item
            @Override
            public Fragment getItem(int position) {
                return mFragment.get(position);
            }
            //返回item的个数
            @Override
            public int getCount() {
                return mFragment.size();
            }
            //设置标题
            @Override
            public CharSequence getPageTitle(int position) {
                return mTitle.get(position);
            }
        });
        //绑定
        mTabLayout.setupWithViewPager(mViewPager);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.fab_setting:
                startActivity(new Intent(this, SettingActivity.class));
                break;
        }
    }
}
