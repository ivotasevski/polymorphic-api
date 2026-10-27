package com.ivotasevski.polymorphic_api.api.dto.client1;

import com.ivotasevski.polymorphic_api.api.dto.ResponseMetadata;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Schema(description = "Client1ResponseMetadata")
public class Client1ResponseMetadata extends ResponseMetadata {
    private String client1SpecificData;
    private String client1PostProcessingData;
}
