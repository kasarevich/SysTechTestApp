package com.kosarevskiy.systechtestapp.di;

import com.kosarevskiy.systechtestapp.data.database.DBHelper;
import com.kosarevskiy.systechtestapp.data.repository.Domain;
import com.kosarevskiy.systechtestapp.data.repository.NBRestService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(includes = {RetrofitModule.class, DBHelper.class})
public class DomainModule {

    // fixme context ля сохранения в  бд             @INJECT Domain в конструктор Presenter
    @Provides
    @Singleton
    public Domain getDomain(NBRestService nbRestService, DBHelper dbHelper){
        return new Domain(nbRestService, dbHelper);
    }
}
