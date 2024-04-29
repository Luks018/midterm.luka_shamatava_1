package midterm.luka_shamatava_1.task3;

import java.util.Date;

public class Task {
    private int taskId;
    private String title;
    private String description;
    private String assignee;
    private Date dueDate;
    private boolean isCompleted;
    private String priority;

    public Task(int taskId, String title, String description, String assignee, Date dueDate, String priority) {
        this.taskId = taskId;
        this.title = title;
        this.description = description;
        this.assignee = assignee;
        this.dueDate = dueDate;
        this.isCompleted = false;
        this.priority = priority;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getAssignee() {
        return assignee;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public String getPriority() {
        return priority;
    }

    public void markAsCompleted() {
        this.isCompleted = true;
    }

    @Override
    public String toString() {
        return "Task ID: " + taskId + "\nTitle: " + title + "\nDescription: " + description +
                "\nAssignee: " + assignee + "\nDue Date: " + dueDate + "\nPriority: " + priority +
                "\nCompleted: " + isCompleted;
    }
}
