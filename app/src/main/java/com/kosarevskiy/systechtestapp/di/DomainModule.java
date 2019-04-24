package com.kosarevskiy.systechtestapp.di;

import com.kosarevskiy.systechtestapp.data.database.CurrencyDao;
import com.kosarevskiy.systechtestapp.data.repository.Domain;
import com.kosarevskiy.systechtestapp.data.repository.NBRestService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(includes = {RetrofitModule.class, DBModule.class})
public class DomainModule {

    // fixme context ля сохранения в  бд             @INJECT Domain в конструктор Presenter
    @Provides
    @Singleton
    public Domain getDomain(NBRestService nbRestService, CurrencyDao currencyDao){
        return new Domain(nbRestService, currencyDao);
    }
}
