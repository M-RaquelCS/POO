package prontuario.geral;

public interface IPaciente {

	public float calcularIMC();
	void adicionarExame(IExame exame);
	void removerExame(IExame exameCliente);
	
}
