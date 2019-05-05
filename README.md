  Mainactivity.java

    package com.example.example4;
    import android.content.Context;
    import android.os.Bundle;
    import android.preference.CheckBoxPreference;
    import android.preference.Preference;
    import android.preference.PreferenceActivity;
    import android.preference.Preference.OnPreferenceChangeListener;
    import android.preference.Preference.OnPreferenceClickListener;
    import android.widget.Toast;
    public class MainActivity extends PreferenceActivity {

    Context mContext = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
    }
    }

  MyPreferenceCategory.java
  
    package com.example.example4;
    import android.content.Context;
    import android.graphics.Color;
    import android.preference.PreferenceCategory;
    import android.util.AttributeSet;
    import android.view.View;
    import android.widget.TextView;
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
    
  preferences.xml
  
    <?xml version="1.0" encoding="utf-8"?>
    <PreferenceScreen xmlns:android="http://schemas.android.com/apk/res/android" >
    <!--In-line preferences -->
    <com.example.example4.MyPreferenceCategory
        android:title="In-line preferences">
        <CheckBoxPreference android:key="checkbox_0"
            android:title="Checkbox preference"
            android:summary="This is a checkbox" >
        </CheckBoxPreference>
    </com.example.example4.MyPreferenceCategory>
    <!--Dialog-based preferences -->
    <com.example.example4.MyPreferenceCategory
        android:title="Dialog-based preferences">
        <EditTextPreference
            android:key="package_name_preference"
            android:title="Edit text preference"
            android:summary="An example that uses an edit text dialog"
            android:dialogTitle="Enter your favorite animal" />
        <ListPreference
            android:title="List preference" android:key="gender"
            android:summary="An example that uses a list dialog"
            android:dialogTitle="Choose one"
            android:entryValues="@array/gender_value_list"
            android:entries="@array/gender_name_list"/>
    </com.example.example4.MyPreferenceCategory>
    <!--Launch preferences -->
    <com.example.example4.MyPreferenceCategory
        android:title="Launch preferences">
        <PreferenceScreen
            android:key="screen_preference"
          android:title="Screen preference"
          android:summary="Shows another screen of preferences">
            <CheckBoxPreference android:key="checkbox_0"
                android:title="Toggle preference"
                android:summary="Preference that is on the next screen but same hierarchy" >
            </CheckBoxPreference>
        </PreferenceScreen>

        <PreferenceScreen
            android:title="Intent preference"
            android:summary="Launches an Activity from an intent" >
        <intent
        android:action="android.intent.action.VIEW"
        android:data="http://www.baidu.com"></intent>
        </PreferenceScreen>

    </com.example.example4.MyPreferenceCategory>
    <!--Preference attributes -->
    <com.example.example4.MyPreferenceCategory
        android:title="Preference attributes">
        <CheckBoxPreference
            android:key="parent_checkbox_preference"
            android:summary="This is visually parent"
            android:title="Parent checkbox preference" />
        <CheckBoxPreference
            android:dependency="parent_checkbox_preference"
            android:key="child_checkbox_preference"
            android:summary="This is visually a child"
            android:title="Child checkbox preference" />
    </com.example.example4.MyPreferenceCategory>
    </PreferenceScreen>

  结果截图：https://github.com/linyu0119/ExtendActivity/blob/master/images/1.png
  https://github.com/linyu0119/ExtendActivity/blob/master/images/2.png
  https://github.com/linyu0119/ExtendActivity/blob/master/images/3.png
  https://github.com/linyu0119/ExtendActivity/blob/master/images/4.png
  https://github.com/linyu0119/ExtendActivity/blob/master/images/5.png
  https://github.com/linyu0119/ExtendActivity/blob/master/images/6.png
