USE qrk_db;

INSERT INTO author (id, first_name, last_name, sex, authors_birthday) VALUES (1, 'Carl', 'Spitteler', 'MALE', 18450424);
INSERT INTO author (id, first_name, last_name, sex, authors_birthday) VALUES (2, 'Robert', 'Heinlein', 'MALE', 19070707);
INSERT INTO author (id, first_name, last_name, sex, authors_birthday) VALUES (3, 'Hilary', 'Mantel', 'FEMALE', 19520706);

INSERT INTO book (id, title, isbn, genre) VALUES (1,'Olimpischer Fruhling', '9783846089590', 'POEM');
INSERT INTO book (id, title, isbn, genre) VALUES (2,'Starship Troopers', '9780441783588', 'NOVEL');
INSERT INTO book (id, title, isbn, genre) VALUES (3,'Double Star', '9780345330130', 'NOVEL');
INSERT INTO book (id, title, isbn, genre) VALUES (4,'Wolf Hall', '9785170706815', 'POETRY');
INSERT INTO book (id, title, isbn, genre) VALUES (5,'Bring Up the Bodies', '9785170791132', 'HISTORICAL');

INSERT INTO reward (id, `year`, title) VALUES (1, 1901, 'Nobelpriset I Litteratur');
INSERT INTO reward (id, `year`, title) VALUES (2, 1953, 'Hugo Award');
INSERT INTO reward (id, `year`, title) VALUES (3, 1969, 'Man Booker Prize');

INSERT INTO authors_books (book_id, author_id) VALUES (1, 1);
INSERT INTO authors_books (book_id, author_id) VALUES (2, 2);
INSERT INTO authors_books (book_id, author_id) VALUES (3, 2);
INSERT INTO authors_books (book_id, author_id) VALUES (4, 3);
INSERT INTO authors_books (book_id, author_id) VALUES (5, 3);

INSERT INTO authors_rewards (reward_id, author_id) VALUES (1, 1);
INSERT INTO authors_rewards (reward_id, author_id) VALUES (2, 2);
INSERT INTO authors_rewards (reward_id, author_id) VALUES (3, 3);

