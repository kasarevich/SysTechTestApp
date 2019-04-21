package com.kosarevskiy.systechtestapp.data.repository;

import android.util.Log;

import com.kosarevskiy.systechtestapp.data.entity.EntityCurrency;
import com.kosarevskiy.systechtestapp.data.entity.ExcangeRatesEntity;
import com.kosarevskiy.systechtestapp.mvp.model.Currency;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class WebRepository {
    private NBRestService mNBRestService;

    @Inject
    public WebRepository(NBRestService NBRestService) {
        mNBRestService = NBRestService;
    }

    public Observable<ExcangeRatesEntity> getRates(String date){
        //FIXME DATAFORMAT
        return mNBRestService.getData(date).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());}

}
