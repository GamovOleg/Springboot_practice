package com.springboot.test.model;

import javax.persistence.*;

@Entity
@Table(name = "reward")
@Embeddable public class Reward {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int year;
    private String title;

    public Reward() {
    }

    public Reward(long id, int year, String title) {

        this.id = id;
        this.year = year;
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

//    @Override
//    public boolean equals(Object o) {
//
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Reward reward = (Reward) o;
//
//        return /*Objects.equals(this.id, reward.id)
//                &&*/ Objects.equals(this.year, reward.year)
//                && Objects.equals(this.title, reward.title);
//    }
//
//    @Override
//    public int hashCode(){
//        return Objects.hash(/*this.id,*/ this.year, this.title);
//    }


}
