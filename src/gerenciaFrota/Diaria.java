package gerenciaFrota;

public class Diaria {
	float diariaNormal,
			diariaReduzida,
			diariaEmpresarial,
			valorMensal;
	
	public Diaria (float diariaNormal, float diariaReduzida, float diariaEmpresarial, float valorMensal) {
		this.diariaNormal = diariaNormal;
		this.diariaReduzida = diariaReduzida;
		this.diariaEmpresarial = diariaEmpresarial;
		this.valorMensal = valorMensal;
	}

	public float getDiariaNormal() {
		return diariaNormal;
	}

	public void setDiariaNormal(float diariaNormal) {
		this.diariaNormal = diariaNormal;
	}

	public float getDiariaReduzida() {
		return diariaReduzida;
	}

	public void setDiariaReduzida(float diariaReduzida) {
		this.diariaReduzida = diariaReduzida;
	}

	public float getDiariaEmpresarial() {
		return diariaEmpresarial;
	}

	public void setDiariaEmpresarial(float diariaEmpresarial) {
		this.diariaEmpresarial = diariaEmpresarial;
	}

	public float getValorMensal() {
		return valorMensal;
	}

	public void setValorMensal(float valorMensal) {
		this.valorMensal = valorMensal;
	}
	
}