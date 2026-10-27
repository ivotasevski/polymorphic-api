package com.ivotasevski.polymorphic_api.runtime.converter;

import com.ivotasevski.polymorphic_api.api.dto.RequestMetadata;
import com.ivotasevski.polymorphic_api.api.dto.client1.Client1RequestMetadata;
import com.ivotasevski.polymorphic_api.api.dto.client2.Client2RequestMetadata;
import com.ivotasevski.polymorphic_api.runtime.converter.client1.Client1RequestMetadataConverter;
import com.ivotasevski.polymorphic_api.runtime.converter.client2.Client2RequestMetadataConverter;
import com.ivotasevski.polymorphic_api.runtime.entity.dto.Metadata;
import com.ivotasevski.polymorphic_api.runtime.entity.dto.client1.Client1Metadata;
import com.ivotasevski.polymorphic_api.runtime.entity.dto.client2.Client2Metadata;
import jakarta.validation.constraints.NotNull;
import org.mapstruct.Mapper;
import org.mapstruct.SubclassExhaustiveStrategy;
import org.mapstruct.SubclassMapping;

@Mapper(
        componentModel = "spring",
        uses = {
                Client1RequestMetadataConverter.class,
                Client2RequestMetadataConverter.class
        },
        subclassExhaustiveStrategy =
                SubclassExhaustiveStrategy.RUNTIME_EXCEPTION)
public interface RequestMetadataConverter {

    @SubclassMapping(
            source = Client1RequestMetadata.class,
            target = Client1Metadata.class
    )
    @SubclassMapping(
            source = Client2RequestMetadata.class,
            target = Client2Metadata.class
    )
    Metadata convert(@NotNull RequestMetadata source);
}