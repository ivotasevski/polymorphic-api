package com.ivotasevski.polymorphic_api.runtime.converter;

import com.ivotasevski.polymorphic_api.api.dto.ResponseMetadata;
import com.ivotasevski.polymorphic_api.api.dto.client1.Client1ResponseMetadata;
import com.ivotasevski.polymorphic_api.api.dto.client2.Client2ResponseMetadata;
import com.ivotasevski.polymorphic_api.runtime.converter.client1.Client1MetadataConverter;
import com.ivotasevski.polymorphic_api.runtime.converter.client2.Client2MetadataConverter;
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
                Client1MetadataConverter.class,
                Client2MetadataConverter.class
        },
        subclassExhaustiveStrategy =
                SubclassExhaustiveStrategy.RUNTIME_EXCEPTION)
public interface MetadataConverter {

    @SubclassMapping(
            source = Client1Metadata.class,
            target = Client1ResponseMetadata.class
    )
    @SubclassMapping(
            source = Client2Metadata.class,
            target = Client2ResponseMetadata.class
    )
    ResponseMetadata convert(@NotNull Metadata source);
}