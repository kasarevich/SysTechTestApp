package com.kosarevskiy.systechtestapp.di;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import com.kosarevskiy.systechtestapp.app.NbApi;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

@Module
public class RetrofitModule {

    @Provides
    @Singleton
    public Retrofit getRetrofit(){
        return new Retrofit.Builder()
                .baseUrl("http://www.nbrb.by")
                .addConverterFactory(SimpleXmlConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }

    @Provides
    @Singleton
    public NbApi getNbApi (Retrofit retrofit){
        return retrofit.create(NbApi.class);
    }

}
