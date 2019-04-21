package com.kosarevskiy.systechtestapp;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
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

public class HomeActivity extends AppCompatActivity {


    @Inject
    WebRepository mWebRepository;


    private Toolbar mToolbar;
    private ImageButton mImageButton;
    private TextView mTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToolbar = findViewById(R.id.toolbar); //fixme butterknife

        setSupportActionBar(mToolbar);

        mTextView = mToolbar.findViewById(R.id.title_toolbar);
        mImageButton = mToolbar.findViewById(R.id.imageButtonBack);

        mTextView.setText("Курсы валют");
        mImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mImageButton.setImageResource(R.drawable.ic_build_black_48dp);
            }
        });

        App.getAppComponent().inject(this);// fixme to base

    }


}
/*

        mWebRepository.getRates("04.16.2019").subscribe(new Observer<ExcangeRatesEntity>() {
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
