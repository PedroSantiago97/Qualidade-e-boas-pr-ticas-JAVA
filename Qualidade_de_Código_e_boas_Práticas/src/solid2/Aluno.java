package solid2;

import java.util.ArrayList;
import java.util.List;

public class Aluno implements Usuarios{
	private String nome;
	private List<Livro> livrosEmprestados = new ArrayList<>();
	
	public Aluno(String nome) {
		this.nome = nome;
		
	}

	@Override
	public String getTipo() {
		return "Aluno";
	}

	@Override
	public int limiteEmprestimoLivro() {
		return 3;
	}

	@Override
	public int limiteDuracaoEmprestimo() {
		return 14;
	}

	@Override
	public int maxRenovacoes() {
		return 2;
	}

	@Override
	public List<Livro> getLivrosEmprestados() {
		return livrosEmprestados;
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return nome;
	}

	
	
}
