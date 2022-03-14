package com.bootcamp.microcuenta.service;

import com.bootcamp.microcuenta.dto.CuentaPlazoFijoDto;
import com.bootcamp.microcuenta.entity.Cuenta;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ICuentaPlazoFijoService {
	Mono<CuentaPlazoFijoDto> save(CuentaPlazoFijoDto cuenta);

	Mono<CuentaPlazoFijoDto> update(CuentaPlazoFijoDto cuenta);

	Mono<Void> deleteById(String id);

	Mono<CuentaPlazoFijoDto> findById(String id);

	Flux<CuentaPlazoFijoDto> findAll();
}
