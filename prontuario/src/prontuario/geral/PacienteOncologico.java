package prontuario.geral;

public final class PacienteOncologico extends Paciente{
	
	int quantidadeRadioterapia;
	int quantidadeQuimioterapia;
	
	public PacienteOncologico(String cpf, String nome, int radio, int quimio) {
		super(cpf, nome);
		// TODO Auto-generated constructor stub
		this.quantidadeQuimioterapia= quimio;
		this.quantidadeRadioterapia = radio;
	}
	public PacienteOncologico(String cpf, String nome, char tipo, char fator, float altura, float peso, int radio, int quimio) {
		super(cpf, nome, tipo, fator, altura, peso);
		this.quantidadeQuimioterapia= quimio;
		this.quantidadeRadioterapia = radio;
	}
	
	public float calcularIMC()
	{
		return (this.peso/(this.altura*this.altura))*0.9f;
	}
	@Override
	public String toString() {
		return "Classe Paciente [CPF: "+this.cpf+", Nome: "+this.nome+"]";
	}
	
}