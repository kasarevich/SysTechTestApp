package com.kosarevskiy.systechtestapp.di;

import android.arch.persistence.room.Room;
import android.content.Context;

import com.kosarevskiy.systechtestapp.data.database.CurrencyDao;
import com.kosarevskiy.systechtestapp.data.database.RateDB;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(includes = ContextModule.class)
public class DBModule {
    @Provides
    @Singleton
    public RateDB getRateDB(Context context){
        return Room.databaseBuilder(context,
                RateDB.class, "RatesDatabase")
                .build();
    }

    @Provides
    @Singleton
    public CurrencyDao getCurrencyDao(RateDB rateDB){
        return rateDB.mCurrencyDao();
    }

}
