package com.ivotasevski.polymorphic_api.config;

import com.ivotasevski.polymorphic_api.api.dto.client1.Client1RequestMetadata;
import com.ivotasevski.polymorphic_api.runtime.serialization.MetadataClassProvider;
import com.ivotasevski.polymorphic_api.runtime.strategy.ProcessingStrategy;
import com.ivotasevski.polymorphic_api.runtime.strategy.client1.Client1ProcessingStrategy;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(
        name = "app.client.id",
        havingValue = "CLIENT_1"
)
public class Client1Config {

    @Bean
    public MetadataClassProvider metadataClassProvider() {
        return () -> Client1RequestMetadata.class;
    }

    @Bean
    public ProcessingStrategy processingStrategy() {
        return new Client1ProcessingStrategy();
    }


}
