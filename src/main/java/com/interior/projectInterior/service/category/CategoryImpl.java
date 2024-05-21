package com.interior.projectInterior.service.category;

import com.interior.projectInterior.dto.request.CategoryRequest;
import com.interior.projectInterior.dto.response.CategoryResponse;
import com.interior.projectInterior.entity.CategoryEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

public interface CategoryImpl {
  void createCategory(CategoryRequest request);
  void updateCategory(Long id, CategoryRequest request);
  void deleteCategory(Long id);
  CategoryResponse getDetailCategory(Long id);
  Page<CategoryResponse> getAllCategory(String search, List<Long> ids,Boolean isActive, Pageable pageable);
  Map<Long, CategoryEntity> getCategoryByIds(List<Long> ids);
}
