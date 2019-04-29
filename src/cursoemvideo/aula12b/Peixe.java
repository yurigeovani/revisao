package cursoemvideo.aula12b;

public class Peixe extends Animal{
	private String corEscama;

	@Override
	public void locomover() {
		System.out.println("Nadando!");
	}
	@Override
	public void alimentar() {
		System.out.println("Comendo subst�ncias!");
	}
	@Override
	public void emitirSom() {
		System.out.println("Peixe n�o faz som!");
		
	}
	public void soltarBolha() {
		System.out.println("Soltando bolhas!");
	}
	public String getCorEscama() {
		return corEscama;
	}
	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
}