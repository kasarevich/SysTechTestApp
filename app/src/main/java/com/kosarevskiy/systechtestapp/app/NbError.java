package com.kosarevskiy.systechtestapp.app;

import okhttp3.ResponseBody;

public class NbError extends Throwable {
    public NbError(ResponseBody responseBody) {
        super(getMessage(responseBody));
    }
    private static String getMessage(ResponseBody responseBody){

        return "unknown";
    }

}
