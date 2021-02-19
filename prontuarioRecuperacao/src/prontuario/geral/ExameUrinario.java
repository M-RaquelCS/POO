package prontuario.geral;

public class ExameUrinario implements IExame{
	
	String cor;
	float ph;
	int indiceGLicemico;
	float quantidadeHemacias;
	float quantidadeLeucocitos;
	
	public ExameUrinario(String cor, float ph, int indiceGLicemico, int quantidadeHemacias, int quantidadeLeucocitos) {
		super();
		this.cor = cor;
		this.ph = ph;
		this.indiceGLicemico = indiceGLicemico;
		this.quantidadeHemacias = quantidadeHemacias;
		this.quantidadeLeucocitos = quantidadeLeucocitos;
	}

	@Override
	public String toString() {
		return "ExameUrinario [cor=" + cor + ", ph=" + ph + ", indiceGLicemico=" + indiceGLicemico
				+ ", quantidadeHemacias=" + quantidadeHemacias + ", quantidadeLeucocitos=" + quantidadeLeucocitos + "]";
	}
	
}
