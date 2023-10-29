package ar.edu.unlam.pb2;

public class TarjetaDeDebito implements Pagadora {
	
	public Long numero;
	public String titular;
	public String fecha_de_vencimiento;
	public Integer codigo_de_seguridad;
	public Integer CANTIDAD_DE_DIGITOS_DE_LA_TARJETA_DE_DEBITO = 16;
	public Double saldo;
	
	
	public TarjetaDeDebito(Long numero, String titular, String fecha_de_vencimiento, Integer codigo_de_seguridad) throws NumeroDeTarjetaInvalidoException {
		this.setNumero(numero);
		this.setTitular(titular);
		this.setFecha_De_Vencimiento(fecha_de_vencimiento);
		this.codigo_de_seguridad(codigo_de_seguridad);
		this.setSaldo(0.0);
	}



	private void codigo_de_seguridad(Integer codigo_de_seguridad) {
		this.codigo_de_seguridad= codigo_de_seguridad;
		
	}
	
	

	private void setFecha_De_Vencimiento(String fecha_de_vencimiento) {
		this.fecha_de_vencimiento = fecha_de_vencimiento;
		
	}

	private void setTitular(String titular) {
		this.titular = titular;
		
	}


	private void setNumero(Long numero) throws NumeroDeTarjetaInvalidoException{
		if(numero.toString().length()!= CANTIDAD_DE_DIGITOS_DE_LA_TARJETA_DE_DEBITO) {
			throw new NumeroDeTarjetaInvalidoException();
		}
		this.numero = numero;
	}


	@Override
	public Boolean pagar(Persona vendedor, Double importe) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long getNumero() {
		return this.numero;
	}

	@Override
	public String getTitular() {
		return this.titular;
	}

	@Override
	public Integer getCodigoDeSeguridad() {
		return this.codigo_de_seguridad;
	}

	@Override
	public Object getFechaDeVencimiento() {
		return this.fecha_de_vencimiento;
	}

	@Override
	public Double getSaldo() {
		return this.saldo;
	}

	@Override
	public void setSaldo(Double saldo) {
		this.saldo= saldo;

	}

}
