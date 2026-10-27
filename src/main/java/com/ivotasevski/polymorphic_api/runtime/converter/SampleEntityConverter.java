package com.ivotasevski.polymorphic_api.runtime.converter;

import com.ivotasevski.polymorphic_api.api.dto.ApiRequest;
import com.ivotasevski.polymorphic_api.api.dto.ApiResponse;
import com.ivotasevski.polymorphic_api.runtime.entity.SampleEntity;
import jakarta.validation.constraints.NotNull;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.SubclassExhaustiveStrategy;

@Mapper(
        componentModel = "spring",
        uses = {
                MetadataConverter.class,
                RequestMetadataConverter.class
        },
        subclassExhaustiveStrategy =
                SubclassExhaustiveStrategy.RUNTIME_EXCEPTION)
public interface SampleEntityConverter {

    @Mapping(target = "data", source = "commonData")
    @Mapping(target = "metadata", source = "metadata")
    SampleEntity convert(@NotNull ApiRequest source);

    @Mapping(target = "commonData", source = "data")
    @Mapping(target = "metadata", source = "metadata")
    ApiResponse convert(@NotNull SampleEntity source);
}