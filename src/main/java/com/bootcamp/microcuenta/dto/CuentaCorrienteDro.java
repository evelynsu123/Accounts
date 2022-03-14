package com.bootcamp.microcuenta.dto;

public class CuentaCorrienteDro {
	private String id;
	private String numCuenta;
	private Double Comision; 
	private int limMovimiento; 
	private Double fondo;
	private String idCliente;
	
	public CuentaCorrienteDro(String id, String numCuenta, Double comision, int limMovimiento, Double fondo,
			String idCliente) {
		super();
		this.id = id;
		this.numCuenta = numCuenta;
		Comision = comision;
		this.limMovimiento = limMovimiento;
		this.fondo = fondo;
		this.idCliente = idCliente;
	}
	public String getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}
	public CuentaCorrienteDro() {
		super();
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
	public Double getFondo() {
		return fondo;
	}
	public void setFondo(Double fondo) {
		this.fondo = fondo;
	}
	
}
