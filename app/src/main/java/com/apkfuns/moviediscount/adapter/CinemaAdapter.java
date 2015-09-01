package com.apkfuns.moviediscount.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.apkfuns.moviediscount.R;
import com.apkfuns.moviediscount.helper.ViewHolder;
import com.apkfuns.moviediscount.model.CinemaObject;

import java.util.List;

/**
 * Created by baidu on 15/9/1.
 */
public class CinemaAdapter extends  CustomListAdapter<CinemaObject>{
    public CinemaAdapter(Context context, List<CinemaObject> list) {
        super(context, list);
    }

    @Override
    public int getLayoutRes() {
        return R.layout.adapter_clinema;
    }

    @Override
    public void setView(int position, View convertView, ViewGroup parent, CinemaObject object) {
        TextView name = ViewHolder.get(convertView, R.id.name);
        name.setText(object.getCinameName());
    }
}
