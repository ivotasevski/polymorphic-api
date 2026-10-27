package com.ivotasevski.polymorphic_api.runtime.converter.client2;

import com.ivotasevski.polymorphic_api.api.dto.client2.Client2ResponseMetadata;
import com.ivotasevski.polymorphic_api.runtime.entity.dto.client2.Client2Metadata;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface Client2MetadataConverter {
    Client2ResponseMetadata convert(Client2Metadata source);
}
