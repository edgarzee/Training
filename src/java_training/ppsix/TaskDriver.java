package java_training.ppsix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaskDriver {
    public static void main(String[] args){
        List<Task> taskList = new ArrayList<>();

        Task task1 = new Task("Read a book");
        Task task2 = new Task("Clean the kitchen");
        Task task3 = new Task("Go to the gym");

        task1.setPriority(2);
        task2.setPriority(3);
        task3.setPriority(1);

        task1.setComplexity(3);
        task2.setComplexity(1);
        task3.setComplexity(2);

        taskList.add(task1);
        taskList.add(task2);
        taskList.add(task3);

        Collections.sort(taskList);

        for (Task task : taskList){
            displayTaskInfo(task);
        }
    }

    private static void displayTaskInfo(Task task){
        System.out.println("Task: " + task.getTaskName());
        System.out.println("Priority: " + task.getPriority());
        System.out.println("Complexity: " + task.getComplexity());
        System.out.println();
    }
}
