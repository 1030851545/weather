package com.demo.weather.controller;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.io.IOException;

@RestController
@CrossOrigin(origins = "*",maxAge = 3600)
public class Apigood {
    @RequestMapping("good")
    public String abc(String city) throws IOException {
        if (city==null){
            city="桂林";
        }
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("http://restapi.amap.com/v3/weather/weatherInfo?key=71af18eda15bbfc8d9ae7b9352013908&extensions=all&city="+city)
                .build();
        Response response = client.newCall(request).execute();
        String data = response.body().string();
        return data;
    }
}
