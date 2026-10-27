package com.ivotasevski.polymorphic_api.api.dto.client2;

import com.ivotasevski.polymorphic_api.api.dto.ResponseMetadata;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Schema(description = "Client2ResponseMetadata")
public class Client2ResponseMetadata extends ResponseMetadata {
    private String client2SpecificData;
}
