package com.kosarevskiy.systechtestapp.app;

import com.kosarevskiy.systechtestapp.MainActivity;
import com.kosarevskiy.systechtestapp.di.ContextModule;
import com.kosarevskiy.systechtestapp.di.RepositoryModule;
import com.kosarevskiy.systechtestapp.di.RetrofitModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component (modules = {RepositoryModule.class})
public interface AppComponent {

    void inject(MainActivity activity);
}
