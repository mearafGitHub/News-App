package com.example.zenae.Repository.data;

import androidx.annotation.NonNull;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;


@Dao
public interface NewsDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void addNews(List<News> news);

    @Query("SELECT * FROM news")
    List<News> getAll();

    @Query("SELECT * FROM news WHERE title = :title")
    News getOne(@NonNull String title);
}
