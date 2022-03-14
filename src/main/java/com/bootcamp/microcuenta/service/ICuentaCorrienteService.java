package com.bootcamp.microcuenta.service;

import com.bootcamp.microcuenta.dto.CuentaCorrienteDro;
import com.bootcamp.microcuenta.entity.Cuenta;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ICuentaCorrienteService {
	Mono<CuentaCorrienteDro> save(CuentaCorrienteDro cuenta);

	Mono<CuentaCorrienteDro> update(CuentaCorrienteDro cuenta);

	Mono<Void> deleteById(String id);

	Mono<CuentaCorrienteDro> findById(String id);

	Flux<CuentaCorrienteDro> findAll();
}
