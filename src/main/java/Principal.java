import java.util.List;

import livroteca.models.DAO.DAOGenerico;
import livroteca.models.DAO.LivroDAO;
import livroteca.models.domain.Livro;
import livroteca.views.TelaInicial;

public class Principal {

	private static DAOGenerico<Livro> livroDAO = new LivroDAO();
	
	public static void main(String[] args) {
		
		int opcao = 0;
		
		while(opcao!=5) {
			
			opcao = TelaInicial.exibeMenu();
			
			switch (opcao) {
			case 1:
				

				List<Livro> listaDeLivros = livroDAO.listar();
				
				TelaInicial.exibeListaDeLivros(listaDeLivros);
				break;
			case 2:
				Livro livro = TelaInicial.cadastrarLivro();
				livroDAO.cadastrar(livro);
				break;
			case 3:
				int idDoLivroParaDeletar = TelaInicial.buscaLivroPorId();
				Livro livroParaDeletar = livroDAO.buscarPorId(idDoLivroParaDeletar);
				livroDAO.deletar(livroParaDeletar);
				break;
			case 4:
				int idDoLivroParaEditar = TelaInicial.buscaLivroPorId();
				Livro livroParaEditar = livroDAO.buscarPorId(idDoLivroParaEditar);
				String novoTitulo = TelaInicial.novoTituloDoLivro();
				livroDAO.atualizar(novoTitulo, livroParaEditar);
				break;
			default:
				break;
			}	
		}
		

	}

}
