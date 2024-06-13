package solid2;

import java.util.ArrayList;
import java.util.List;

public class Visitante implements Usuarios{
	private String nome;
	private List<Livro> livrosEmprestados = new ArrayList<>();
	
	public Visitante(String nome) {
		this.nome = nome;
		
	}

	@Override
	public String getTipo() {
		return "Visitante";
	}

	@Override
	public int limiteEmprestimoLivro() {
		return 1;
	}

	@Override
	public int limiteDuracaoEmprestimo() {
		return 7;
	}

	@Override
	public List<Livro> getLivrosEmprestados() {
		// TODO Auto-generated method stub
		return livrosEmprestados;
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return nome;
	}

	@Override
	public int maxRenovacoes() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	
	
}
