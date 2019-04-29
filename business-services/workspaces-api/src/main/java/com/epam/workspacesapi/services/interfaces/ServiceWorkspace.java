package com.epam.workspacesapi.services.interfaces;

import com.epam.commons.entity.Workspace;

import java.util.List;

public interface ServiceWorkspace {
    List<Workspace> findAll();
    Workspace add(Workspace workspace);
    void deleteById(String id);
    Workspace findById(String id);
    Workspace update(Workspace workspace);
}
