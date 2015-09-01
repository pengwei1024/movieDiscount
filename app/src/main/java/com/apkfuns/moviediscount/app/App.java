package com.apkfuns.moviediscount.app;

import android.app.Application;

import com.apkfuns.logutils.LogUtils;
import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by baidu on 15/8/23.
 */
public class App extends Application {
    private static App singleton;

    @Override
    public void onCreate() {
        super.onCreate();
        singleton = this;

        // Fresco初始化
        Fresco.initialize(this);

        // 日志管理
        LogUtils.configAllowLog = true;
        LogUtils.configTagPrefix = "movie-";
    }

    public static App getInstance() {
        return singleton;
    }
}
