package com.codepractice.kelin;

import android.app.Application;
import android.content.Context;

import com.codepractice.kelin.hook.HookUtils;

public class KelinApplication extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        try {
            HookUtils.attachContext();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
