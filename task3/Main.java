package midterm.luka_shamatava_1.task3;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        // Adding tasks with additional details
        taskManager.addTask("Task 1", "Description of Task 1", "Luka Shamatava", new Date(), "High");
        taskManager.addTask("Task 2", "Description of Task 2", "Nikoloz Smith", new Date(), "Medium");
        taskManager.addTask("Task 3", "Description of Task 3", "Alex Johnson", new Date(), "Low");

        // Displaying tasks
        List<Task> tasks = taskManager.getTasks();
        System.out.println("All Tasks:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println("Task " + (i + 1) + ":");
            System.out.println(tasks.get(i));
            System.out.println();
        }

        // Marking a task as completed
        taskManager.markTaskAsCompleted(1);

        // Displaying tasks after marking one as completed
        System.out.println("All Tasks after marking Task 2 as completed:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println("Task " + (i + 1) + ":");
            System.out.println(tasks.get(i));
            System.out.println();
        }

        // Removing a task by ID
        taskManager.removeTask(3);

        // Displaying tasks after removing a task
        System.out.println("All Tasks after removing Task 3:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println("Task " + (i + 1) + ":");
            System.out.println(tasks.get(i));
            System.out.println();
        }

        // Searching for a task by ID
        Task task = taskManager.getTaskById(2);
        if (task != null) {
            System.out.println("Task found by ID 2:");
            System.out.println(task);
        } else {
            System.out.println("Task with ID 2 not found.");
        }
    }
}

