package com.bootcamp.microcuenta.service;

import com.bootcamp.microcuenta.dto.CuentaAhorroDto;
import com.bootcamp.microcuenta.entity.Cuenta;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ICuentaAhorroService  {
	Mono<CuentaAhorroDto> save(CuentaAhorroDto cuenta);

	Mono<CuentaAhorroDto> update(CuentaAhorroDto cuenta);

	Mono<Void> deleteById(String id);

	Mono<CuentaAhorroDto> findById(String id);

	Flux<CuentaAhorroDto> findAll();
}
