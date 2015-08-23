/*
 * Copyright (C) 2015 Baidu, Inc. All Rights Reserved.
 */
package com.apkfuns.moviediscount.helper;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

/**
 * Created by pengwei08 on 2015/7/31.
 * json帮助类
 */
public class JsonHelper {
    private static Gson singeton;

    private JsonHelper() {

    }

    /**
     * 单例
     *
     * @return
     */
    public static Gson getInstance() {
        return singeton == null ? singeton = new Gson() : singeton;
    }

    /**
     * 解析json
     *
     * @param json
     * @param classOfT
     * @param <T>
     *
     * @return
     */
    public static <T> T fromJson(String json, Class<T> classOfT) {
        try {
            return getInstance().fromJson(json, classOfT);
        } catch (IllegalStateException | JsonSyntaxException e) {
            return null;
        }
    }

    /**
     * 对象转json
     *
     * @param src
     *
     * @return
     */
    public static String toJson(Object src) {
        return getInstance().toJson(src);
    }
}
