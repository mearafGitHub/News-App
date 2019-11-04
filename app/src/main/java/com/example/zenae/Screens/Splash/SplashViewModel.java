package com.example.zenae.Screens.Splash;

import android.os.Handler;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SplashViewModel extends ViewModel {
    private MutableLiveData<Boolean> state;



    public SplashViewModel() {
        state = new MutableLiveData<>();
        start();
    }

    private void start() {
        Handler handler = new Handler();
        handler.postDelayed(() -> state.setValue(true), 4000);
    }

    public MutableLiveData<Boolean> getState() {
        return state;
    }
}
