package bancario.modelo;

public class ContaSalario implements IConta{

	String numeroConta;
	String agencia;
	private float saldo;
	boolean status;
	String dataAbertura;
	
	public ContaSalario(String numeroConta, String agencia,  String dataAbertura) {
		
		this.numeroConta = numeroConta;
		this.agencia = agencia;
		this.saldo = 0f;
		this.status = true;
		this.dataAbertura = dataAbertura;
		
	}
	
	@Override
	public void sacar(float valorSacado) {
		// TODO Auto-generated method stub
		if(valorSacado <= this.saldo && this.status) {
			this.saldo -= valorSacado; 
		}
	}

	@Override
	public void depositar(float valorDepositado) {
		// TODO Auto-generated method stub
		if(valorDepositado > 0 && this.status) {
			this.saldo += valorDepositado;
		}
	}

	@Override
	public void transferencia(IConta contaDestino, float valorTransferido){
		// TODO Auto-generated method stub
		System.err.println("Conta Salário não fz transferência!");
	}

	@Override
	public void desativarConta() {
		// TODO Auto-generated method stub
		this.status= false;
	}

	@Override
	public void ativarConta() {
		// TODO Auto-generated method stub
		this.status = true;
	}

	@Override
	public String toString() {
		return "ContaSalario [numeroConta=" + numeroConta + ", agencia=" + agencia + ", saldo=" + saldo + ", status="
				+ status + ", dataAbertura=" + dataAbertura + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numeroConta == null) ? 0 : numeroConta.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContaSalario other = (ContaSalario) obj;
		if (numeroConta == null) {
			if (other.numeroConta != null)
				return false;
		} else if (!numeroConta.equals(other.numeroConta))
			return false;
		return true;
	}

}
