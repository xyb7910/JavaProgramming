package com.simon.pojo;

import java.util.Date;

public class Blog {
    private String id;
    private String title;
    private String author;
    private Date createTime;
    private int views;

    @Override
    public String toString() {
        return "Blog{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", createTime=" + createTime +
                ", views=" + views +
                '}';
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public int getViews() {
        return views;
    }
}
