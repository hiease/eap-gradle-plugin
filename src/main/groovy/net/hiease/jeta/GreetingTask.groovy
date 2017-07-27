package net.hiease.jeta;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

class GreetingTask extends DefaultTask {
    String message = 'hello from GreetingTask'
    final String template = "Dear ${message}";

    @TaskAction
    def greet() {
        println "Dear ${message}"
    }
}
