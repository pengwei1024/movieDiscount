package com.apkfuns.moviediscount.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.apkfuns.logutils.LogUtils;
import com.apkfuns.moviediscount.R;
import com.apkfuns.moviediscount.adapter.CinemaAdapter;
import com.apkfuns.moviediscount.adapter.HotMovieAdapter;
import com.apkfuns.moviediscount.app.Global;
import com.apkfuns.moviediscount.fragment.base.BaseFragment;
import com.apkfuns.moviediscount.helper.JsonHelper;
import com.apkfuns.moviediscount.model.CinemaObject;
import com.apkfuns.moviediscount.model.CityCodeObject;
import com.apkfuns.moviediscount.model.HotMovieObject;
import com.baidu.location.BDLocation;
import com.baidu.location.BDLocationListener;
import com.baidu.location.LocationClient;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by baidu on 15/8/23.
 */
public class MainFragment extends BaseFragment {
    private ViewPager viewPager;
    private ListView listView;
    private HotMovieAdapter adapter;
    private List<HotMovieObject.MsEntity> list = new ArrayList<>();
    public LocationClient mLocationClient;

    public static final int REQUEST_HOT_MOVIE = 1;
    public static final int REQUEST_ADDRESS_CODE = 2;
    public static final int REQUEST_NEAR_CINEMA = 3;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, null);
        viewPager = (ViewPager) rootView.findViewById(R.id.viewPager);
        listView = (ListView) rootView.findViewById(R.id.list);
        adapter = new HotMovieAdapter(getFragmentManager(), list);
        viewPager.setAdapter(adapter);
        getRequest(Global.API_HOT_MOVIE, null, REQUEST_HOT_MOVIE);
        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mLocationClient = new LocationClient(getActivity());
        mLocationClient.registerLocationListener(locationListener);
        mLocationClient.start();
    }

    @Override
    protected void onRequestCallBack(int requestCode, String result, boolean success) {
        LogUtils.d(result);
        if (success) {
            switch (requestCode) {
                case REQUEST_HOT_MOVIE:
                    HotMovieObject entity = JsonHelper.fromJson(result, HotMovieObject.class);
                    if (notNull(entity)) {
                        list.clear();
                        list.addAll(entity.getMs());
                        adapter.notifyDataSetChanged();
                    }
                    break;
                case REQUEST_ADDRESS_CODE:
                    CityCodeObject cityCodeObject = JsonHelper.fromJson(result, CityCodeObject.class);
                    if (notNull(cityCodeObject)) {
                        getRequest(String.format(Global.API_GET_CINEMA, cityCodeObject.getCityId()),
                                null, REQUEST_NEAR_CINEMA);
                    }
                    break;
                case REQUEST_NEAR_CINEMA:
                    List<CinemaObject> cinemaList = JsonHelper.getInstance().fromJson(result, new TypeToken<List<CinemaObject>>() {
                    }.getType());
                    listView.setAdapter(new CinemaAdapter(getActivity(), cinemaList));
                    break;
                default:
                    break;
            }
        } else {
            showToast("网络出现异常");
        }
    }

    private BDLocationListener locationListener = new BDLocationListener() {
        @Override
        public void onReceiveLocation(BDLocation bdLocation) {
            LogUtils.d("经度:%s,纬度:%s", bdLocation.getLatitude(), bdLocation.getLongitude());
            getRequest(String.format(Global.API_GET_CITY, bdLocation.getLongitude(),
                    bdLocation.getLatitude()), null, REQUEST_ADDRESS_CODE);
        }
    };
}
