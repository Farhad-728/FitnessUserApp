package com.example.fitnessuserapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExerciseCategoryRepository extends JpaRepository<ExerciseRepository, Long> {
}
