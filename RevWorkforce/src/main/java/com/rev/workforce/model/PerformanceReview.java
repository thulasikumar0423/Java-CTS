package com.rev.workforce.model;

public class PerformanceReview {

    private int reviewId;
    private Employee employee;
    private Employee manager;

    private String keyDeliverables;
    private String accomplishments;
    private String areasOfImprovement;

    private int selfRating;      // 1–5
    private int managerRating;   // 1–5

    private String managerFeedback;
    private PerformanceStatus status;

    public PerformanceReview() {
    }

    public PerformanceReview(int reviewId, Employee employee) {
        this.reviewId = reviewId;
        this.employee = employee;
        this.status = PerformanceStatus.DRAFT;
    }

    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public String getKeyDeliverables() {
        return keyDeliverables;
    }

    public void setKeyDeliverables(String keyDeliverables) {
        this.keyDeliverables = keyDeliverables;
    }

    public String getAccomplishments() {
        return accomplishments;
    }

    public void setAccomplishments(String accomplishments) {
        this.accomplishments = accomplishments;
    }

    public String getAreasOfImprovement() {
        return areasOfImprovement;
    }

    public void setAreasOfImprovement(String areasOfImprovement) {
        this.areasOfImprovement = areasOfImprovement;
    }

    public int getSelfRating() {
        return selfRating;
    }

    public void setSelfRating(int selfRating) {
        this.selfRating = selfRating;
    }

    public int getManagerRating() {
        return managerRating;
    }

    public void setManagerRating(int managerRating) {
        this.managerRating = managerRating;
    }

    public String getManagerFeedback() {
        return managerFeedback;
    }

    public void setManagerFeedback(String managerFeedback) {
        this.managerFeedback = managerFeedback;
    }

    public PerformanceStatus getStatus() {
        return status;
    }

    public void setStatus(PerformanceStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "PerformanceReview{" +
                "reviewId=" + reviewId +
                ", employee=" + employee.getName() +
                ", status=" + status +
                '}';
    }
}
