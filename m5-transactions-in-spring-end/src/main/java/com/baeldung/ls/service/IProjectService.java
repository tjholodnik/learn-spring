package com.baeldung.ls.service;

import java.util.Optional;

import com.baeldung.ls.exception.TaskNotAddedException;
import com.baeldung.ls.persistence.model.Project;

public interface IProjectService {
    Iterable<Project> findAll();

    Optional<Project> findById(Long id);

    Project save(Project project);

    Project createProjectWithTasks() throws TaskNotAddedException;
}
