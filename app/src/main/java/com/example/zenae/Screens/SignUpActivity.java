package com.example.zenae.Screens;

import androidx.annotation.NonNull;
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
import com.example.zenae.framework.base.BaseActivity;
import com.example.zenae.framework.util.Const;

import org.joda.time.DateTime;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SignUpActivity extends BaseActivity {

    private static ZenaeDataBase db;
    @BindView(R.id.signupButton)
    Button signupButton;

    @BindView(R.id.username)
    EditText username;

    @BindView(R.id.password)
    EditText password;

    @BindView(R.id.confirmedpassword)
    EditText confirmedpassword;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        ButterKnife.bind(this);
        signupButton = findViewById(R.id.signupButton);

        username = findViewById(R.id.username);

        password = findViewById(R.id.password);
        confirmedpassword = findViewById(R.id.confirmedpassword);

        db = Room.databaseBuilder(
                this,
                ZenaeDataBase.class,
                Const.DATABASE_NAME
        ).allowMainThreadQueries()
                .build();

        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createUser();
                Intent intent = new Intent(SignUpActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }

    public  void createUser(){

        String usernameVal = username.getText().toString();
        String passwordVal = password.getText().toString();
        String confirmPWVal = confirmedpassword.getText().toString();

        if(passwordVal.equals(confirmPWVal)){
            User user = new User(usernameVal, passwordVal);
            db.userDao().createUser(user);
            toast("Run saved!");
        }
        else{
            toast("Password didn't much.");
        }

    }

    public  void loginUser(){

    }
}
