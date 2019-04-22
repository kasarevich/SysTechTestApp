package com.kosarevskiy.systechtestapp.mvp.screen;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.arellomobile.mvp.MvpAppCompatFragment;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.kosarevskiy.systechtestapp.R;
import com.kosarevskiy.systechtestapp.mvp.presenter.RateListPresenter;
import com.kosarevskiy.systechtestapp.mvp.view.RateListView;

public class RateListFragment  extends MvpAppCompatFragment implements RateListView {

    @InjectPresenter
    RateListPresenter mRateListPresenter;


    private SwipeRefreshLayout mSwipeRefreshLayout;
    private TextView mErrorText;
    private RecyclerView mRecyclerView;

    public static RateListFragment newInstance() {
        final RateListFragment fragment = new RateListFragment();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list_currencies, container, false);
        mErrorText = view.findViewById(R.id.fragment_list_no_rates);
        mSwipeRefreshLayout = view.findViewById(R.id.swipeContainer);
        mRecyclerView = view.findViewById(R.id.recycler);
        setHasOptionsMenu(true);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.tab_menu, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home: {
                getActivity().finish();
                break;
            }
            case R.id.action_setting:{
                mErrorText.setVisibility(View.VISIBLE);
                break;
            }
        }
        return true;
    }


    @Override
    public void onPrepareOptionsMenu(Menu menu) {
            menu.findItem(R.id.action_setting).setVisible(mErrorText.getVisibility() == View.GONE);
    }

    @Override
    public void showProgress() {
        mSwipeRefreshLayout.post(() -> mSwipeRefreshLayout.setRefreshing(true));
        mErrorText.setVisibility(View.VISIBLE);

        //fixme showList
    }

    @Override
    public void hideProgress() {
        mSwipeRefreshLayout.post(() -> mSwipeRefreshLayout.setRefreshing(false));
        mErrorText.setVisibility(View.VISIBLE);
    }

    @Override
    public void showError() {
        mErrorText.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideError() {
        mErrorText.setVisibility(View.GONE);
    }

    @Override
    public void showRates() {

    }

    @Override
    public void hideRates() {

    }

    @Override
    public void showSettings() {

    }

    @Override
    public void hideSettings() {

    }



}
