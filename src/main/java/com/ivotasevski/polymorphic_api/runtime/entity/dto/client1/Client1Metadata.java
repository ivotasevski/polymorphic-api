package com.ivotasevski.polymorphic_api.runtime.entity.dto.client1;

import com.ivotasevski.polymorphic_api.api.dto.RequestMetadata;
import com.ivotasevski.polymorphic_api.runtime.entity.dto.Metadata;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Client1Metadata extends Metadata {
    private final String type = "CLIENT_1";
    private String client1SpecificData;
}
