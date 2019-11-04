package com.example.zenae.Repository.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;


@Database(
        entities = {News.class, User.class},
        version = 1
)
public abstract class ZenaeDataBase extends RoomDatabase {
    public abstract UserDao userDao();
    public abstract NewsDAO newsDao();
}
