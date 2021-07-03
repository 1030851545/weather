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
public class Apilife {
    @RequestMapping("life")
    public String abc(String city) throws IOException {
        if (city==null){
            city="101300501";
        }
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://devapi.qweather.com/v7/indices/1d?key=8bfd4beb76bc459fb3c3cc88ebe7d54b&type=1,3,10&location=101010100")
                .build();
        Response response = client.newCall(request).execute();
        String data = response.body().string();
        return data;
    }
}
