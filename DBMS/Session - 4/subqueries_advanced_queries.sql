-- Session 4: Sub-queries & Advanced Queries


USE covid_db;

-- Additional Tables Required
CREATE TABLE covid_state_cases
(
    state VARCHAR(100),
    date DATE,
    confirmed_cases INT
);


-- Insert State Data for Correlated Sub-query
INSERT INTO covid_state_cases VALUES
('Mumbai','2026-01-01',5000),
('Mumbai','2026-01-02',7000),
('Mumbai','2026-01-03',6000),
('Delhi','2026-01-01',4000),
('Delhi','2026-01-02',8000);


-- Use Case 16:
-- Find Countries with Above-Average Death Counts
-- Scalar Sub-query
SELECT country,
death_count
FROM covid_deaths
WHERE death_count >
(
    SELECT AVG(death_count)
    FROM covid_deaths
);


-- Use Case 17:
-- Identify Countries Exceeding Case Threshold
-- IN Operator with Sub-query


SELECT Country,
Confirmed_Cases
FROM covid_cases
WHERE country_id IN
(
    SELECT country_id
    FROM covid_cases
    WHERE Confirmed_Cases > 1000000
);


-- Use Case 18:
-- Track COVID Waves - State-wise Analysis
-- Correlated Sub-query


SELECT 
c1.state,
c1.date,
c1.confirmed_cases,
CASE WHEN c1.confirmed_cases >=
(
    SELECT MAX(c2.confirmed_cases)
    FROM covid_state_cases c2
    WHERE c2.state = c1.state
)
THEN 'Peak Wave'
ELSE 'Normal'
END AS Wave_Status
FROM covid_state_cases c1;


-- Use Case 19:
-- Compare Vaccination Coverage
-- UNION Operation


SELECT country,
vaccinated_population AS population,
'Vaccinated' AS Status
FROM covid_vaccines
UNION



SELECT country,
(
    p.total_population - v.vaccinated_population
)
AS population,
'Unvaccinated' AS Status
FROM population p
INNER JOIN covid_vaccines v
ON p.country_id = v.country_id;



-- Use Case 20:
-- Find Countries Present in Deaths but Not Cases NOT IN Sub-query
SELECT country
FROM covid_deaths
WHERE country NOT IN
(
    SELECT country
    FROM covid_cases
);



-- Extra Practice Queries:

-- Highest death country
SELECT * FROM covid_deaths
WHERE death_count =
(
    SELECT MAX(death_count)
    FROM covid_deaths
);



-- Countries with confirmed cases above average
SELECT
Country,
Confirmed_Cases
FROM covid_cases
WHERE Confirmed_Cases >
(
    SELECT AVG(Confirmed_Cases)
    FROM covid_cases
);



-- Final Verification
SELECT * FROM covid_deaths;
SELECT * FROM covid_cases;
SELECT * FROM covid_state_cases;