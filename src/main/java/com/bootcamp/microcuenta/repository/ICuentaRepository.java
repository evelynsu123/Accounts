package com.bootcamp.microcuenta.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.bootcamp.microcuenta.entity.Cuenta;

public interface ICuentaRepository extends ReactiveMongoRepository<Cuenta, String>{

}
