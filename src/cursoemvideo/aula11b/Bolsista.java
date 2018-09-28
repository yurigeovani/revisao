package cursoemvideo.aula11b;

public class Bolsista extends Aluno {
	private float bolsa;
	
	public void renovarBolsa() {
		System.out.println("Renovando bolsa de " + getNome());
	}
	
	@Override
	public void pagarMensalidade() {
		System.out.println(getNome() + " é bolsista! Pagamento facilitado!");
	}

	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
	
	

}
