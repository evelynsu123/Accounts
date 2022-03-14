package com.bootcamp.microcuenta.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.microcuenta.dto.CuentaCorrienteDro;
import com.bootcamp.microcuenta.entity.Cuenta;
import com.bootcamp.microcuenta.repository.ICuentaRepository;
import com.bootcamp.microcuenta.utils.MapperCuentaAhorro;
import com.bootcamp.microcuenta.utils.MapperCuentaCorriente;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CuentaCorrienteServiceImpl implements ICuentaCorrienteService {
	
	@Autowired
	private ICuentaRepository _cuentaRepo;

	@Override
	public Mono<CuentaCorrienteDro> save(CuentaCorrienteDro cuenta) {
		Cuenta cuentaSave =new MapperCuentaCorriente().mapperDtoToDao(cuenta);
		return _cuentaRepo.save(cuentaSave).map(c -> new MapperCuentaCorriente().mapperDaoToDto(c));
	}

	@Override
	public Mono<CuentaCorrienteDro> update(CuentaCorrienteDro cuenta) {
		Cuenta cuentaSave =new MapperCuentaCorriente().mapperDtoToDao(cuenta);
		return _cuentaRepo.save(cuentaSave).map(c -> new MapperCuentaCorriente().mapperDaoToDto(c));
	}

	@Override
	public Mono<Void> deleteById(String id) {
		return _cuentaRepo.deleteById(id);
	}

	@Override
	public Mono<CuentaCorrienteDro> findById(String id) {
		return _cuentaRepo.findById(id).map(c -> new MapperCuentaCorriente().mapperDaoToDto(c));
	}

	@Override
	public Flux<CuentaCorrienteDro> findAll() {
		return _cuentaRepo.findAll().map(c -> new MapperCuentaCorriente().mapperDaoToDto(c));
	}

}
