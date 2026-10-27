package com.ivotasevski.polymorphic_api.runtime.converter.client1;

import com.ivotasevski.polymorphic_api.api.dto.client1.Client1RequestMetadata;
import com.ivotasevski.polymorphic_api.runtime.entity.dto.client1.Client1Metadata;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface Client1RequestMetadataConverter {
    Client1Metadata convertToEntityMetadata(Client1RequestMetadata source);
}
