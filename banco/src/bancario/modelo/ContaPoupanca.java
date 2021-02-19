package bancario.modelo;
import java.io.Serializable;

import bancario_excecao.SaldoIndisponivelException;

public class ContaPoupanca implements IConta, Serializable{


	String numeroConta;
	String agencia;
	private float saldo;
	boolean status;
	String dataAbertura;
	
	public ContaPoupanca(String numeroConta, String agencia, String dataAbertura) {
		
		// TODO Auto-generated constructor stub

		this.numeroConta = numeroConta;
		this.agencia = agencia;
		this.saldo = 0f;
		this.status = true;
		this.dataAbertura = dataAbertura;
	}

	@Override
	public void transferencia(IConta contaDestino, float valorTransferido) throws SaldoIndisponivelException{
		if(contaDestino instanceof ContaCorrente || contaDestino instanceof ContaInvestimento )
		{
			this.sacar(valorTransferido + (valorTransferido*TAXA_ADMINISTRACAO));
			contaDestino.depositar(valorTransferido);
		}
		else
		{
			this.sacar(valorTransferido);
			contaDestino.depositar(valorTransferido);
		}
	}

	@Override
	public void sacar(float valorSacado) throws SaldoIndisponivelException{
		// TODO Auto-generated method stub
		if(valorSacado > 0 && this.saldo >= (valorSacado+(valorSacado*CUSTO_SACAR_CONTA_POUPANCA)) && this.status) {
			this.saldo -= (valorSacado+(valorSacado*CUSTO_SACAR_CONTA_POUPANCA));
		}else if((valorSacado+(valorSacado*CUSTO_SACAR_CONTA_POUPANCA)) > saldo) {
			throw new SaldoIndisponivelException("Saldo Insuficiente.");
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
	public void desativarConta() {
		// TODO Auto-generated method stub
		this.status = false;
	}

	@Override
	public void ativarConta() {
		// TODO Auto-generated method stub
		this.status = true;
	}

	@Override
	public String toString() {
		return "ContaPoupanca [numeroConta=" + numeroConta + ", agencia=" + agencia + ", saldo=" + saldo + ", status="
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
		ContaPoupanca other = (ContaPoupanca) obj;
		if (numeroConta == null) {
			if (other.numeroConta != null)
				return false;
		} else if (!numeroConta.equals(other.numeroConta))
			return false;
		return true;
	}
	
}
