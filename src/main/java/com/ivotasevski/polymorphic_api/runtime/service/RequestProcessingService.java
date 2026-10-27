package com.ivotasevski.polymorphic_api.runtime.service;

import com.ivotasevski.polymorphic_api.api.dto.ApiRequest;
import com.ivotasevski.polymorphic_api.api.dto.ApiResponse;
import com.ivotasevski.polymorphic_api.runtime.converter.SampleEntityConverter;
import com.ivotasevski.polymorphic_api.runtime.entity.SampleEntity;
import com.ivotasevski.polymorphic_api.runtime.repository.SampleRepository;
import com.ivotasevski.polymorphic_api.runtime.strategy.ProcessingStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RequestProcessingService {

    private final ProcessingStrategy processingStrategy;
    private final SampleEntityConverter sampleEntityConverter;
    private final SampleRepository sampleRepository;

    public ApiResponse processRequest(ApiRequest request) {
        ApiRequest preProcessedRequest = processingStrategy.preProcess(request);
        SampleEntity entity = sampleRepository.save(sampleEntityConverter.convert(preProcessedRequest));
        return processingStrategy.postprocess(preProcessedRequest, sampleEntityConverter.convert(entity));
    }

    public List<ApiResponse> getAll() {
        List<SampleEntity> entities = sampleRepository.findAll();
        return entities.stream()
                .map(sampleEntityConverter::convert)
                .toList();
    }
}
