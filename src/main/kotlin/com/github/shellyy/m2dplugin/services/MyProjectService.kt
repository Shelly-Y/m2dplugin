package com.github.shellyy.m2dplugin.services

import com.intellij.openapi.project.Project
import com.github.shellyy.m2dplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
