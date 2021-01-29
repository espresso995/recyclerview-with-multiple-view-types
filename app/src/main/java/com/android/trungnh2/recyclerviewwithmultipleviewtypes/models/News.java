package com.android.trungnh2.recyclerviewwithmultipleviewtypes.models;

public class News {

    private String newTitle, news;

    public String getNewTitle() {
        return newTitle;
    }

    public String getNews() {
        return news;
    }

    public News(String newTitle, String news) {
        this.newTitle = newTitle;
        this.news = news;
    }
}
