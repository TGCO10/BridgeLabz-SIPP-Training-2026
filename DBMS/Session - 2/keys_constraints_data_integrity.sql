-- Session 2: Keys, Constraints & Data Integrity


CREATE DATABASE IF NOT EXISTS covid_db;

USE covid_db;



-- Use Case 2: Foreign Key Relationship

CREATE TABLE countries
(
    country_id INT PRIMARY KEY,
    country_name VARCHAR(100) UNIQUE NOT NULL,
    continent VARCHAR(50)
);


-- Insert country data

INSERT INTO countries VALUES
(1,'India','Asia'),
(2,'USA','North America'),
(3,'UK','Europe'),
(4,'Brazil','South America');



-- COVID CASES TABLE

CREATE TABLE covid_cases
(
    country_id INT,
    Country VARCHAR(100) NOT NULL,
    Date DATE NOT NULL,

    Confirmed_Cases INT NOT NULL,

    Deaths INT,

    Recoveries INT DEFAULT 0,

    Last_Updated TIMESTAMP DEFAULT CURRENT_TIMESTAMP,


    -- Use Case 1:
    -- Composite Primary Key
    PRIMARY KEY(Country, Date),


    -- Use Case 3:
    -- Check Constraint
    CHECK(Deaths <= Confirmed_Cases),


    -- Use Case 2:
    -- Foreign Key
    FOREIGN KEY(country_id)
    REFERENCES countries(country_id)

);



-- Insert COVID Records:

INSERT INTO covid_cases
(country_id,Country,Date,Confirmed_Cases,Deaths)
VALUES

(1,'India','2026-01-01',100000,1200),

(2,'USA','2026-01-01',500000,5000),

(3,'UK','2026-01-01',200000,2000),

(4,'Brazil','2026-01-01',300000,4000);



-- Use Case 4:
-- DEFAULT VALUES
-- Recoveries automatically becomes 0
-- Last_Updated gets current timestamp


INSERT INTO covid_cases
(country_id,Country,Date,Confirmed_Cases,Deaths)
VALUES
(1,'India','2026-01-02',150000,1500);



SELECT * FROM covid_cases;


-- Use Case 5:
-- UNIQUE Constraint on Country + Date

ALTER TABLE covid_cases
ADD CONSTRAINT unique_country_date
UNIQUE(Country,Date);


INSERT INTO covid_cases
(country_id,Country,Date,Confirmed_Cases,Deaths)
VALUES
(1,'India','2026-01-01',200000,2000);


INSERT INTO covid_cases
(country_id,Country,Date,Confirmed_Cases,Deaths)
VALUES
(2,'USA','2026-01-05',1000,5000);


--View Final Data:
SELECT * FROM covid_cases;