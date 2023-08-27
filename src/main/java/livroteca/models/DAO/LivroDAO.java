package livroteca.models.DAO;

import java.util.List;

import javax.persistence.EntityManager;

import livroteca.models.database.FabricaDeEntityManager;
import livroteca.models.domain.Livro;

public class LivroDAO implements DAOGenerico<Livro> {
	
	private final EntityManager em = 
			FabricaDeEntityManager.getEntityManager();
	
	@Override
	public List<Livro> listar() {
		String jpqlConsultarTodos = "SELECT l from Livro AS l";
		List<Livro> listaDeLivros = this.em.createQuery(jpqlConsultarTodos, Livro.class)
									.getResultList();
		return listaDeLivros;
	}

	@Override
	public void cadastrar(Livro novoValor) {
		
		this.em.getTransaction().begin();
		
		this.em.persist(novoValor);
		
		this.em.getTransaction().commit();
		
	}

	@Override
	public void atualizar(String novoTitulo, Livro livro) {
		
		this.em.getTransaction().begin();
		
		livro = this.em.merge(livro);
		
		livro.setTitulo(novoTitulo);
		
		this.em.getTransaction().commit();
	}

	@Override
	public void deletar(Livro livro) {
		
		this.em.getTransaction().begin();
		this.em.remove(livro);
		this.em.getTransaction().commit();
		
	}

	@Override
	public Livro buscarPorId(Integer id) {
		
		Livro livro = this.em.find(Livro.class, id);
		
		return livro;
	}

}
