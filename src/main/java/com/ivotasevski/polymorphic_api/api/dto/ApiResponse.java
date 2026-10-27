package com.ivotasevski.polymorphic_api.api.dto;

import lombok.Data;

@Data
public class ApiResponse {
    private String commonData;
    private ResponseMetadata metadata;
}
