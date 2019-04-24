package com.epam.employeesapi.controllers;

import com.epam.commons.api.WorkspaceAPI;
import com.epam.commons.entity.Employee;
import com.epam.employeesapi.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.google.common.collect.Lists.newArrayList;

@RestController
@RequestMapping("/employees")
public class EmployeeAPIController {

    @Autowired
    EmployeeService employeeService;

    @Autowired
    WorkspaceAPI workspaceAPIClient;

    @RequestMapping(value = "{/id}")
    public Employee describeEmployee(@PathVariable("id") String id) {
        Employee employee = employeeService.findEmployee(id);
        //TODO: What the heck? I commented this line
        //return employee.setWorkspaceId(workspaceAPIClient.getWorkspaceById(employee.getId()));
        return employee;
    }
}
