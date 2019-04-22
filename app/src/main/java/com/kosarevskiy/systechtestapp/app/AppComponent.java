package com.kosarevskiy.systechtestapp.app;

import com.kosarevskiy.systechtestapp.data.database.DBHelper;
import com.kosarevskiy.systechtestapp.di.DomainModule;
import com.kosarevskiy.systechtestapp.mvp.presenter.RateListPresenter;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component (modules = {DomainModule.class, DBHelper.class})
public interface AppComponent {

    void inject(RateListPresenter rateListPresenter);
}
