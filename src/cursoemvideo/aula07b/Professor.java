package cursoemvideo.aula07b;

public class Professor {

	private double salario;
	private String nomeCurso;
	
	public Professor() {
	}
	public Professor(String nome, String endereco, String telefone) {
//		super(nome, endereco, telefone);
	}

	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	
	public double calcularSalarioLiquido() {
		return 0;
	}
	
	public String obterEtiquetaEndereco() {
		String s = "Endereço do professor: ";
//		s+=super.getEndereco();
		return s;
	}
	
//	@Override
	public void imprimirEtiquetaEndereco() {
		// TODO Auto-generated method stub
		System.out.println("Imprimindo endereço do professor: ");
		System.out.println(this.obterEtiquetaEndereco());
	}

}