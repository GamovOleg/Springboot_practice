package com.springboot.test.model;

import com.springboot.test.Sex;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "author")
@Embeddable public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;

    @Enumerated(EnumType.STRING)
    private Sex sex;

    @ManyToMany(mappedBy = "authors")
    private List<Book> books = new ArrayList<Book>();

    @Column(name = "authors_birthday")
    private Date birthDate;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "authors_rewards",
            joinColumns = @JoinColumn(name = "author_id"),
            inverseJoinColumns = @JoinColumn(name = "reward_id"))
    @Embedded private List<Reward> rewards;

    public Author() {
    }

    public Author(/*long id,*/ String firstName, String lastName, Sex sex, List<Book> books, Date birthDate, List<Reward> rewards) {
//        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.books = books;
        this.birthDate = birthDate;
        this.rewards = rewards;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public List<Reward> getRewards() {
        return rewards;
    }

    public void setRewards(List<Reward> rewards) {
        this.rewards = rewards;
    }
//
//    @Override
//    public boolean equals(Object o) {
//
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Author author = (Author) o;
//
//        return /*Objects.equals(this.id, author.id)
//                && */Objects.equals(this.firstName, author.firstName)
//                && Objects.equals(this.lastName, author.lastName)
//                && Objects.equals(this.sex, author.sex)
////                && this.books.containsAll(author.books) && author.books.containsAll(this.books)
//                && Objects.equals(this.birthDate, author.birthDate)
//                && this.rewards.containsAll(author.rewards) && author.rewards.containsAll(this.rewards);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(/*this.id,*/ this.firstName, this.lastName, this.sex, this.books, this.birthDate, this.rewards);
//    }

}