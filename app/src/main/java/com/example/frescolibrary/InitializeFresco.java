package com.example.frescolibrary;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

public class InitializeFresco  extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);

    }
}
