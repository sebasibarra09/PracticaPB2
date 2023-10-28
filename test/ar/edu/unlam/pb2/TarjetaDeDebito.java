package ar.edu.unlam.pb2;

public class TarjetaDeDebito implements Pagadora{
	
	private Long numero;
	private String titular;
	private String fechaDeVencimiento;
	private Integer codigoDeSeguridad;
	private Double saldo;
	final Integer CANTIDAD_DE_DIGITOS_DE_LA_TARJETA_DE_DEBITO =16;

	public TarjetaDeDebito(Long numero, String titular, String fechaDeVencimiento,
			Integer codigoDeSeguridad) throws NumeroDeTarjetaInvalidoException {
		this.setNumero(numero);
		this.setTitular(titular);
		this.setFechaDeVencimiento(fechaDeVencimiento);
		this.setCodigoDeSeguridad(codigoDeSeguridad);
		this.setSaldo(0.0);
		
	}
	
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public Boolean pagar(Persona vendedor, Double importe) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) throws NumeroDeTarjetaInvalidoException{
		if(numero.toString().length()!= CANTIDAD_DE_DIGITOS_DE_LA_TARJETA_DE_DEBITO) {
			throw new NumeroDeTarjetaInvalidoException();
		}
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	private void setTitular(String titular) {
		this.titular = titular;
	}

	public String getFechaDeVencimiento() {
		return fechaDeVencimiento;
	}

	public void setFechaDeVencimiento(String fechaDeVencimiento) {
		this.fechaDeVencimiento = fechaDeVencimiento;
	}

	public Integer getCodigoDeSeguridad() {
		return codigoDeSeguridad;
	}

	public void setCodigoDeSeguridad(Integer codigoDeSeguridad) {
		this.codigoDeSeguridad = codigoDeSeguridad;
	}

	public Double getSaldo() {
		return saldo;
	}

	@Override
	public void setSaldo(double saldo) {
		this.saldo = saldo;
		
	}

	
	
	
}
