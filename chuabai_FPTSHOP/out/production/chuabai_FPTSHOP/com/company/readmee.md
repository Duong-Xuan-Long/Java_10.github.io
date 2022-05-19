
```
CREATE TABLE author(
id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
date_of_birth DATE NOT NULL,
birthplace TEXT ,
gender ENUM('male','female')
)

CREATE TABLE category(     
id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
name TEXT NOT NULL,
description TEXT 	
)

CREATE TABLE publisher ( 
id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
name TEXT NOT NULL,
phone_number INT,
email TEXT NOT NULL,
fax INT NOT NULL,
address TEXT NOT NULL
)

CREATE TABLE book(
 id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
 name TEXT NOT NULL,
 publication_year INT NOT NULL,
 image TEXT 
)

CREATE TABLE book_author( 
id_book INT,
id_author INT,
PRIMARY KEY(id_book,id_author),
FOREIGN KEY(id_book) REFERENCES book(id),
FOREIGN KEY(id_author) REFERENCES author(id)
)

CREATE TABLE book_publisher( 
id_book INT,
id_publisher INT,
PRIMARY KEY(id_book,id_publisher),
FOREIGN KEY(id_book) REFERENCES book(id),
FOREIGN KEY(id_publisher) REFERENCES publisher(id)
)

CREATE TABLE book_category( 
id_book INT,
id_category INT,
PRIMARY KEY(id_book,id_category),
FOREIGN KEY(id_book) REFERENCES book(id),
FOREIGN KEY(id_category) REFERENCES category(id)
)


```