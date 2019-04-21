package com.kosarevskiy.systechtestapp.app;

import com.kosarevskiy.systechtestapp.HomeActivity;
import com.kosarevskiy.systechtestapp.di.RepositoryModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component (modules = {RepositoryModule.class})
public interface AppComponent {

    void inject(HomeActivity activity);
}
