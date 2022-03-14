package com.bootcamp.microcuenta.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.microcuenta.dto.CuentaPlazoFijoDto;
import com.bootcamp.microcuenta.entity.Cuenta;
import com.bootcamp.microcuenta.repository.ICuentaRepository;
import com.bootcamp.microcuenta.utils.MapperCuentaFijo;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CuentaPlazoFijoServiceImpl implements ICuentaPlazoFijoService {
	
	@Autowired
	private ICuentaRepository _cuentaRepo;

	@Override
	public Mono<CuentaPlazoFijoDto> save(CuentaPlazoFijoDto cuenta) {
		Cuenta cuentaSave =new MapperCuentaFijo().mapperDtoToDao(cuenta);
		return _cuentaRepo.save(cuentaSave).map(c -> new MapperCuentaFijo().mapperDaoToDto(c));
	}

	@Override
	public Mono<CuentaPlazoFijoDto> update(CuentaPlazoFijoDto cuenta) {
		Cuenta cuentaSave =new MapperCuentaFijo().mapperDtoToDao(cuenta);
		return _cuentaRepo.save(cuentaSave).map(c -> new MapperCuentaFijo().mapperDaoToDto(c));
	}

	@Override
	public Mono<Void> deleteById(String id) {
		return _cuentaRepo.deleteById(id);
	}

	@Override
	public Mono<CuentaPlazoFijoDto> findById(String id) {
		return _cuentaRepo.findById(id).map(c -> new MapperCuentaFijo().mapperDaoToDto(c));
	}

	@Override
	public Flux<CuentaPlazoFijoDto> findAll() {
		return _cuentaRepo.findAll().map(c -> new MapperCuentaFijo().mapperDaoToDto(c));
	}

}
