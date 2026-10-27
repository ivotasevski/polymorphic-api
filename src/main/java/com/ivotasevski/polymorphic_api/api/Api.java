package com.ivotasevski.polymorphic_api.api;

import com.ivotasevski.polymorphic_api.api.dto.ApiRequest;
import com.ivotasevski.polymorphic_api.api.dto.ApiResponse;
import com.ivotasevski.polymorphic_api.runtime.service.RequestProcessingService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/polymorphic")
public class Api {

    private final RequestProcessingService requestProcessingService;

    @PostMapping
    public ApiResponse handleRequest(@RequestBody @Valid ApiRequest apiRequest) {
        return requestProcessingService.processRequest(apiRequest);
    }

    @GetMapping
    public List<ApiResponse> getAll() {
        return requestProcessingService.getAll();
    }

}
