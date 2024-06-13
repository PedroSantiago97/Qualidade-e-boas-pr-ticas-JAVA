package solid2;

import java.util.List;

public interface Usuarios extends UsuarioPA{
	
	String getTipo();
	int limiteEmprestimoLivro();
	int limiteDuracaoEmprestimo();
	List<Livro> getLivrosEmprestados();
	String getNome();

}
