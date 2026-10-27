package com.ivotasevski.polymorphic_api.api.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ApiRequest {

    @NotEmpty
    private String commonData;

    @Valid
    @NotNull(message = "Metadata is mandatory")
    private RequestMetadata metadata;
}
