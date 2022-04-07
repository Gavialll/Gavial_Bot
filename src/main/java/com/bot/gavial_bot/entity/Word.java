package com.bot.gavial_bot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Word{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String english;
    private String ukraine;

    public Word() {}

    public String getEnglish() {
        return english;
    }

    public String getUkraine() {
        return ukraine;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Word{" + "id=" + id + ", english='" + english + '\'' + ", ukraine='" + ukraine + '\'' + '}';
    }
}
