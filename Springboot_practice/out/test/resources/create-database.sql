CREATE DATABASE IF NOT EXISTS qrk_db CHARACTER SET utf8;

GRANT ALL PRIVILEGES ON qrk_db.* TO 'qrkuser'@'localhost' IDENTIFIED BY 'pass';

USE qrk_db;

CREATE TABLE author (
    id INTEGER NOT NULL PRIMARY KEY,
    firstName VARCHAR(45) NOT NULL,
    lastName VARCHAR(45) NOT NULL,
    sex VARCHAR(45) NOT NULL,
    books VARCHAR (45) REFERENCES book (id),
    birthDate DATE,
    rewards VARCHAR (45) REFERENCES reward (id)
    );

CREATE TABLE book (
    id INTEGER PRIMARY KEY NOT NULL,
    title VARCHAR(45) NOT NULL,
    isbn VARCHAR(45) NOT NULL,
    genre VARCHAR(45) NOT NULL,
    authors VARCHAR (45) REFERENCES author (id)
    );

CREATE TABLE reward (
    id INTEGER PRIMARY KEY NOT NULL,
    year INTEGER(10),
    title VARCHAR(45) NOT NULL
    );

CREATE TABLE books_author (
    book_id INTEGER NOT NULL,
    author_id INTEGER NOT NULL
    );

CREATE TABLE authors_reward (
    reward_id INTEGER NOT NULL,
    author_id INTEGER NOT NULL
    );



