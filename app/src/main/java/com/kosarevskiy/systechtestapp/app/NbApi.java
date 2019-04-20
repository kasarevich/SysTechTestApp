package com.kosarevskiy.systechtestapp.app;

import android.view.textclassifier.TextClassifier;

import com.kosarevskiy.systechtestapp.data.entity.EntityCurrency;
import com.kosarevskiy.systechtestapp.data.entity.ExcangeRatesEntity;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface NbApi {
    @GET("/Services/XmlExRates")
    Observable<ExcangeRatesEntity> getData() ;//fixme (@Query("ondate") String date);
}
