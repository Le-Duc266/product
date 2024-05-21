package com.interior.projectInterior.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CategoryRequest {
    @NotNull
    private String code;
    @NotNull
    private String name;
    private String type;
    private Boolean isActive;
}
