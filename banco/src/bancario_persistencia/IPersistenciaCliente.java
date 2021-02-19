package bancario_persistencia;

import bancario.modelo.ICliente;
import bancario_excecao.ClienteJaCadastradoException;

public interface IPersistenciaCliente {
	
	public void cadastrarCliente(ICliente obj) throws ClienteJaCadastradoException;
	
	public ICliente localizarClientePorCPF(String cpf);
	public ICliente localizarClientePorCNPJ(String cnpj);
	
	public void removerCliente(ICliente obj);
}
