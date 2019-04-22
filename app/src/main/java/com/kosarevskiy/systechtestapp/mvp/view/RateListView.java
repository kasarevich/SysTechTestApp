package com.kosarevskiy.systechtestapp.mvp.view;

import com.arellomobile.mvp.MvpView;
import com.arellomobile.mvp.viewstate.strategy.SkipStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType;

@StateStrategyType(SkipStrategy.class)
public interface RateListView extends MvpView {
    public void showProgress();
    public void hideProgress();
    public void showError();
    public void hideError();
    public void showRates();
    public void hideRates();
    public void showSettings();
    public void hideSettings();



}
