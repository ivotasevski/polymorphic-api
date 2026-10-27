package com.ivotasevski.polymorphic_api.api.dto;

import com.ivotasevski.polymorphic_api.api.dto.client1.Client1RequestMetadata;
import com.ivotasevski.polymorphic_api.api.dto.client2.Client2RequestMetadata;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(
        description = "Request metadata",
        oneOf = {Client1RequestMetadata.class, Client2RequestMetadata.class}
)
public abstract class RequestMetadata {
}
