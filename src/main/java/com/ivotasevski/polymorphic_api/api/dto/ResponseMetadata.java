package com.ivotasevski.polymorphic_api.api.dto;

import com.ivotasevski.polymorphic_api.api.dto.client1.Client1ResponseMetadata;
import com.ivotasevski.polymorphic_api.api.dto.client2.Client2ResponseMetadata;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(
        description = "Request metadata",
        oneOf = {Client1ResponseMetadata.class, Client2ResponseMetadata.class}
)
public abstract class ResponseMetadata {
}
