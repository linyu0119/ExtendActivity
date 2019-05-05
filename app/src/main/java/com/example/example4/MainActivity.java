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

        // 从资源文件中添Preferences ，选择的值将会自动保存到SharePreferences
        addPreferencesFromResource(R.xml.preferences);
    }
}