package com.kosarevskiy.systechtestapp.data.repository;

import android.util.Log;

import com.kosarevskiy.systechtestapp.data.database.DBHelper;
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

public class Domain {
    private NBRestService mNBRestService;
    private DBHelper mDBHelper;

    @Inject
    public Domain(NBRestService NBRestService, DBHelper dbHelper) {
        mNBRestService = NBRestService;
        mDBHelper = dbHelper;
    }

    public Observable<ExcangeRatesEntity> getRates(String date){
        //FIXME DATAFORMAT
        return mNBRestService.getData(date).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());}

}
