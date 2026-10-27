package com.ivotasevski.polymorphic_api.runtime.strategy.client2;

import com.ivotasevski.polymorphic_api.api.dto.ApiRequest;
import com.ivotasevski.polymorphic_api.api.dto.ApiResponse;
import com.ivotasevski.polymorphic_api.runtime.strategy.ProcessingStrategy;
import org.springframework.stereotype.Component;

@Component
public class Client2ProcessingStrategy implements ProcessingStrategy {

    @Override
    public ApiRequest preProcess(ApiRequest apiRequest) {
        // no op
        return apiRequest;
    }

    @Override
    public ApiResponse postprocess(ApiRequest apiRequest, ApiResponse apiResponse) {
        // no op
        return apiResponse;
    }
}
