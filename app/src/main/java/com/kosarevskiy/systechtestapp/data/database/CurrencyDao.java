package com.kosarevskiy.systechtestapp.data.database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.kosarevskiy.systechtestapp.data.entity.Currency;

import java.util.LinkedList;
import java.util.List;

import io.reactivex.Observable;

@Dao
public interface CurrencyDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertCurrency(Currency currency);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertRates(Iterable<Currency> currencies);

    @Update(onConflict = OnConflictStrategy.REPLACE)
    void updateCurrency(Currency currency);

    @Update(onConflict = OnConflictStrategy.REPLACE)
    void updateRates(Iterable<Currency> currency);

    @Query("SELECT * FROM rates")
    Observable<List<Currency>> getAll();

    @Query("SELECT * FROM rates WHERE is_enable = 1 ORDER BY user_order")
    Observable<LinkedList<Currency>> getFiltered();

}
