package com.example.uberappclone.Common;

import com.example.uberappclone.Remote.IGoogleAPI;
import com.example.uberappclone.Remote.RetrofitClient;

public class Common {
    public static final String baseURL = "https://maps.googleapis.com";

    public static IGoogleAPI getGoogleAPI() {

        return RetrofitClient.getClient(baseURL).create(IGoogleAPI.class);
    }

}
