package com.example.example4;

import android.content.Context;
import android.graphics.Color;
import android.preference.PreferenceCategory;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

//自定义PreferenceCategory类，可以设置PreferenceCategory的title的字体大小、颜色，控制大小写等。
public class MyPreferenceCategory extends PreferenceCategory {
    public MyPreferenceCategory(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    @Override
    protected void onBindView(View view) {
        super.onBindView(view);
        if (view instanceof TextView) {
            TextView tv = (TextView) view;
            tv.setTextSize(14);//设置title文本的字体大小
            tv.setAllCaps(false);//设置title文本不全为大写
            tv.setTextColor(Color.parseColor("#FF3399"));//设置title文本的颜色
        }
    }
}