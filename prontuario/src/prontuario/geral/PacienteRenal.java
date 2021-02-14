package prontuario.geral;

public final class PacienteRenal extends Paciente{
	
	boolean transplantado;
	int quantidadeDialise;
	
	public PacienteRenal(String cpf, String nome, boolean transp, int dialise) {
		super(cpf, nome);
		// TODO Auto-generated constructor stub
		this.transplantado = transp;
		this.quantidadeDialise = dialise;
	}
	public PacienteRenal(String cpf, String nome, char tipo, char fator, float altura, 
			float peso, boolean transp, int dialise) {
		super(cpf,nome,tipo,fator,altura,peso);
		this.transplantado = transp;
		this.quantidadeDialise = dialise;
		
	}
	
	public float calcularIMC()
	{
		return (this.peso/(this.altura*this.altura))*0.8f;
	}
	
	@Override
	public String toString() {
		return "PacienteRenal [transplantado=" + transplantado + ", quantidadeDialise=" + quantidadeDialise + ", cpf="
				+ cpf + ", nome=" + nome + ", tipoSaguineo=" + tipoSaguineo + ", fatorRH=" + fatorRH + ", altura="
				+ altura + ", peso=" + peso + "]";
	}
	
}
