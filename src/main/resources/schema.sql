use Student;
CREATE TABLE Employee (
                          id INT AUTO_INCREMENT PRIMARY KEY,
                          firstName VARCHAR(50) NOT NULL,
                          lastName VARCHAR(50) NOT NULL,
                          email VARCHAR(100) NOT NULL,
                          age INT NOT NULL
);


INSERT INTO Employee (firstName, lastName, email, age) VALUES
                                                           ('John', 'Doe', 'john.doe@example.com', 30),
                                                           ('Jane', 'Smith', 'jane.smith@example.com', 28),
                                                           ('Alice', 'Johnson', 'alice.johnson@example.com', 35),
                                                           ('Bob', 'Brown', 'bob.brown@example.com', 40),
                                                           ('Charlie', 'Davis', 'charlie.davis@example.com', 25),
                                                           ('Daniel', 'Evans', 'daniel.evans@example.com', 32),
                                                           ('Eva', 'Garcia', 'eva.garcia@example.com', 29),
                                                           ('Frank', 'Harris', 'frank.harris@example.com', 45),
                                                           ('Grace', 'Hill', 'grace.hill@example.com', 27),
                                                           ('Henry', 'Jones', 'henry.jones@example.com', 50),
                                                           ('Ivy', 'King', 'ivy.king@example.com', 33),
                                                           ('Jack', 'Lee', 'jack.lee@example.com', 22),
                                                           ('Karen', 'Martinez', 'karen.martinez@example.com', 31),
                                                           ('Leo', 'Moore', 'leo.moore@example.com', 39),
                                                           ('Mia', 'Parker', 'mia.parker@example.com', 24),
                                                           ('Nathan', 'Robinson', 'nathan.robinson@example.com', 37),
                                                           ('Olivia', 'Scott', 'olivia.scott@example.com', 26),
                                                           ('Paul', 'Taylor', 'paul.taylor@example.com', 41),
                                                           ('Quinn', 'Turner', 'quinn.turner@example.com', 34),
                                                           ('Rachel', 'Walker', 'rachel.walker@example.com', 38);

