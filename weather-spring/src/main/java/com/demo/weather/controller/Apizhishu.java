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
public class Apizhishu {
    @RequestMapping("zhishu")
    public String zhishu(String city) throws IOException{
        if (city==null){
            city="桂林";
        }
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://api.seniverse.com/v3/weather/alarm.json?key=SxVD-blA1NLmVCMYO&location=" + city)
                .build();
        Response response = client.newCall(request).execute();
        String data = response.body().string();
        return data;
    }
}
