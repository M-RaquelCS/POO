package bancario.modelo;


public interface ICliente {
	public void adicionarContaCliente(IConta contaCliente);
	public void removerConta(IConta conta);
	public boolean contemContaCliente(IConta conta);
	
	public void adicionarTelefone(String telefone);
	public void removerTelefone(String telefone);
	public IConta buscarContaInvestimento(String numeroConta);

}
