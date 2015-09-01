package com.apkfuns.moviediscount.adapter;

import java.util.Arrays;
import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by pengwei08 on 2015/4/27.
 * 自定义适配器
 */
public abstract class CustomListAdapter<T> extends BaseAdapter {

    private Context context;
    private List<T> list;

    public CustomListAdapter(Context context, List<T> list) {
        this.context = context;
        this.list = list;
    }

    public CustomListAdapter(Context context, T[] array) {
        this.context = context;
        this.list = Arrays.asList(array);
    }

    /**
     * 获取List对象
     *
     * @return
     */
    public List<T> getList() {
        return list;
    }

    /**
     * 返回Context对象
     *
     * @return
     */
    protected Context getContext() {
        return context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(getLayoutRes(), null);
        }
        setView(position, convertView, parent, list.get(position));
        return convertView;
    }

    /**
     * 设置Item资源文件
     *
     * @return
     */
    public abstract int getLayoutRes();

    /**
     * 设置属性
     *
     * @param position
     * @param convertView
     * @param parent
     */
    public abstract void setView(int position, View convertView, ViewGroup parent, T object);
}
