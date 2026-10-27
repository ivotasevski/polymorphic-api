package com.ivotasevski.polymorphic_api.api.dto.client1;

import com.ivotasevski.polymorphic_api.api.dto.RequestMetadata;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Schema(description = "Client1RequestMetadata")
public class Client1RequestMetadata extends RequestMetadata {

    @NotEmpty
    private String client1SpecificData;
}
