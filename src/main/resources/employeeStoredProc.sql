use student;
DELIMITER //
CREATE PROCEDURE getEmployeeDetails(IN firstName VARCHAR(50), IN lastName VARCHAR(50))
BEGIN
SELECT firstName, lastName, email FROM Employee WHERE firstName = firstName AND lastName = lastName;
END //
DELIMITER ;
