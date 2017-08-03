package com.examole.coding.todoapp;

public class TaskNode {

    public String task;
    public boolean done;
    public String taskId;

    public TaskNode() {}

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        return taskId.equals(((TaskNode) obj).taskId);
    }

    @Override
    public String toString() {
        return task;
    }

    public TaskNode(String taskDescription, String id) {
        task = taskDescription;
        taskId = id;
        done = false;
    }
}
