package prontuario_persistencia;

import prontuario.geral.IPaciente;
import prontuario_excecao.PacienteJaCadastradoException;

public interface IPersistencia {
	
	public void cadastrarPaciente(IPaciente obj) throws PacienteJaCadastradoException;
	public void removerPaciente(IPaciente obj);
	public IPaciente consultarPaciente(String cpf);
}
