package com.epam.employeesapi.controllers;

import com.epam.commons.api.WorkspaceAPI;
import com.epam.commons.entity.Employee;
import com.epam.commons.entity.Workspace;
import com.epam.employeesapi.services.EmployeeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
@RequiredArgsConstructor
@Slf4j
public class EmployeeAPIController {

    private final EmployeeService employeeService;
    private final WorkspaceAPI workspaceAPIClient;

    @RequestMapping(value = "/{id}")
    public Workspace describeEmployee(@PathVariable("id") String id) {
        log.info("ID - " + id);
        Employee employee = employeeService.findById(id);
        log.info("Employee - " + employee);
        Workspace workspace = workspaceAPIClient.getWorkspaceById(employee.getWorkspaceId());
        log.info("Workspace - " + workspace);
        return workspace;
    }

}
