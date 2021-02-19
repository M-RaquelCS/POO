package prontuario_persistencia;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import prontuario.geral.IPaciente;
import prontuario.geral.PacienteDiabetico;
import prontuario_excecao.PacienteJaCadastradoException;

public class PersistenciaEmArquivoPaciente implements IPersistencia{
	
	private List<IPaciente> pacientesCadastrados = new ArrayList<IPaciente>();
	
	public PersistenciaEmArquivoPaciente() {
		lerConteudoArquivo();
	}

	@Override
	public void cadastrarPaciente(IPaciente obj) throws PacienteJaCadastradoException{
		// TODO Auto-generated method stub
		if(!pacientesCadastrados.contains(obj)) {
			pacientesCadastrados.add(obj);
			salvarEmArquivo();
			System.out.println("Cliente cadastrado com sucesso");
		}else {
			throw new PacienteJaCadastradoException("Paciente já foi cadastrado.");
		}
	}

	@Override
	public void removerPaciente(IPaciente obj) {
		// TODO Auto-generated method stub
		if(pacientesCadastrados.contains(obj)) {
			pacientesCadastrados.remove(obj);
			salvarEmArquivo();
		}
	}

	@Override
	public IPaciente consultarPaciente(String cpf) {
		// TODO Auto-generated method stub
		IPaciente cliente = new PacienteDiabetico(cpf);
		if(pacientesCadastrados.contains(cliente)) {
			int index = pacientesCadastrados.indexOf(cliente);
			cliente = pacientesCadastrados.get(index);
		}
		return cliente;
	}
	
	private void salvarEmArquivo() {
		try {
			FileOutputStream fos = new FileOutputStream("persistencia_paciente.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(pacientesCadastrados);
			oos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@SuppressWarnings("unchecked")
	public void lerConteudoArquivo() {
		try {
			FileInputStream fis = new FileInputStream("persistencia_paciente.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object obj = ois.readObject();
			pacientesCadastrados = (ArrayList<IPaciente>)obj;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
