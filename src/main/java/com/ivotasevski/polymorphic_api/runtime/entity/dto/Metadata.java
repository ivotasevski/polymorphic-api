package com.ivotasevski.polymorphic_api.runtime.entity.dto;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.ivotasevski.polymorphic_api.runtime.entity.dto.client1.Client1Metadata;
import com.ivotasevski.polymorphic_api.runtime.entity.dto.client2.Client2Metadata;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type"
)
@JsonSubTypes({
        @JsonSubTypes.Type(
                value = Client1Metadata.class,
                name = "CLIENT_1"
        ),
        @JsonSubTypes.Type(
                value = Client2Metadata.class,
                name = "CLIENT_2"
        )
})
public abstract class Metadata {
}
