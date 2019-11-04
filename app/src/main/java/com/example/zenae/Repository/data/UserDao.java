package com.example.zenae.Repository.data;

import androidx.annotation.NonNull;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;


@Dao
public interface UserDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void createUser(User user);

    @Query("SELECT * FROM users")
    List<User> getAll();

    @Query("SELECT * FROM users WHERE name = :name")
    User getUser(@NonNull String name);
}
