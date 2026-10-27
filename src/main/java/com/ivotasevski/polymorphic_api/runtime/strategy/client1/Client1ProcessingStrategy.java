package com.ivotasevski.polymorphic_api.runtime.strategy.client1;

import com.ivotasevski.polymorphic_api.api.dto.ApiRequest;
import com.ivotasevski.polymorphic_api.api.dto.ApiResponse;
import com.ivotasevski.polymorphic_api.api.dto.client1.Client1RequestMetadata;
import com.ivotasevski.polymorphic_api.api.dto.client1.Client1ResponseMetadata;
import com.ivotasevski.polymorphic_api.runtime.strategy.ProcessingStrategy;


public class Client1ProcessingStrategy implements ProcessingStrategy {

    @Override
    public ApiRequest preProcess(ApiRequest apiRequest) {

        // Implement client1 specific pre-processing logic here
        // For example, you might want to validate the request in a specific way
        validate((Client1RequestMetadata) apiRequest.getMetadata());

        return apiRequest;
    }

    @Override
    public ApiResponse postprocess(ApiRequest apiRequest, ApiResponse apiResponse) {
        // Implement client1 specific post-processing logic here
        ((Client1ResponseMetadata) apiResponse.getMetadata()).setClient1PostProcessingData("Postprocessing added info");
        return apiResponse;
    }

    private void validate(Client1RequestMetadata metadata) {
        // always valid
    }

}
