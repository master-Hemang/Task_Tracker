package com.tasktracker.service;

import com.tasktracker.model.Task;
import com.tasktracker.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {
    private final TaskRepository taskRepository;

    public Task createTask(Task task) {
        task.setStatus(Task.TaskStatus.OPEN);
        return taskRepository.save(task);
    }

    public List<Task> getTasksByUser(Long userId) {
        return taskRepository.findByAssignedToId(userId);
    }

    public Task markAsCompleted(Long taskId) {
        Task task = taskRepository.findById(taskId).orElseThrow(() -> new RuntimeException("Task not found"));
        task.setStatus(Task.TaskStatus.COMPLETED);
        return taskRepository.save(task);
    }

    public List<Task> searchTasks(String keyword) {
        return taskRepository.findByTitleContainingIgnoreCaseOrDescriptionContainingIgnoreCase(keyword, keyword);
    }
}
