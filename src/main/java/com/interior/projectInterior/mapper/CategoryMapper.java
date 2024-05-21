package com.interior.projectInterior.mapper;

import com.interior.projectInterior.dto.request.CategoryRequest;
import com.interior.projectInterior.dto.response.CategoryResponse;
import com.interior.projectInterior.entity.CategoryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper
public interface CategoryMapper {
    CategoryEntity getByRequest(CategoryRequest categoryRequest);
    CategoryResponse getByEntity(CategoryEntity categoryEntity);
    void updateCategory(@MappingTarget CategoryEntity categoryEntity, CategoryRequest categoryRequest);
}
