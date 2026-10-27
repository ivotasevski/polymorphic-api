package com.ivotasevski.polymorphic_api.runtime.serialization;

import com.ivotasevski.polymorphic_api.api.dto.RequestMetadata;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.jackson.JacksonComponent;
import tools.jackson.core.JsonParser;
import tools.jackson.databind.DeserializationContext;
import tools.jackson.databind.ValueDeserializer;

@RequiredArgsConstructor
@JacksonComponent
public class MetadataDeserializer
        extends ValueDeserializer<RequestMetadata> {

    private final MetadataClassProvider metadataClassProvider;

    @Override
    public RequestMetadata deserialize(
            JsonParser parser,
            DeserializationContext context) {

        return context.readValue(
                parser,
                metadataClassProvider.targetClass()
        );
    }
}