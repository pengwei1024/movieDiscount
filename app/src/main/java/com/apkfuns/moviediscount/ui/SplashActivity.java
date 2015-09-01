package com.apkfuns.moviediscount.ui;

import android.os.Bundle;
import android.os.Handler;

import com.apkfuns.moviediscount.R;
import com.apkfuns.moviediscount.ui.base.BaseActivity;

/**
 * Created by baidu on 15/8/23.
 */
public class SplashActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                launcher();
            }
        }, 2000);
    }

    /**
     * 入口
     */
    private void launcher(){
        startActivity(MainActivity.class, true);
    }

    @Override
    public boolean showToolBar() {
        return false;
    }
}
