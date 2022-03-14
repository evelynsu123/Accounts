package com.bootcamp.microcuenta.dto;

import java.util.Date;

public class CuentaPlazoFijoDto {
	private String id;
	private String numCuenta;
	private Double Comision; 
	private int limMovimiento;
	private Date fechaApertura;
	private Double fondo;
	private String idCliente;
	public CuentaPlazoFijoDto() {
		super();
	}
	
	public CuentaPlazoFijoDto(String id, String numCuenta, Double comision, int limMovimiento, Date fechaApertura,
			Double fondo, String idCliente) {
		super();
		this.id = id;
		this.numCuenta = numCuenta;
		Comision = comision;
		this.limMovimiento = limMovimiento;
		this.fechaApertura = fechaApertura;
		this.fondo = fondo;
		this.idCliente = idCliente;
	}

	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNumCuenta() {
		return numCuenta;
	}
	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}
	public Double getComision() {
		return Comision;
	}
	public void setComision(Double comision) {
		Comision = comision;
	}
	public int getLimMovimiento() {
		return limMovimiento;
	}
	public void setLimMovimiento(int limMovimiento) {
		this.limMovimiento = limMovimiento;
	}
	public Date getFechaApertura() {
		return fechaApertura;
	}
	public void setFechaApertura(Date fechaApertura) {
		this.fechaApertura = fechaApertura;
	}
	public Double getFondo() {
		return fondo;
	}
	public void setFondo(Double fondo) {
		this.fondo = fondo;
	}
	
}
