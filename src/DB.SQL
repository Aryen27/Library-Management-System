use lms;

create table users(id int primary key, username varchar(50), password varchar(50));

create table books(id INT PRIMARY KEY AUTO_INCREMENT, book_name VARCHAR(100), description VARCHAR(100), author VARCHAR(100), total_copies INT, available_copies INT);