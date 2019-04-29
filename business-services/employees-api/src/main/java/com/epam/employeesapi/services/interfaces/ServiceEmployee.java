package com.epam.employeesapi.services.interfaces;

import com.epam.commons.entity.Employee;

import java.util.List;

public interface ServiceEmployee {

    List<Employee> findAll();
    Employee add(Employee employee);
    void deleteById(String id);
    Employee findById(String id);
    Employee update(Employee employee);
}
