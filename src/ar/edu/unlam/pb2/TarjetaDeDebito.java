package ar.edu.unlam.pb2;

public class TarjetaDeDebito extends Tarjeta implements Pagadora {
	
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
		this.setCodigo_de_seguridad(codigo_de_seguridad);
		this.setSaldo(0.0);
	}

	@Override
	public Boolean pagar(Persona vendedor, Double importe) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public void setSaldo(Double saldo) {
		this.saldo= saldo;
	}

	@Override
	public Double getSaldo() {
		return this.saldo;
	}



}
