package com.kosarevskiy.systechtestapp.di;

import android.content.Context;

import com.kosarevskiy.systechtestapp.data.database.DBHelper;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(includes = ContextModule.class)
public class DBModule {
    @Provides
    @Singleton
    public DBHelper getDBHelper(Context context, String dbName, Integer dbVersion){
        return new DBHelper(context, dbName, dbVersion);
    }

    @Provides
    String getDatabaseName() {
        return "rates.db";
    }

    @Provides
    Integer getDatabaseVersion() {
        return 1;
    }

}
