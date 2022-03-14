package com.bootcamp.microcuenta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.microcuenta.dto.CuentaPlazoFijoDto;
import com.bootcamp.microcuenta.service.CuentaPlazoFijoServiceImpl;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("api/v1/fixed-account")
public class CuentaFijoController {

	@Autowired
	private CuentaPlazoFijoServiceImpl _cuentaService;
	
	@PostMapping
	public Mono<CuentaPlazoFijoDto> create(@RequestBody CuentaPlazoFijoDto cuenta){
		return _cuentaService.save(cuenta);
	}
	
	@PutMapping
	public Mono<CuentaPlazoFijoDto> update(@RequestBody CuentaPlazoFijoDto cuenta){
		return _cuentaService.update(cuenta);
	}
	
	@DeleteMapping("/{id}")
	public Mono<Void> deleteById(@PathVariable("id") String id){
		return _cuentaService.deleteById(id);
	}
	
	@GetMapping
	public Flux<CuentaPlazoFijoDto> getAll(){
		return _cuentaService.findAll();
	}
	
}
