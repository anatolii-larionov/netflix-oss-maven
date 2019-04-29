package com.epam.workspacesapi.services;

import com.epam.commons.entity.Workspace;
import com.epam.workspacesapi.repository.WorkspaceDAO;
import com.epam.workspacesapi.services.interfaces.ServiceWorkspace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkplaceService implements ServiceWorkspace {

    @Autowired
    private WorkspaceDAO workspaceDAO;

    @Override
    public List<Workspace> findAll() {
        return workspaceDAO.findAll();
    }

    @Override
    public Workspace add(Workspace workspace) {
        return workspaceDAO.save(workspace);
    }

    @Override
    public void deleteById(String id) {
        workspaceDAO.deleteById(id);
    }

    @Override
    public Workspace findById(String id) {
        return workspaceDAO.getOne(id);
    }

    @Override
    public Workspace update(Workspace workspace) {
        return workspaceDAO.saveAndFlush(workspace);
    }

    /*private final List<Workspace> workspaces = Arrays.asList(
            new Workspace("0000001", 1, 1, randomUUID().toString(), WINDOWS),
            new Workspace("0000002", 1, 2, randomUUID().toString(), WINDOWS),
            new Workspace("0000003", 1, 3, randomUUID().toString(), WINDOWS),
            new Workspace("0000004", 1, 4, randomUUID().toString(), OSX),
            new Workspace("0000005", 1, 5, randomUUID().toString(), OSX),
            new Workspace("0000006", 1, 6, randomUUID().toString(), OSX),
            new Workspace("0000007", 1, 7, randomUUID().toString(), WINDOWS),
            new Workspace("0000008", 2, 1, randomUUID().toString(), WINDOWS),
            new Workspace("0000009", 2, 2, randomUUID().toString(), WINDOWS),
            new Workspace("0000010", 2, 3, randomUUID().toString(), OSX),
            new Workspace("0000011", 2, 4, randomUUID().toString(), OSX),
            new Workspace("0000012", 2, 5, randomUUID().toString(), WINDOWS),
            new Workspace("0000013", 2, 6, randomUUID().toString(), WINDOWS),
            new Workspace("0000014", 2, 7, randomUUID().toString(), LINUX),
            new Workspace("0000015", 2, 9, randomUUID().toString(), LINUX)
    );

    public Workspace findWorkspace(String id) {
        return workspaces.stream()
                .filter(w -> StringUtils.equals(w.getId(), id))
                .findFirst()
                .orElseThrow(() -> new NoWorkplaceFoundException(format("No workspace found with id: %s", id)));
    }*/
}
