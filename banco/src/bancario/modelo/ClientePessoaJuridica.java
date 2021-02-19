package bancario.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ClientePessoaJuridica implements ICliente, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String cnpj;
	String nomeFantasia;
	String razaoSocial;
	String email;
	
	private List<IConta> contas = new ArrayList<IConta>();
	private HashSet<String> telefones = new HashSet<String>();
	
	

	public ClientePessoaJuridica(String cnpj, String nomeFantasia, String razaoSocial, String email) {
		super();
		this.cnpj = cnpj;
		this.nomeFantasia = nomeFantasia;
		this.razaoSocial = razaoSocial;
		this.email = email;
	}


	public ClientePessoaJuridica(String cnpj) {
		
		this.cnpj = cnpj;
	}
	

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cnpj == null) ? 0 : cnpj.hashCode());
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
		ClientePessoaJuridica other = (ClientePessoaJuridica) obj;
		if (cnpj == null) {
			if (other.cnpj != null)
				return false;
		} else if (!cnpj.equals(other.cnpj))
			return false;
		return true;
	}


	@Override
	public void adicionarContaCliente(IConta contaCliente){
		// TODO Auto-generated method stub
		contas.add(contaCliente);
	}
	
	public boolean contemContaCliente(IConta conta) {
		return contas.contains(conta);
	}
	
	public void removerConta(IConta conta) {
		if(contas.contains(conta)) {
			contas.remove(conta);
			System.out.println("Conta removida com sucesso!");
		}else {
			System.out.println("Conta inexistente!");
		}
	}
	
	public void adicionarTelefone(String telefone) {
		telefones.add(telefone);
	}
	
	public void removerTelefone(String telefone) {
		if(telefone.contains(telefone)) {
			telefones.remove(telefone);
		}
		else {
			System.out.println("Não é possivel apagar o número de telefone");
		}
	}


	@Override
	public String toString() {
		return "ClientePessoaJuridica [cnpj=" + cnpj + ", nomeFantasia=" + nomeFantasia + ", razaoSocial=" + razaoSocial
				+ ", email=" + email + ", contas=" + contas + ", telefones=" + telefones + "]";
	}


	@Override
	public IConta buscarContaInvestimento(String numeroConta) {
		IConta conta = new  ContaInvestimento(numeroConta);
		if(contas.contains(conta)) {
			int index = contas.indexOf(conta);
			conta = contas.get(index);
		}
		return conta;
	}

	
	
}
