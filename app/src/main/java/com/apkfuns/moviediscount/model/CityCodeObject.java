package com.apkfuns.moviediscount.model;

/**
 * Created by baidu on 15/9/1.
 */
public class CityCodeObject {

    /**
     * cityId : 290
     * name : 北京
     * pinyinShort : bj
     */

    private int cityId;
    private String name;
    private String pinyinShort;

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPinyinShort(String pinyinShort) {
        this.pinyinShort = pinyinShort;
    }

    public int getCityId() {
        return cityId;
    }

    public String getName() {
        return name;
    }

    public String getPinyinShort() {
        return pinyinShort;
    }
}
