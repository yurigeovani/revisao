package cursoemvideo.aula12b;

public class Aula12 {

	public static void main(String[] args) {
		//Animal n = new Animal();
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		
//		m.setPeso(35.3f);
//		m.setCorPelo("Marrom");
//		m.alimentar();
//		m.emitirSom();
//		m.locomover();
//		a.locomover();
//		p.locomover();
//		r.locomover();

		Canguru c = new Canguru();
		Cachorro k = new Cachorro();
		Cobra j = new Cobra();
		Tartaruga t = new Tartaruga();
		GoldFish g = new GoldFish();
		Arara e = new Arara();
		
		c.locomover();
		c.emitirSom();
		k.locomover();
		k.emitirSom();
	}
}