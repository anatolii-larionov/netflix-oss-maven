package com.epam.workspacesapi.repository;

import com.epam.commons.entity.Workspace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkspaceDAO extends JpaRepository<Workspace, String> {
}
