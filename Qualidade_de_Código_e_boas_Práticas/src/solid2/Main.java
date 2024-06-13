package solid2;

public class Main {
	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca();
		
		Usuarios aluno = new Aluno("João");
		Usuarios professor = new Professor("Norberto");
		Usuarios visitante = new Visitante("Enzo");
		
		biblioteca.cadastrarUsuario(aluno);
		biblioteca.cadastrarUsuario(professor);
		biblioteca.cadastrarUsuario(visitante);
		
		Livro livro1 = new Livro("MobDick");
		Livro livro2 = new Livro("Romeu e Julieta");
		Livro livro3 = new Livro("Harry Potter 1");
		Livro livro4 = new Livro("Harry Potter 2");
		Livro livro5 = new Livro("Harry Potter 3");
		Livro livro6 = new Livro("Harry Potter 4");
		Livro livro7 = new Livro("Harry Potter 5");
		Livro livro8 = new Livro("Harry Potter 6");
		
		
		biblioteca.cadastrarLivro(livro1);
		biblioteca.cadastrarLivro(livro2);
		biblioteca.cadastrarLivro(livro3);
		biblioteca.cadastrarLivro(livro4);
		biblioteca.cadastrarLivro(livro5);
		biblioteca.cadastrarLivro(livro6);
		biblioteca.cadastrarLivro(livro7);
		biblioteca.cadastrarLivro(livro8);
		
		biblioteca.realizarEmprestimo(aluno, livro5);
		biblioteca.realizarEmprestimo (professor, livro3);
		biblioteca.realizarEmprestimo(aluno, livro2);
		biblioteca.realizarEmprestimo(visitante, livro4);
		
		biblioteca.consultarEmprestimosAtivos();
	}

}
