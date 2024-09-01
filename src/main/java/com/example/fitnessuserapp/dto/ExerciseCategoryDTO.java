package com.example.fitnessuserapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExerciseCategoryDTO {
    private Long id;
    private String categoryName;
}
