package net.hiease.jeta;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;
import groovy.text.Template 
import groovy.text.SimpleTemplateEngine 
import java.io.File

class Person{ 
String age 
String fname 
String lname 
String toString(){ 
 return "Age: " + age + " First Name: " + fname + " Last Name: " + lname 
} 
}

class GreetingTask extends DefaultTask {
    String message = 'hello from GreetingTask'

    @TaskAction
    def greet() {
    def     pers1 = new Person(age:12, fname:"Sam", lname:"Covery") 
   def  fle = new File("person_report.tmpl") 
   def binding = ["p":pers1] 
   def engine = new SimpleTemplateEngine() 
   def template = engine.createTemplate(fle).make(binding) 
   println template.toString() 
    }
}
