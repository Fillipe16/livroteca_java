package livroteca.models.DAO;

import java.util.List;

public interface DAOGenerico<E> {
	
	public List<E> listar();
	
	public void cadastrar(E novoValor);
	
	public void atualizar(String novoTitulo, E antigoValor);
	
	public void deletar(E valor);
	
	public E buscarPorId(Integer id);
	
}
