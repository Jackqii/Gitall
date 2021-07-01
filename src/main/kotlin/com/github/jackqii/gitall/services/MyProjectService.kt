package com.github.jackqii.gitall.services

import com.github.jackqii.gitall.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
