package com.rev.workforce.service;

import com.rev.workforce.model.Leave;
import com.rev.workforce.model.LeaveStatus;
import com.rev.workforce.repository.LeaveRepository;
import com.rev.workforce.exception.LeaveNotAllowedException;
import com.rev.workforce.exception.InvalidOperationException;


import java.util.List;

public class LeaveService {

    private final LeaveRepository leaveRepository = new LeaveRepository();

    public void applyLeave(Leave leave) {
        if (leave == null) {
            throw new LeaveNotAllowedException("Leave cannot be null");
        }

        leaveRepository.applyLeave(leave);
    }

    public List<Leave> getLeavesForEmployee(int employeeId) {
        return leaveRepository.getLeavesByEmployee(employeeId);
    }

    public void cancelLeave(Leave leave) {
        if (leave.getStatus() != LeaveStatus.PENDING) {
            throw new InvalidOperationException("Only pending leaves can be cancelled");
        }

        leave.setStatus(LeaveStatus.CANCELLED);
        // update handled later if needed
    }
}
