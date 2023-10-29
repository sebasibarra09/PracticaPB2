package ar.edu.unlam.pb2;

public class CuentaBancaria extends Cuenta implements Transferible {

	private String cbu;
	private final Integer LARGO_CBU=20;

	public CuentaBancaria(String cbu, String entidad, String titular) throws CBUInvalidoException {
		this.setCbu(cbu);
		this.entidad=entidad;
		this.titular=titular;
	}
	
	private void setCbu(String cbu) throws CBUInvalidoException {
		if(cbu.length()!=LARGO_CBU) {
			throw new CBUInvalidoException();
		}
		this.cbu=cbu;
	}

	@Override
	public String getNumero() {
		return this.cbu;
	}

	@Override
	public void depositar(Double importe) {
		// TODO Auto-generated method stub

	}

	@Override
	public Boolean extraer(Double importe) {
		// TODO Auto-generated method stub
		return null;
	}



}
