package com.example.meta.meta_test.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Post {
    @Id   
    @GeneratedValue
    private int id;

    private String title;
    private String content;

    public Post() {  }

    public Post(String title, String content) {
        this.setTitle(title);
        this.setContent(content);
    }

    public Post(int id, String title, String content) {
        this.setId(id);
        this.setTitle(title);
        this.setContent(content);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Post{" + "id =" + id + "title =" + title 
        + "Content =" + content + "}";
    }
}
