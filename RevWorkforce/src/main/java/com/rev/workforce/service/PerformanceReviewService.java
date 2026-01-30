package com.rev.workforce.service;

import com.rev.workforce.model.PerformanceReview;
import com.rev.workforce.model.PerformanceStatus;
import com.rev.workforce.repository.PerformanceReviewRepository;
import com.rev.workforce.exception.InvalidOperationException;


public class PerformanceReviewService {

    private final PerformanceReviewRepository repository = new PerformanceReviewRepository();

    public void submitReview(PerformanceReview review) {
        if (review == null) {
            throw new InvalidOperationException("Review cannot be null");
        }

        review.setStatus(PerformanceStatus.SUBMITTED);
        repository.saveReview(review);
    }

    public void reviewByManager(PerformanceReview review, int managerRating, String feedback) {
        review.setManagerRating(managerRating);
        review.setManagerFeedback(feedback);
        review.setStatus(PerformanceStatus.REVIEWED);
        repository.saveReview(review);
    }
}
