DROP TABLE IF EXISTS USER;

CREATE TABLE USER(
id INT AUTO_INCREMENT PRIMARY KEY,
first_name VARCHAR(250) NOT NULL,
last_name VARCHAR(250) NOT NULL,
email VARCHAR(250) NOT NULL
);


INSERT INTO USER(first_name, last_name,email) VALUES ('Tony', 'Stark','T.Stark@avengers.dom');


