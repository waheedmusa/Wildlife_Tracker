CREATE DATABASE wildlife_tracker;
\c wildlife_tracker;
CREATE TABLE non_endangered (id SERIAL PRIMARY KEY, name VARCHAR, location VARCHAR, ranger VARCHAR);
CREATE TABLE endangered (id SERIAL PRIMARY KEY, name VARCHAR, health VARCHAR, age VARCHAR, location VARCHAR, ranger VARCHAR);
CREATE DATABASE wildlife_tracker_test WITH TEMPLATE wildlife_tracker;