package com.kosarevskiy.systechtestapp.mvp.presenter;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.kosarevskiy.systechtestapp.mvp.screen.RateListFragment;
import com.kosarevskiy.systechtestapp.mvp.view.HomeView;


@InjectViewState
public class HomePresenter extends MvpPresenter<HomeView> {


    @Override
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        getViewState().navigateToFragment(RateListFragment.newInstance());
    }
}
