package org.baticuisine.service;

import org.baticuisine.entities.Project;

import java.util.List;

public interface ProjectService {

    void addProject(Project project);

    List<Project> getAllProjects();

    Project getProjectById(int projectId);
}