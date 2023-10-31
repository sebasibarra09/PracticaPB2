 package ar.edu.unlam.pb2;

public interface Pagadora {

	Boolean pagar(Persona vendedor, Double importe);

	Long getNumero();

	String getTitular();

	Double getSaldo();

	void setSaldo(Double d);
	
}
