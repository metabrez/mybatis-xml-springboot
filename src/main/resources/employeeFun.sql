use student;
DELIMITER //
CREATE FUNCTION getEmployeesByAgeFun(p_age INT)
    RETURNS JSON
    DETERMINISTIC
BEGIN
RETURN (SELECT JSON_ARRAYAGG(
                       JSON_OBJECT(
                               'id', id,
                               'firstName', firstName,
                               'lastName', lastName,
                               'email', email,
                               'age', age
                       )
               )
        FROM Employee
        WHERE age <= p_age);

END //

DELIMITER ;


Select  getEmployeesByAgeFun(25);