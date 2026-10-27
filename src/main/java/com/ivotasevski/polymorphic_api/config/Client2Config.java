package com.ivotasevski.polymorphic_api.config;

import com.ivotasevski.polymorphic_api.api.dto.client2.Client2RequestMetadata;
import com.ivotasevski.polymorphic_api.runtime.serialization.MetadataClassProvider;
import com.ivotasevski.polymorphic_api.runtime.strategy.ProcessingStrategy;
import com.ivotasevski.polymorphic_api.runtime.strategy.client2.Client2ProcessingStrategy;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(
        name = "app.client.id",
        havingValue = "CLIENT_2"
)
public class Client2Config {
    @Bean
    public MetadataClassProvider metadataClassProvider() {
        return () -> Client2RequestMetadata.class;
    }

    @Bean
    public ProcessingStrategy processingStrategy() {
        return new Client2ProcessingStrategy();
    }
}
