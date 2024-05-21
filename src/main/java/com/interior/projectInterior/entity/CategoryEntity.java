package com.interior.projectInterior.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.OffsetDateTime;

@Entity
@Table(name = "category")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CategoryEntity implements Serializable{
    @Id
    @GeneratedValue(generator = "category_id_seq")
    @SequenceGenerator(name = "category_id_seq", sequenceName = "category_id_seq")
    private Long id;
    private String code;
    private String name;
    private String type;
    private Boolean isActive;
    protected OffsetDateTime createdAt;
    protected OffsetDateTime updatedAt;
    protected Long createdBy;

}
