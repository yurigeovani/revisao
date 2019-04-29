package cursojava.basico.aula40;

public class Aluno extends Pessoa {

	private String curso;
	private double[] notas;

	public Aluno() {
	}
	public Aluno(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
	}

	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double calcularMedia() {
		return 0;
	}
	
	public boolean verificarAprovado() {
		return true;
	}
	
	public void metodoQualquer() {
		
	}
	
	public String obterEtiquetaEndereco() {
		String s = "Endere�o do aluno: ";
		s += this.getEndereco();
		return s;
	}
}