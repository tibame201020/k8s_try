package com.tibame201020.backend.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import lombok.NoArgsConstructor;



import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "entity_obj")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EntityObj implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "create_time")
    private LocalDateTime createTime;
}
