package com.ivotasevski.polymorphic_api.runtime.strategy;

import com.ivotasevski.polymorphic_api.api.dto.ApiRequest;
import com.ivotasevski.polymorphic_api.api.dto.ApiResponse;

public interface ProcessingStrategy {

    ApiRequest preProcess(ApiRequest apiRequest);
    ApiResponse postprocess(ApiRequest apiRequest, ApiResponse apiResponse);
}
