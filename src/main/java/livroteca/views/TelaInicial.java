package livroteca.views;

import java.util.List;
import java.util.Scanner;

import livroteca.models.domain.Livro;

public class TelaInicial {
	
	private static final Scanner scn = new Scanner(System.in);
	
	public static int exibeMenu() {
		
		System.out.println("Escolha uma opção:");
		System.out.println("1 - Listar livros cadastrados");
		System.out.println("2 - Cadastrar novo livro");
		System.out.println("3 - Deletar livro cadastrado");
		System.out.println("4 - Editar livro cadastrado");
		System.out.println("5 - Sair");
		
		int opcao = scn.nextInt();
		
		return opcao;
		
	}
	
	public static void exibeListaDeLivros(List<Livro> listaDeLivros) {
		
		for (Livro livro : listaDeLivros) {
			System.out.println("O livro "+ livro.getTitulo()+" foi lançado em "+livro.getAnoDeLancamento());
		}
		
	}
	
	public static Livro cadastrarLivro() {
		
		System.out.println("Digite o titulo do Livro:");
		String titulo = scn.next();
		System.out.println("Digite o autor do Livro:");
		String autor = scn.nextLine();
		System.out.println("Digite o genero do Livro:");
		String genero = scn.nextLine();
		System.out.println("Digite o ano de lançamento do Livro:");
		Integer anoDeLancamento = scn.nextInt();
		
		Livro novoLivro = new Livro();
		
		novoLivro.setTitulo(titulo);
		novoLivro.setAutor(autor);
		novoLivro.setGenero(genero);
		novoLivro.setAnoDeLancamento(anoDeLancamento);
		
		return novoLivro;
		
	}
	
	public static int buscaLivroPorId() {
		System.out.println("Digite o id do livro que deseja procurar:");
		int id = scn.nextInt();
		return id;
	}
	
	public static String novoTituloDoLivro() {
		System.out.println("Digite o novo titulo do livro:");
		String novoTitulo = scn.next();
		return novoTitulo;
	}
	
	public static void fechaScanner() {
		scn.close();
	}
	
	
}
