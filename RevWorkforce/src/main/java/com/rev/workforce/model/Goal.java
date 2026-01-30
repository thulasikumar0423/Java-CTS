package com.rev.workforce.model;

import java.time.LocalDate;

public class Goal {

    private int goalId;
    private Employee employee;
    private String description;
    private LocalDate deadline;

    private GoalPriority priority;
    private int progressPercentage; // 0–100
    private String successMetrics;

    public Goal() {
    }

    public Goal(int goalId, Employee employee, String description) {
        this.goalId = goalId;
        this.employee = employee;
        this.description = description;
        this.progressPercentage = 0;
    }

    public int getGoalId() {
        return goalId;
    }

    public void setGoalId(int goalId) {
        this.goalId = goalId;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public GoalPriority getPriority() {
        return priority;
    }

    public void setPriority(GoalPriority priority) {
        this.priority = priority;
    }

    public int getProgressPercentage() {
        return progressPercentage;
    }

    public void setProgressPercentage(int progressPercentage) {
        this.progressPercentage = progressPercentage;
    }

    public String getSuccessMetrics() {
        return successMetrics;
    }

    public void setSuccessMetrics(String successMetrics) {
        this.successMetrics = successMetrics;
    }

    @Override
    public String toString() {
        return "Goal{" +
                "goalId=" + goalId +
                ", description='" + description + '\'' +
                ", progress=" + progressPercentage + "%" +
                '}';
    }
}
