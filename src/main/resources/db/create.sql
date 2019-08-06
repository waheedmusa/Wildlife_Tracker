SET MODE PostgreSQL;

CREATE TABLE IF NOT EXISTS animals (
  id int PRIMARY KEY auto_increment,
  name VARCHAR,
  location VARCHAR,
  ranger VARCHAR
);

CREATE TABLE IF NOT EXISTS endangered (
  id int PRIMARY KEY auto_increment,
  name VARCHAR,
  health VARCHAR,
  age VARCHAR,
  location VARCHAR,
  ranger VARCHAR
);