package com.example.zenae.Screens.Splash;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.zenae.MainActivity;
import com.example.zenae.R;
import com.example.zenae.Screens.SignUpActivity;
import com.example.zenae.Screens.ZenaeHome.HomeActivity;
import com.example.zenae.framework.base.BaseActivity;

public class SplashActivity extends BaseActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.splashContainer, new SplashFragment())
                .commit();

        startActivity(new Intent(this, SignUpActivity.class));
    }

}

