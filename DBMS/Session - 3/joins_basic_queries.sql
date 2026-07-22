-- Session 3: Joins & Basic Queries

USE covid_db;


-- Creating Additional Tables

-- COVID Deaths Table
CREATE TABLE covid_deaths
(
    country_id INT,
    country VARCHAR(100),
    death_count INT,

    FOREIGN KEY(country_id)
    REFERENCES countries(country_id)
);



-- Vaccination Table
CREATE TABLE covid_vaccines
(
    country_id INT,
    country VARCHAR(100),
    vaccinated_population INT,

    FOREIGN KEY(country_id)
    REFERENCES countries(country_id)
);



-- Population Table
CREATE TABLE population
(
    country_id INT PRIMARY KEY,
    country VARCHAR(100),
    total_population BIGINT,

    FOREIGN KEY(country_id)
    REFERENCES countries(country_id)
);



-- Continent Reference Table
CREATE TABLE continents
(
    continent_id INT PRIMARY KEY,
    continent_name VARCHAR(50)
);


-- Insert Sample Data
INSERT INTO covid_deaths VALUES
(1,'India',1200),
(2,'USA',5000),
(3,'UK',2000),
(4,'Brazil',4000);



INSERT INTO covid_vaccines VALUES
(1,'India',90000000),
(2,'USA',250000000),
(3,'UK',60000000);



INSERT INTO population VALUES
(1,'India',1400000000),
(2,'USA',330000000),
(3,'UK',67000000),
(4,'Brazil',210000000);



INSERT INTO continents VALUES
(1,'Asia'),
(2,'North America'),
(3,'Europe'),
(4,'South America');



-- Use Case 1:
-- Find Highest Confirmed Cases using INNER JOIN
SELECT 
    c.Country,
    c.Date,
    c.Confirmed_Cases
FROM covid_cases c
INNER JOIN countries co
ON c.country_id = co.country_id
WHERE c.Date='2026-01-01'
ORDER BY c.Confirmed_Cases DESC
LIMIT 1;


-- Use Case 2:
-- LEFT JOIN Deaths and Vaccination Data
-- Show countries even without vaccination data


SELECT
d.country,
d.death_count,
v.vaccinated_population
FROM covid_deaths d
LEFT JOIN covid_vaccines v
ON d.country_id = v.country_id;


-- Use Case 3:
-- Analyze Deaths by Continent
-- INNER JOIN + GROUP BY + SUM()


SELECT
co.continent,
SUM(cd.death_count) AS Total_Deaths
FROM covid_deaths cd
INNER JOIN countries c
ON cd.country_id = c.country_id
INNER JOIN continents co
ON c.continent = co.continent_name
GROUP BY co.continent;



-- Use Case 4:
-- Calculate Average New Deaths Per Day


SELECT Date,
AVG(Deaths) AS Average_Daily_Deaths
FROM covid_cases
GROUP BY Date
ORDER BY Date;



-- Use Case 5:
-- Find Countries with Highest Infection Rates
-- Formula: Infection Rate = (Confirmed Cases / Population) * 100
SELECT
c.Country,
c.Confirmed_Cases,
p.total_population,
(c.Confirmed_Cases / p.total_population) * 100
AS Infection_Rate
FROM covid_cases c
INNER JOIN population p
ON c.country_id = p.country_id
ORDER BY Infection_Rate DESC;


-- Final Data Checking
SELECT * FROM covid_cases;
SELECT * FROM covid_deaths;
SELECT * FROM covid_vaccines;
SELECT * FROM population;