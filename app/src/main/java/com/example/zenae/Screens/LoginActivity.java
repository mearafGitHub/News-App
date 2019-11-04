package com.example.zenae.Screens;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.zenae.R;
import com.example.zenae.Repository.data.ZenaeDataBase;
import com.example.zenae.Screens.ZenaeHome.HomeActivity;
import com.example.zenae.framework.util.Const;

import butterknife.BindView;

public class LoginActivity extends AppCompatActivity {

    private static ZenaeDataBase db;

    @BindView(R.id.loginButton)
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        db = Room.databaseBuilder(
                this,
                ZenaeDataBase.class,
                Const.DATABASE_NAME
        ).allowMainThreadQueries()
                .build();

        loginButton =findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}
