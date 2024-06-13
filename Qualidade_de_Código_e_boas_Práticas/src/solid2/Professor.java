package solid2;

import java.util.ArrayList;
import java.util.List;

public class Professor implements Usuarios{
	private String nome;
	private List<Livro> livrosEmprestados = new ArrayList<>();
	
	public Professor(String nome) {
		this.nome = nome;
		
	}

	@Override
	public String getTipo() {
		return "Professor";
	}

	@Override
	public int limiteEmprestimoLivro() {
		return 5;
	}

	@Override
	public int limiteDuracaoEmprestimo() {
		return 30;
	}

	@Override
	public int maxRenovacoes() {
		return 3;
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
