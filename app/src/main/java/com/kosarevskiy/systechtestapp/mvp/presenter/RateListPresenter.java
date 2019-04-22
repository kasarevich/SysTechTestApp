package com.kosarevskiy.systechtestapp.mvp.presenter;

import android.util.Log;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.kosarevskiy.systechtestapp.app.App;
import com.kosarevskiy.systechtestapp.data.entity.EntityCurrency;
import com.kosarevskiy.systechtestapp.data.entity.ExcangeRatesEntity;
import com.kosarevskiy.systechtestapp.data.repository.Domain;
import com.kosarevskiy.systechtestapp.mvp.view.RateListView;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

@InjectViewState
public class RateListPresenter extends MvpPresenter<RateListView> {


    @Inject
    Domain mDomain;


    @Override
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        App.getAppComponent().inject(this);
        loadRatelist();
        getViewState().showProgress();

    }


    private void loadRatelist(){
        getViewState().showProgress();

        mDomain.getRates("04.16.2019").subscribe(new Observer<ExcangeRatesEntity>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(ExcangeRatesEntity excangeRatesEntity) {
                Log.e("TAAG", "@@@@@@@@@@@@@@@" + excangeRatesEntity.getDate());
                for(EntityCurrency c: excangeRatesEntity.getEntityCurrencies()){
                    Log.e("TAAG", c.getName() + c.getScale() +c.getCharCode());
                }
            }

            @Override
            public void onError(Throwable e) {
                Log.e("TAAG", e.getMessage());
            }

            @Override
            public void onComplete() {
                    getViewState().hideProgress();
            }
        });


    }

}

/*

        mDomain.getRates("04.16.2019").subscribe(new Observer<ExcangeRatesEntity>() {
@Override
public void onSubscribe(Disposable d) {

        }

@Override
public void onNext(ExcangeRatesEntity excangeRatesEntity) {
        Log.e("TAAG", "@@@@@@@@@@@@@@@" + excangeRatesEntity.getDate());
        for(EntityCurrency c: excangeRatesEntity.getEntityCurrencies()){
        Log.e("TAAG", c.getName() + c.getScale() +c.getCharCode());
        }
        }

@Override
public void onError(Throwable e) {
        Log.e("TAAG", e.getMessage());
        }

@Override
public void onComplete() {

        }
        });*/
