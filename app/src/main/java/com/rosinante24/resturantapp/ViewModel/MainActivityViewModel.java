package com.rosinante24.resturantapp.ViewModel;

import android.arch.lifecycle.ViewModel;

import com.rosinante24.resturantapp.Filters;

/**
 * Created by Rosinante24 on 16/10/17.
 */

public class MainActivityViewModel extends ViewModel {
    private boolean mIsSigningIn;
    private Filters mFilters;

    public MainActivityViewModel() {
        mIsSigningIn = false;
        mFilters = Filters.getDefault();
    }

    public boolean getIsSigningIn() {
        return mIsSigningIn;
    }

    public void setIsSigningIn(boolean mIsSigningIn) {
        this.mIsSigningIn = mIsSigningIn;
    }

    public Filters getFilters() {
        return mFilters;
    }

    public void setFilters(Filters mFilters) {
        this.mFilters = mFilters;
    }
}
