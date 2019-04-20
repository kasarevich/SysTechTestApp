package com.kosarevskiy.systechtestapp.di;

import com.kosarevskiy.systechtestapp.data.repository.NBRestService;
import com.kosarevskiy.systechtestapp.data.repository.WebRepository;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(includes = {RetrofitModule.class, ContextModule.class})
public class RepositoryModule {

    // fixme context ля сохранения в  бд             @INJECT WebRepository в конструктор Presenter
    @Provides
    @Singleton
    public WebRepository getWebRepository (NBRestService nbRestService){
        return new WebRepository(nbRestService);
    }
}
