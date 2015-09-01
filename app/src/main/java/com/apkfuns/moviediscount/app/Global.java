package com.apkfuns.moviediscount.app;

/**
 * Created by baidu on 15/8/23.
 */
public abstract class Global {

    // 时光网接口
    public static String M_TIME_HOST = "http://api.m.mtime.cn/";
    public static String API_HOT_MOVIE = M_TIME_HOST + "Showtime/LocationMovies.api";
    public static String API_GET_CITY = M_TIME_HOST + "GetCityByLongitudelatitude.api?longitude=%s&latitude=%s";
    public static String API_GET_CINEMA = M_TIME_HOST + "OnlineLocationCinema/OnlineCinemasByCity.api?locationId=%s";

}
