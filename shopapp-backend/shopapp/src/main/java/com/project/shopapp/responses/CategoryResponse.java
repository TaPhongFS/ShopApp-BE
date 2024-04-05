package com.project.shopapp.responses;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.project.shopapp.models.Category;
import com.project.shopapp.models.Product;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoryResponse {
    @JsonProperty("message")
    private String message;

    @JsonProperty("errors")
    private List<String> errors;

    @JsonProperty("id")
    private Long id;

    @JsonProperty("name")
    private String name;

    public static CategoryResponse fromCategory(Category category) {
        CategoryResponse categoryResponse = CategoryResponse.builder()
                .id(category.getId())
                .name(category.getName())
                .build();
        return categoryResponse;
    }
}

