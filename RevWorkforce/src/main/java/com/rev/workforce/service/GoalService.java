package com.rev.workforce.service;

import com.rev.workforce.model.Goal;
import com.rev.workforce.repository.GoalRepository;
import com.rev.workforce.exception.InvalidOperationException;


public class GoalService {

    private final GoalRepository goalRepository = new GoalRepository();

    public void addGoal(Goal goal) {
        if (goal == null) {
            throw new IllegalArgumentException("Goal cannot be null");
        }
        goalRepository.addGoal(goal);
    }

    public void updateProgress(Goal goal, int progress) {
        if (progress < 0 || progress > 100) {
            throw new InvalidOperationException("Progress must be between 0 and 100");
        }

        goal.setProgressPercentage(progress);
        goalRepository.addGoal(goal); // reuse save logic
    }
}
