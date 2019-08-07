package com.techinstance.pcf.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techinstance.pcf.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{
	Task findByTitle(String title);
}
