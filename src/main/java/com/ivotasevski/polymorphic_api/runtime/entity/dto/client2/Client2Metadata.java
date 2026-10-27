package com.ivotasevski.polymorphic_api.runtime.entity.dto.client2;

import com.ivotasevski.polymorphic_api.api.dto.RequestMetadata;
import com.ivotasevski.polymorphic_api.runtime.entity.dto.Metadata;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Client2Metadata extends Metadata {
    private final String type = "CLIENT_2";
    private String client2SpecificData;
}
