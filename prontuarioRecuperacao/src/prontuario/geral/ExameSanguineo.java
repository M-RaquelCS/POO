package prontuario.geral;

public class ExameSanguineo implements IExame{
	
	int indiceGLicemico;
	float quantidadeHemacias;
	float quantidadePlaquetas;
	float quantidadeLeucocitos;
	
	public ExameSanguineo(int indiceGLicemico, float f, float g,
			float h) {
		super();
		this.indiceGLicemico = indiceGLicemico;
		this.quantidadeHemacias = f;
		this.quantidadePlaquetas = g;
		this.quantidadeLeucocitos = h;
	}

	@Override
	public String toString() {
		return "ExameSanguineo [indiceGLicemico=" + indiceGLicemico + ", quantidadeHemacias=" + quantidadeHemacias+ "milhoes/mm3"
				+ ", quantidadePlaquetas=" + quantidadePlaquetas+ "milhoes/mm3" + ", quantidadeLeucocitos=" + quantidadeLeucocitos
				+ "milhoes/mm3]";
	}
	
}
