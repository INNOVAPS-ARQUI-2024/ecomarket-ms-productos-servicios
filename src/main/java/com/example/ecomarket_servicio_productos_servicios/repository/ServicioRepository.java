package com.example.ecomarket_servicio_productos_servicios.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.ecomarket_servicio_productos_servicios.model.Servicio;

public interface ServicioRepository extends MongoRepository<Servicio, String> {
}