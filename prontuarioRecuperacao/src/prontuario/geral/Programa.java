package prontuario.geral;

import prontuario_excecao.PacienteJaCadastradoException;
import prontuario_persistencia.PersistenciaEmArquivoPaciente;

public class Programa {
	public static void main(String[] args) {
		
		PersistenciaEmArquivoPaciente pap = new PersistenciaEmArquivoPaciente();
		
		IPaciente p1 = new PacienteDiabetico("mauro", "000", 'A', 1.66f, 66f);
		System.out.println(p1);
		System.out.println("O valor do IMC do paciente é: "+p1.calcularIMC());
		
		IExame e1 = new ExameSanguineo(70, 3.6f, 3f, 2.9f);
		System.out.println(e1);
		
		p1.adicionarExame(e1);
		
		System.out.println(p1);
		
		try {
			pap.cadastrarPaciente(p1);
		} catch (PacienteJaCadastradoException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
	}

}
