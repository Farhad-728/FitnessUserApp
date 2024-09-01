package com.example.fitnessuserapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExerciseDTO {

    private Long id;
    private String name;
    private int duration;
    private int caloriesBurned;
    private ExerciseCategoryDTO category;
}
