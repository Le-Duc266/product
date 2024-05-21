package com.interior.projectInterior.service.category;

import com.interior.projectInterior.dto.request.CategoryRequest;
import com.interior.projectInterior.dto.response.CategoryResponse;
import com.interior.projectInterior.entity.CategoryEntity;
import com.interior.projectInterior.mapper.CategoryMapper;
import com.interior.projectInterior.repository.CategoryRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
@Slf4j
public class CategoryImplService implements CategoryImpl{
    private final CategoryRepository repository;
    private final CategoryMapper categoryMapper;

    @Override
    @Transactional
    public void createCategory(CategoryRequest request) {
        CategoryEntity entity = categoryMapper.getByRequest(request);
        repository.save(entity);
    }

    @Override
    @Transactional
    public void updateCategory(Long id, CategoryRequest request) {
        CategoryEntity entity = repository.getById(id);
        categoryMapper.updateCategory(entity,request);
        repository.save(entity);
    }

    @Override
    @Transactional
    public void deleteCategory(Long id) {
        CategoryEntity entity = repository.getById(id);
        repository.delete(entity);
    }

    @Override
    public CategoryResponse getDetailCategory(Long id) {
        CategoryEntity entity = repository.getById(id);
        return categoryMapper.getByEntity(entity);
    }

    @Override
    public Page<CategoryResponse> getAllCategory(String search,List<Long> ids ,Boolean isActive, Pageable pageable) {
        return null;
    }

    @Override
    public Map<Long, CategoryEntity> getCategoryByIds(List<Long> ids) {
        List<CategoryEntity> mapCategory = repository.findAllByIds(ids);
        return mapCategory.stream().collect(Collectors.toMap(CategoryEntity::getId, Function.identity()));
    }
}
