package ar.edu.unlam.pb2;

public abstract class Tarjeta {
	
	protected Long numero;
	protected String titular;
	protected String fecha_de_vencimiento;
	protected Integer codigo_de_seguridad;
	protected Integer CANTIDAD_DE_DIGITOS_DE_LA_TARJETA= 16;
	protected Double saldo;

	

	protected void setCodigo_de_seguridad(Integer codigo_de_seguridad) {
		this.codigo_de_seguridad= codigo_de_seguridad;
		
	}

	protected void setFecha_De_Vencimiento(String fecha_de_vencimiento) {
		this.fecha_de_vencimiento = fecha_de_vencimiento;
		
	}

	protected void setTitular(String titular) {
		this.titular = titular;
		
	}
	
	
	public Long getNumero() {
		return this.numero;
	}


	public String getTitular() {
		return this.titular;
	}


	public Integer getCodigoDeSeguridad() {
		return this.codigo_de_seguridad;
	}


	public Object getFechaDeVencimiento() {
		return this.fecha_de_vencimiento;
	}


	public abstract Double getSaldo();

	public void setSaldo(Double saldo) {
		this.saldo= saldo;

	}
	
	protected void setNumero(Long numero) throws NumeroDeTarjetaInvalidoException{
		if(numero.toString().length()!= CANTIDAD_DE_DIGITOS_DE_LA_TARJETA) {
			throw new NumeroDeTarjetaInvalidoException();
		}
		this.numero = numero;
	}
	
}
