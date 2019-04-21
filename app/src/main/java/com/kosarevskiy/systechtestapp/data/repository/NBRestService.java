package com.kosarevskiy.systechtestapp.data.repository;

import android.util.Log;

import com.kosarevskiy.systechtestapp.app.NbApi;
import com.kosarevskiy.systechtestapp.data.entity.EntityCurrency;
import com.kosarevskiy.systechtestapp.data.entity.ExcangeRatesEntity;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;

public class NBRestService {

    private NbApi mNbApi;

    //fixme error here

    @Inject
    public NBRestService(NbApi nbApi) {
        mNbApi = nbApi;
    }

    public Observable<ExcangeRatesEntity> getData (String date){
        return mNbApi.getData(date);
    }
}
