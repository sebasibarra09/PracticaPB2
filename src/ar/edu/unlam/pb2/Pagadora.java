package ar.edu.unlam.pb2;

public interface Pagadora {

	Boolean pagar(Persona vendedor, Double importe);

	Long getNumero();

	String getTitular();

	Integer getCodigoDeSeguridad();

	Object getFechaDeVencimiento();

	Double getSaldo();

	void setSaldo(double d);
	
}
