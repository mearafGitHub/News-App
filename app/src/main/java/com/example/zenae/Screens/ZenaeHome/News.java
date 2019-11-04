package com.example.zenae.Screens.ZenaeHome;

public class News {
    public String Title;
    public String brief;
    public String detail;
    public String publisher;
    public String date;
    public int newsImage;

    public News(String title, String brief, String detail, String publisher, String date, int newsImage) {
        Title = title;
        this.brief = brief;
        this.detail = detail;
        this.publisher = publisher;
        this.date = date;
        this.newsImage = newsImage;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
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
