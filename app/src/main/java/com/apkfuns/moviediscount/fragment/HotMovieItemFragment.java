package com.apkfuns.moviediscount.fragment;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.apkfuns.moviediscount.R;
import com.apkfuns.moviediscount.fragment.base.BaseFragment;
import com.apkfuns.moviediscount.model.HotMovieObject;
import com.facebook.drawee.view.SimpleDraweeView;

/**
 * Created by baidu on 15/8/29.
 */
public class HotMovieItemFragment extends BaseFragment {

    private static final String HOT_MOVIE_OBJECT = "HOT_MOVIE_OBJECT";

    public static HotMovieItemFragment getInstance(HotMovieObject.MsEntity entity){
        HotMovieItemFragment fragment = new HotMovieItemFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable(HOT_MOVIE_OBJECT, entity);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        HotMovieObject.MsEntity entity = (HotMovieObject.MsEntity) getArguments().getSerializable(HOT_MOVIE_OBJECT);
        View rootView = inflater.inflate(R.layout.fragment_hot_movie_item, null);
        TextView movieName = (TextView) rootView.findViewById(R.id.movie_name);
        movieName.setText(entity.getTCn());
        SimpleDraweeView movieIcon = (SimpleDraweeView) rootView.findViewById(R.id.movie_icon);
        movieIcon.setImageURI(Uri.parse(entity.getImg()));
        return rootView;
    }
}
