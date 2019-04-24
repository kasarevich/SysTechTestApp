package com.kosarevskiy.systechtestapp.data.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.kosarevskiy.systechtestapp.data.entity.Currency;

@Database(entities = {Currency.class}, version = 1)
public abstract class RateDB extends RoomDatabase {
    public abstract CurrencyDao mCurrencyDao();
}
