package com.kosarevskiy.systechtestapp.data.repository;

import android.util.Log;

import com.kosarevskiy.systechtestapp.data.database.CurrencyDao;
import com.kosarevskiy.systechtestapp.data.entity.Currency;
import com.kosarevskiy.systechtestapp.data.entity.EntityCurrency;
import com.kosarevskiy.systechtestapp.data.entity.ExcangeRatesEntity;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

import javax.inject.Inject;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

public class Domain {

/*    private static final String QUERY_DATE_FORMAT = "mm.dd.yyyy";
    private static final String UI_DATE_FORMAT = "dd.mm.yyyy";
    private static final long ONE_DAY = 1000*60*60*24;*/

    private NBRestService mNBRestService;
    private CurrencyDao mCurrencyDao;

/*    private String mTodayDate;
    private String mTomorrowsDate;
    private String mYestaerdayDate;
    private String mLastAvialableDate;*/

    @Inject
    public Domain(NBRestService NBRestService, CurrencyDao currencyDao) {
        mNBRestService = NBRestService;
        mCurrencyDao = currencyDao;
  //      initStringDates();
    }

    public Completable getRestRates(String date){
        return
    }








/*    private void initStringDates(){
        SimpleDateFormat sdf = new SimpleDateFormat(QUERY_DATE_FORMAT);
        mTodayDate = sdf.format(System.currentTimeMillis());
        mTomorrowsDate = sdf.format(System.currentTimeMillis() + ONE_DAY);
        mTomorrowsDate = sdf.format(System.currentTimeMillis() - ONE_DAY);
    }*/


}
