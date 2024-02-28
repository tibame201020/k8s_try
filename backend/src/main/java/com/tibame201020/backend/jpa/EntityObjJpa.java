package com.tibame201020.backend.jpa;

import com.tibame201020.backend.domain.EntityObj;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntityObjJpa extends JpaRepository<EntityObj, Long> {
}
