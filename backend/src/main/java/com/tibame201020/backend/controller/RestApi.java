package com.tibame201020.backend.controller;

import com.tibame201020.backend.domain.EntityObj;
import com.tibame201020.backend.jpa.EntityObjJpa;
import com.tibame201020.backend.r2dbc.EntityObjR2dbc;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class RestApi {
    private final EntityObjJpa entityObjJpa;
    private final EntityObjR2dbc entityObjR2dbc;

    @RequestMapping("/jpa")
    public List<EntityObj> useJpa() {
        return entityObjJpa.findAll();
    }

    @RequestMapping("/r2dbc")
    public Flux<EntityObj> useR2dbc() {
        return entityObjR2dbc.findAll();
    }

}
