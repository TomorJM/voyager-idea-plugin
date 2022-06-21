package com.github.tomorjm.voyagerideaplugin.services

import com.intellij.openapi.project.Project
import com.github.tomorjm.voyagerideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
