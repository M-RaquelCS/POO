package prontuario.geral;

import java.util.ArrayList;
import java.util.List;

public class PacienteOncologico implements IPaciente {

	String nome;
	String cpf;
	char tipoSaguineo;
	float altura;
	float peso;
	
	int quantidadeRadioterapia;
	int quantidadeQuimioterapia;
	
	private List<IExame> exames = new ArrayList<IExame>();
	
	public PacienteOncologico(String cpf, String nome, int radio, int quimio) {
		
		this.nome = nome;
		this.cpf = cpf;
		this.quantidadeQuimioterapia= quimio;
		this.quantidadeRadioterapia = radio;
	}
	public PacienteOncologico(String nome, String cpf, char tipoSaguineo, float altura, float peso,
		int radio, int quimio) {
		
		this.nome = nome;
		this.cpf = cpf;
		this.tipoSaguineo = tipoSaguineo;
		this.altura = altura;
		this.peso = peso;

		this.quantidadeQuimioterapia = quimio;
		this.quantidadeRadioterapia = radio;
	}
	
	@Override
	public String toString() {
		return "PacienteOncologico [nome=" + nome + ", cpf=" + cpf + ", tipoSaguineo=" + tipoSaguineo + ", altura="
				+ altura + ", peso=" + peso + ", quantidadeRadioterapia=" + quantidadeRadioterapia
				+ ", quantidadeQuimioterapia=" + quantidadeQuimioterapia + ", exames:"+exames + "]";
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
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
		PacienteOncologico other = (PacienteOncologico) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		return true;
	}
	@Override
	public float calcularIMC() {
		// TODO Auto-generated method stub
		return (this.peso/(this.altura*this.altura))*0.85f;
	}
	
	@Override
	public void adicionarExame(IExame exameCliente) {
		// TODO Auto-generated method stub
		exames.add(exameCliente);
	}

	@Override
	public void removerExame(IExame exameCliente) {
		// TODO Auto-generated method stub
		if(exames.contains(exameCliente)) {
			exames.remove(exameCliente);
			System.out.println("Exame removido com sucesso!");
		}else {
			System.out.println("Exame inexistente!");
		}
	}
	
	
}
