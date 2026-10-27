package com.ivotasevski.polymorphic_api.runtime.repository;

import com.ivotasevski.polymorphic_api.runtime.entity.SampleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SampleRepository extends JpaRepository<SampleEntity, Long> {


}