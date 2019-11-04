package com.example.zenae.Repository.data;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import org.joda.time.DateTime;

@Entity(tableName = "users")
public class User {

    @PrimaryKey
    @NonNull
    public String name;
    public String password;
    public String date;


    public User(String name, String password) {
        this.name = name;
        this.password = password;
        this.date = new DateTime().toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDate() {
        return date;
    }

    public void setDate() {
        this.date =  new DateTime().toString();
    }
}
