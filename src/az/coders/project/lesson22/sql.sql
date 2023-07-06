CREATE TABLE Customers (
  id SERIAL PRIMARY KEY,
  name VARCHAR(100),
  city VARCHAR(100)
);

CREATE TABLE Orders (
  id SERIAL PRIMARY KEY,
  customer_id INT REFERENCES Customers(id),
  amount DECIMAL(10,2),
  order_date DATE
);

INSERT INTO Customers (name, city)
VALUES ('John Doe', 'New York'),
       ('Jane Smith', 'Los Angeles'),
       ('David Lee', 'San Francisco'),
       ('Lisa Wong', 'Chicago'),
       ('Michael Chen', 'Houston');

INSERT INTO Orders (customer_id, amount, order_date)
VALUES (1, 500.00, '2023-01-01'),
       (2, 800.00, '2023-01-02'),
       (3, 300.00, '2023-01-02'),
       (1, 700.00, '2023-01-03'),
       (2, 600.00, '2023-01-04'),
       (3, 400.00, '2023-01-04');


CREATE VIEW CustomerTotalAmount AS
SELECT c.id AS CustomerID, c.name AS CustomerName, SUM(o.amount) AS TotalAmount
FROM customers c
JOIN orders o ON c.id = o.customer_id
GROUP BY c.id, c.name;

SELECT * FROM CustomerTotalAmount;

CREATE FUNCTION calculate_sum(num1 INT, num2 INT)
RETURNS INT
AS $$
DECLARE
  result INT;
BEGIN
  result := num1 + num2;
  RETURN result;
END;
$$ LANGUAGE plpgsql;

SELECT calculate_sum(5, 10);


CREATE OR REPLACE PROCEDURE insert_row(
  p_name VARCHAR(100),
  p_city VARCHAR(100)
)
AS $$
BEGIN
  INSERT INTO Customers (name, city)
  VALUES (p_name, p_city);
END;
$$ LANGUAGE plpgsql;