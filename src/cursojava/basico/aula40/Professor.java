package cursojava.basico.aula40;

public class Professor extends Pessoa {

	private double salario;
	private String nomeCurso;
	
	public Professor() {
	}
	public Professor(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
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
		String s = "Endere�o do professor: ";
		s += this.getEndereco();
		return s;
	}

}