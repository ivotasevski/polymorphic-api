package com.ivotasevski.polymorphic_api.runtime.entity;

import com.ivotasevski.polymorphic_api.runtime.entity.dto.Metadata;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Entity
@Getter
@Setter
@Builder(toBuilder = true)
@Table(name = "sample")
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SampleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String data;

    @JdbcTypeCode(SqlTypes.JSON)
    @Column(name = "metadata", nullable = false, columnDefinition = "jsonb")
    private Metadata metadata;

}
