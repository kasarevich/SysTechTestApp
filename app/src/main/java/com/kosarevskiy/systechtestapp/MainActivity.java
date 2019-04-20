package com.kosarevskiy.systechtestapp;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.kosarevskiy.systechtestapp.app.App;
import com.kosarevskiy.systechtestapp.data.entity.EntityCurrency;
import com.kosarevskiy.systechtestapp.data.entity.ExcangeRatesEntity;
import com.kosarevskiy.systechtestapp.data.repository.WebRepository;
import com.kosarevskiy.systechtestapp.mvp.model.Currency;

import org.reactivestreams.Subscription;

import java.util.List;
import java.util.Observable;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    TextView mTextView;

    @Inject
    WebRepository mWebRepository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = findViewById(R.id.text555);
        App.getAppComponent().inject(this);// fixme to base
        getData();

    }

    private void getData() {

        mWebRepository.getRates("af").subscribe(new Observer<ExcangeRatesEntity>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(ExcangeRatesEntity excangeRatesEntity) {
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
        });
    }
}
