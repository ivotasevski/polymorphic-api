package com.ivotasevski.polymorphic_api.api.dto.client2;

import com.ivotasevski.polymorphic_api.api.dto.RequestMetadata;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Schema(description = "Client2RequestMetadata")
public class Client2RequestMetadata extends RequestMetadata {

    @NotEmpty
    private String client2SpecificData;
}
