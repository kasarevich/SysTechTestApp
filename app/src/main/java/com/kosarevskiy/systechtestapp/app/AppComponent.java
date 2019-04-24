package com.kosarevskiy.systechtestapp.app;

import com.kosarevskiy.systechtestapp.di.DBModule;
import com.kosarevskiy.systechtestapp.di.DomainModule;
import com.kosarevskiy.systechtestapp.mvp.presenter.RateListPresenter;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component (modules = {DomainModule.class})
public interface AppComponent {

    void inject(RateListPresenter rateListPresenter);
}
