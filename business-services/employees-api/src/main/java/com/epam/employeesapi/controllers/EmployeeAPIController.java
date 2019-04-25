package com.epam.employeesapi.controllers;

import com.epam.commons.api.WorkspaceAPI;
import com.epam.commons.entity.Employee;
import com.epam.commons.entity.Workspace;
import com.epam.employeesapi.services.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
@RequiredArgsConstructor
public class EmployeeAPIController {

    private final EmployeeService employeeService;
    private final WorkspaceAPI workspaceAPIClient;

    @RequestMapping(value = "{/id}")
    public Workspace describeEmployee(@PathVariable("id") String id) {
        Employee employee = employeeService.findEmployee(id);
        return workspaceAPIClient.getWorkspaceById(employee.getWorkspaceId());
    }
}
