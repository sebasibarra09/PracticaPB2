package ar.edu.unlam.pb2;

public interface Transferible {

	Double getSaldo();
	void depositar(Double importe);
	Boolean extraer(Double importe);

}
