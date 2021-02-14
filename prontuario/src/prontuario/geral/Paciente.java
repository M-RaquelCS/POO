package prontuario.geral;

public abstract class Paciente {
	String cpf;
	String nome;
	char tipoSaguineo;
	char fatorRH;
	float altura;
	float peso;
	
	private static int CONTADOR_INSTANCIAS = 0;
	
	public Paciente(String cpf, String nome, char tipo, char fator, float altura, float peso)
	{
		this.cpf = cpf;
		this.nome = nome;
		this.tipoSaguineo = tipo;
		this.fatorRH = fator;
		this.altura = altura;
		this.peso = peso;
		incrementarContador();
	}
	
	public Paciente(String cpf, String nome)
	{
		this.nome = nome;
		this.cpf = cpf;
		incrementarContador();
	}
	
	public abstract float calcularIMC();

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Paciente other = (Paciente) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	public static int getContador()
	{
		return CONTADOR_INSTANCIAS;
	}
	
	private static void incrementarContador()
	{
		CONTADOR_INSTANCIAS++;
	}
}
