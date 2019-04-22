package com.kosarevskiy.systechtestapp;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.kosarevskiy.systechtestapp.mvp.presenter.HomePresenter;
import com.kosarevskiy.systechtestapp.mvp.view.HomeView;

public class HomeActivity extends MvpAppCompatActivity implements HomeView {



    @InjectPresenter
    HomePresenter mHomePresenter;

    private Toolbar mToolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToolbar = findViewById(R.id.toolbar); //fixme butterknife
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
      //  App.getAppComponent().inject(this);// fixme to base
    }

    public void navigateToFragment (Fragment fragment){
        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
    }



/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.tab_menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home: {
                finish();
                break;
            }
            case R.id.action_setting:{
                item.setIcon(R.drawable.baseline_done_black_24dp);
                break;
            }
        }
        return true;
    }*/
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
