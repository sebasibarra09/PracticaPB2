package ar.edu.unlam.pb2;

public class TarjetaDeCredito extends Tarjeta implements Pagadora {
	
	private Double limiteDeCompraEnPesos;
	private Double limiteDeCompraEnDolares;
	
	public TarjetaDeCredito(Long numero, String titular, String fechaDeVencimiento, Integer codigoDeSeguridad,
			Double limiteDeCompraEnPesos, Double limiteDeCompraEnDolares) throws NumeroDeTarjetaInvalidoException{
		this.setNumero(numero);
		this.setTitular(titular);
		this.setFecha_De_Vencimiento(fechaDeVencimiento);
		this.setCodigo_de_seguridad(codigoDeSeguridad);
		this.setLimiteDeCompraEnPesos(limiteDeCompraEnPesos);
		this.setLimiteDeCompraEnDolares(limiteDeCompraEnDolares);
		
		
	}
	
	@Override
	public Boolean pagar(Persona vendedor, Double importe) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getSaldo() {
		return null;
	}

	public Double getLimiteDeCompraEnPesos() {
		return limiteDeCompraEnPesos;
	}

	public void setLimiteDeCompraEnPesos(Double limiteDeCompraEnPesos) {
		this.limiteDeCompraEnPesos = limiteDeCompraEnPesos;
	}

	public Double getLimiteDeCompraEnDolares() {
		return limiteDeCompraEnDolares;
	}

	public void setLimiteDeCompraEnDolares(Double limiteDeCompraEnDolares) {
		this.limiteDeCompraEnDolares = limiteDeCompraEnDolares;
	}

	



}
