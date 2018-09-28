package cursoemvideo.aula10b;

public class ProjetoPessoas {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		p1.setNome("Pedro");
		p2.setNome("Maria");
		p3.setNome("Claudio");
		p4.setNome("Fabiana");
		
		p1.setSexo("M");
		p4.setSexo("F");
		p2.setIdade(18);
		
		p2.setCurso("Informatica");
		p3.setSalario(2500.75f);
		p4.setSetor("Estoque");
		
		p3.receberAumento(550.20f);
		p4.mudarTrabalho();
		p2.cancelarMatr();
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
	}

}
