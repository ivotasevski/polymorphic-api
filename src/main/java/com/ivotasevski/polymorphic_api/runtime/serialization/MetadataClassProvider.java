package com.ivotasevski.polymorphic_api.runtime.serialization;

import com.ivotasevski.polymorphic_api.api.dto.RequestMetadata;

public interface MetadataClassProvider {
    public Class<? extends RequestMetadata> targetClass();
}
