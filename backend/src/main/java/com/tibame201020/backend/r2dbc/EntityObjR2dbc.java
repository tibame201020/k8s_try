package com.tibame201020.backend.r2dbc;

import com.tibame201020.backend.domain.EntityObj;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface EntityObjR2dbc extends R2dbcRepository<EntityObj, Long> {
}
