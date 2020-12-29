package com.baeldung.ls.service;

import com.baeldung.ls.exception.TaskNotSavedException;
import com.baeldung.ls.persistence.model.Task;

public interface ITaskService {

    Iterable<Task> findAll();

    Task save(Task task) throws TaskNotSavedException;
}
