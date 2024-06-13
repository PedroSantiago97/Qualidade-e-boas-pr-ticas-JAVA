package solid2;

import java.time.LocalDate;

public class Emprestimo {
	private Livro livro;
	private UsuarioPA usuario;
	private LocalDate dataEmprestimo;
	private int renovacoes;
	
	
	public Emprestimo(Livro livro, UsuarioPA usuario) {
		this.livro = livro;
		this.usuario = usuario;
		this.dataEmprestimo = LocalDate.now();
		this.renovacoes = 0;
	}
	
	public Livro getLivro() {
		return livro;
	}
	
	public UsuarioPA getUsuario() {
		return usuario;
	}
	
	public LocalDate getDataEmprestimo() {
		return dataEmprestimo;
	}
	public int getRenovacoes() {
		return renovacoes;
	}
	
	public boolean renovar() {
		if(usuario instanceof UsuarioPA) {
			UsuarioPA usuarioPa = (UsuarioPA) usuario;
			if (renovacoes < usuarioPa.maxRenovacoes()) {
				renovacoes++;
				dataEmprestimo = LocalDate.now();			}
			return true;
		}
		return false;
	}
}
