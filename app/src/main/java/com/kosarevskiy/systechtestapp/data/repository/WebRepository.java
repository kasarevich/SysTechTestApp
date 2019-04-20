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
        return mNBRestService.getData(date).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());} /*.map((ExcangeRatesEntity excangeRatesEntity) -> {

           List<Currency> currencies = new ArrayList<>();
           List<EntityCurrency> entities  = excangeRatesEntity.getEntityCurrencies();
           for (EntityCurrency e : entities){  Log.e("TAAG", "webrepo");
               String name = e.getName();
               String charCode = e.getCharCode();
               double rate;
               int scale;
               try {
                   rate = Double.parseDouble(e.getRate());
                   scale = Integer.parseInt(e.getScale());
               }catch (NumberFormatException ex){
                   continue;
               }
               if((!name.isEmpty()) && (!charCode.isEmpty())){
                   currencies.add(new Currency(scale, name, charCode, rate));
               }
           }
           return currencies;
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());            //fixme ынести в даггер
    }*/
}
