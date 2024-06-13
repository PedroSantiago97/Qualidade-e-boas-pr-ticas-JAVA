package solid2;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	
	private List<UsuarioPA> usuarios = new ArrayList<>();
	private List<Livro> livros = new ArrayList<>();
	private List<Emprestimo> emprestimos = new ArrayList<>();
	
	public void cadastrarUsuario(UsuarioPA usuario) {
		usuarios.add(usuario);
	}
	public void cadastrarUsuario(Visitante usuario) {
		usuarios.add(usuario);
	}
	
	public void cadastrarLivro(Livro livro) {
		livros.add(livro);
	}
	
	public boolean realizarEmprestimo(Usuarios usuario, Livro livro) {
		if(usuario.getLivrosEmprestados().size()>=usuario.limiteEmprestimoLivro()) {
			return false;
		}
		
		Emprestimo emprestimo = new Emprestimo(livro, usuario);
		emprestimos.add(emprestimo);
		
		return true;
	}
	
	public void consultarEmprestimosAtivos() {
		emprestimos.forEach(e -> System.out.println("Livro: "+e.getLivro().getTitulo()+", Usuário: "+e.getUsuario().getNome()+", Data de aquisição: "+e.getDataEmprestimo()));
		
	}
	

}
