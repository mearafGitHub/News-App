package com.example.zenae.Repository.data;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import org.joda.time.DateTime;

@Entity(tableName = "news")
public class News {

    @PrimaryKey
    @NonNull
    public String title;
    public String brief;
    public String detail;
    public String publisher;
    public String date;
    public int newsImage;

    @Ignore
    public News(){

    }

    public News(String title, String brief, String detail, String publisher, int newsImage) {
        this.title = title;
        this.brief = brief;
        this.detail = detail;
        this.publisher = publisher;
        this.date = new DateTime().toString();
        this.newsImage = newsImage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        title = title;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getNewsImage() {
        return newsImage;
    }

    public void setNewsImage(int newsImage) {
        this.newsImage = newsImage;
    }
}
