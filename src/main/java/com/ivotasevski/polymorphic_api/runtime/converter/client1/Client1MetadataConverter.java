package com.ivotasevski.polymorphic_api.runtime.converter.client1;

import com.ivotasevski.polymorphic_api.api.dto.client1.Client1ResponseMetadata;
import com.ivotasevski.polymorphic_api.runtime.entity.dto.client1.Client1Metadata;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface Client1MetadataConverter {
    Client1ResponseMetadata convert(Client1Metadata source);
}
