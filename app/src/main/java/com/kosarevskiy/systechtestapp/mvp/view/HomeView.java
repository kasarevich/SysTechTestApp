package com.kosarevskiy.systechtestapp.mvp.view;

import android.support.v4.app.Fragment;

import com.arellomobile.mvp.MvpView;
import com.arellomobile.mvp.viewstate.strategy.SkipStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType;


@StateStrategyType(SkipStrategy.class)
public interface HomeView extends MvpView {
    public void navigateToFragment (Fragment fragment);
}
