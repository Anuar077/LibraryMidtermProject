CREATE TABLE library
(
    book_id      int AUTO_INCREMENT PRIMARY KEY,
    book_title   text,
    book_author  text,
    book_page    text,
    book_year     text
);
CREATE TABLE users
(
    user_id      int AUTO_INCREMENT PRIMARY KEY,
    user_login   text,
    user_password text,
    user_email    text,
    user_address  text
);