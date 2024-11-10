package com.edu.model;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    //Employee getEmployeeById(@Param("id") Integer id);

    List<Employee> findAll();

    Employee findById(Long id);

    void insert(Employee employee);

    void update(Employee employee);

    void delete(Long id);

    List<Employee> getEmployeesByAge();

    String getEmployeesByAgeFunction(int age);

    /*//@Select("{CALL student.getEmployeeDetails(#{firstName, mode=IN, jdbcType=VARCHAR}, #{lastName, mode=IN, jdbcType=VARCHAR})}")*/
    EmployeeDetails getEmployeeDetails(@Param("firstName") String firstName, @Param("lastName") String lastName);
}
