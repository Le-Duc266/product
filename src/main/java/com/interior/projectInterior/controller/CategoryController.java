package com.interior.projectInterior.controller;

import com.interior.projectInterior.dto.response.CategoryResponse;
import com.interior.projectInterior.service.category.CategoryImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/account-config")
@RequiredArgsConstructor
@Tag(name = "Category")
public class CategoryController {

    private final CategoryImpl categoryImpl;

    @Operation(summary = "get detail category")
    @GetMapping
    public CategoryResponse getDetail(@RequestParam Long id) {
        return categoryImpl.getDetailCategory(id);
    }
}
