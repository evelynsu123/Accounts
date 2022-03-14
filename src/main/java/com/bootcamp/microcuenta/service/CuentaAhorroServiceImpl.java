package com.bootcamp.microcuenta.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.microcuenta.dto.CuentaAhorroDto;
import com.bootcamp.microcuenta.entity.Cuenta;
import com.bootcamp.microcuenta.repository.ICuentaRepository;
import com.bootcamp.microcuenta.utils.MapperCuentaAhorro;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CuentaAhorroServiceImpl implements ICuentaAhorroService {
	
	@Autowired
	private ICuentaRepository _cuentaRepo;

	@Override
	public Mono<CuentaAhorroDto> save(CuentaAhorroDto cuenta) {
		Cuenta cuentaSave =new MapperCuentaAhorro().mapperDtoToDao(cuenta);
		return _cuentaRepo.save(cuentaSave).map(c -> new MapperCuentaAhorro().mapperDaoToDto(c));
	}

	@Override
	public Mono<CuentaAhorroDto> update(CuentaAhorroDto cuenta) {
		Cuenta cuentaSave =new MapperCuentaAhorro().mapperDtoToDao(cuenta);
		return _cuentaRepo.save(cuentaSave).map(c -> new MapperCuentaAhorro().mapperDaoToDto(c));
	}

	@Override
	public Mono<Void> deleteById(String id) {
		return _cuentaRepo.deleteById(id);
	}

	@Override
	public Mono<CuentaAhorroDto> findById(String id) {
		return _cuentaRepo.findById(id).map(c -> new MapperCuentaAhorro().mapperDaoToDto(c));
	}

	@Override
	public Flux<CuentaAhorroDto> findAll() {
		return _cuentaRepo.findAll().map(c -> new MapperCuentaAhorro().mapperDaoToDto(c));
	}


}
