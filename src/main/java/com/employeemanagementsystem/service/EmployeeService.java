package com.employeemanagementsystem.service;

import com.employeemanagementsystem.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmps();
    Employee getEmpById(int id);
    Employee storeEmp(Employee employee);
    Employee updateEmployee(Employee employee);
    void deleteEmp(int id);
}
