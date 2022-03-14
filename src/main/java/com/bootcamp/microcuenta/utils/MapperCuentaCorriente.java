package com.bootcamp.microcuenta.utils;

import java.util.Date;

import com.bootcamp.microcuenta.dto.CuentaAhorroDto;
import com.bootcamp.microcuenta.dto.CuentaCorrienteDro;
import com.bootcamp.microcuenta.entity.Cuenta;

public class MapperCuentaCorriente {
	public CuentaCorrienteDro mapperDaoToDto( Cuenta cuenta ) {
		CuentaCorrienteDro cuentadto = new CuentaCorrienteDro();
		cuentadto.setId(cuenta.getId());
		cuentadto.setNumCuenta(cuenta.getNumCuenta());
		cuentadto.setComision(cuenta.getComision());
		cuentadto.setLimMovimiento(cuenta.getLimMovimiento());
		cuentadto.setFondo(cuenta.getFondo());
		cuentadto.setIdCliente(cuenta.getIdCliente());
		return cuentadto;
	}

	public Cuenta mapperDtoToDao(CuentaCorrienteDro cuentaAhorroDto) {
		Cuenta cuenta = new Cuenta();
		cuenta.setId(cuentaAhorroDto.getId());
		cuenta.setNumCuenta(cuentaAhorroDto.getNumCuenta());
		cuenta.setComision(cuentaAhorroDto.getComision());
		cuenta.setLimMovimiento(cuentaAhorroDto.getLimMovimiento());
		cuenta.setFondo(cuentaAhorroDto.getFondo());
		cuenta.setFechaApertura(new Date());
		cuenta.setTipo("CuentaCorriente");
		cuenta.setIdCliente(cuentaAhorroDto.getIdCliente());
		return cuenta;
	}
}
