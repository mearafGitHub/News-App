package com.example.zenae.Screens;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.zenae.R;
import com.example.zenae.Repository.data.User;
import com.example.zenae.Repository.data.ZenaeDataBase;
import com.example.zenae.Screens.ZenaeHome.HomeActivity;
import com.example.zenae.framework.base.BaseActivity;
import com.example.zenae.framework.util.Const;

import butterknife.BindView;

public class LoginActivity extends BaseActivity {

    private static ZenaeDataBase db;
    @BindView(R.id.usernameLogin)
    EditText username;
    @BindView(R.id.passwordLogin)
    EditText password;
    @BindView(R.id.loginButton)
    Button loginButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        db = Room.databaseBuilder(
                this,
                ZenaeDataBase.class,
                Const.DATABASE_NAME
        ).allowMainThreadQueries()
                .build();

        loginButton =findViewById(R.id.loginButton);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }

    public  void loginUser(){

        String usernameVal = username.getText().toString();
        String passwordVal = password.getText().toString();

        User localUser = db.userDao().getUser(usernameVal);


        if((localUser.name.equals(usernameVal)) && ((localUser.password.equals(passwordVal))) ){
            User user = new User(usernameVal, passwordVal);
            toast("You're logged in to Zenae!");

            startActivity(new Intent(LoginActivity.this, HomeActivity.class));
        }
        else{
            toast("Password didn't much.");
        }

    }
}
