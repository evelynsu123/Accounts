package com.bootcamp.microcuenta.utils;

import com.bootcamp.microcuenta.dto.CuentaAhorroDto;
import com.bootcamp.microcuenta.entity.Cuenta;
import java.util.Date;

public class MapperCuentaAhorro {
	
	public CuentaAhorroDto mapperDaoToDto( Cuenta cuenta ) {
		CuentaAhorroDto cuentadto = new CuentaAhorroDto();
		cuentadto.setId(cuenta.getId());
		cuentadto.setNumCuenta(cuenta.getNumCuenta());
		cuentadto.setComision(cuenta.getComision());
		cuentadto.setLimMovimiento(cuenta.getLimMovimiento());
		cuentadto.setFondo(cuenta.getFondo());
		cuentadto.setIdCliente(cuenta.getIdCliente());
		return cuentadto;
	}

	public Cuenta mapperDtoToDao(CuentaAhorroDto cuentaAhorroDto) {
		Cuenta cuenta = new Cuenta();
		cuenta.setId(cuentaAhorroDto.getId());
		cuenta.setNumCuenta(cuentaAhorroDto.getNumCuenta());
		cuenta.setComision(cuentaAhorroDto.getComision());
		cuenta.setLimMovimiento(cuentaAhorroDto.getLimMovimiento());
		cuenta.setFondo(cuentaAhorroDto.getFondo());
		cuenta.setFechaApertura(new Date());
		cuenta.setTipo("CuentaAhorro");
		cuenta.setIdCliente(cuentaAhorroDto.getIdCliente());
		return cuenta;
	}
}
