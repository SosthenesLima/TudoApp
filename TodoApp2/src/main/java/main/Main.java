
package main;


import controller.ProjectController;
import controller.TaskController;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Project;
import model.Task;
import util.ConnectionFactory;


/**
 *
 * @author User
 */
public class Main {
    
    public static void main(String[] args){
        
        ProjectController projectController = new ProjectController();
        
        Project project = new Project();
        project.setName("Projeto Teste!");
        project.setDescription("description");
        projectController.save(project);
    }
    
}
