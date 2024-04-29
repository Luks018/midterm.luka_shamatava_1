package midterm.luka_shamatava_1.task3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;
    private int nextTaskId;

    public TaskManager() {
        this.tasks = new ArrayList<>();
        this.nextTaskId = 1; // Initialize the next task ID to 1
    }

    public void addTask(String title, String description, String assignee, Date dueDate, String priority) {
        Task task = new Task(nextTaskId++, title, description, assignee, dueDate, priority);
        tasks.add(task);
    }

    public void removeTask(int taskId) {
        Task taskToRemove = null;
        for (Task task : tasks) {
            if (task.getTaskId() == taskId) {
                taskToRemove = task;
                break;
            }
        }
        if (taskToRemove != null) {
            tasks.remove(taskToRemove);
        } else {
            System.out.println("Task with ID " + taskId + " not found.");
        }
    }

    public Task getTaskById(int taskId) {
        for (Task task : tasks) {
            if (task.getTaskId() == taskId) {
                return task;
            }
        }
        return null; // Task not found
    }

    public void markTaskAsCompleted(int taskId) {
        Task task = getTaskById(taskId);
        if (task != null) {
            task.markAsCompleted();
            System.out.println("Task with ID " + taskId + " marked as completed.");
        } else {
            System.out.println("Task with ID " + taskId + " not found.");
        }
    }



    public List<Task> getTasks() {
        return tasks;
    }
}
