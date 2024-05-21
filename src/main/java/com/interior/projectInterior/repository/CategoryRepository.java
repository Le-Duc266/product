package com.interior.projectInterior.repository;

import com.interior.projectInterior.dto.response.CategoryResponse;
import com.interior.projectInterior.entity.CategoryEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
    @Query("select c.id,c.code,c.name,c.type,c.isActive from CategoryEntity c where c.id = ?1")
    CategoryEntity getById(Long id);

    List<CategoryEntity> findAllByIds(List<Long> ids);


    @Query("select new com.interior.projectInterior.dto.response.CategoryResponse" +
            "(c.id,c.code,c.name,c.type,c.isActive) from CategoryEntity c where (c.id IN :ids OR :ids = NULL)" +
            " or (c.name =:search OR :search = NULL)")
    Page<CategoryResponse> getAllCategory(String search,List<Long> ids ,Boolean isActive, Pageable pageable);
}
