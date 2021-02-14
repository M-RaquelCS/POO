package prontuario.geral;

import prontuario.gui.TelaPrincipal;

public class Programa {
	public static void main (String[] args) {
		System.out.println(Paciente.getContador());
		Paciente po = new PacienteOncologico("444", "mauro", 'B', '-', 1.76f, 64f, 0, 0);
		Paciente pa = new PacienteOncologico("444", "mauro", 'B', '-', 1.76f, 64f, 0, 0);
		PacienteRenal pr = new PacienteRenal("555", "thaymra", 'B', '+', 1.76f, 64f, false, 3);
		
		System.out.println(Paciente.getContador());
		
		TelaPrincipal tp = new TelaPrincipal();
		tp.setVisible(true);
	}
}