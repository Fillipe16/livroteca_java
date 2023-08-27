package livroteca.models.DAO;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import livroteca.models.domain.Livro;

public class LivroDAOTest {
	
	private static LivroDAO livroDAO = new LivroDAO();
		
	@Test
	public void deveriaRetornarLivroCorretoDeIdValido() {
		
		Integer id = 1;
		
		Livro livroRetornadoDoBD = livroDAO.buscarPorId(id);
		
		assertEquals(id, livroRetornadoDoBD.getId());
		
	}

	@Test
	public void naoDeveriaRetornarLivroDeIdInvalido() {
		
		Integer id = 5;
		
		Livro livroInvalido = livroDAO.buscarPorId(id);
		
		assertNull(livroInvalido);
		
	}
	
	
	
}
