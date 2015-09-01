package com.apkfuns.moviediscount.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.apkfuns.moviediscount.fragment.HotMovieItemFragment;
import com.apkfuns.moviediscount.model.HotMovieObject;

import java.util.List;

/**
 * Created by baidu on 15/8/29.
 */
public class HotMovieAdapter extends FragmentPagerAdapter {
    protected List<HotMovieObject.MsEntity> list;

    public HotMovieAdapter(FragmentManager fm, List<HotMovieObject.MsEntity> list) {
        super(fm);
        this.list = list;
    }

    @Override
    public Fragment getItem(int position) {
        HotMovieObject.MsEntity entity = list.get(position);
        return HotMovieItemFragment.getInstance(entity);
    }

    @Override
    public int getCount() {
        return list.size();
    }
}
