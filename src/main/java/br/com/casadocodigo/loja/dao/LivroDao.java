package br.com.casadocodigo.loja.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.casadocodigo.loja.models.Livro;

/**
 * 
 * @author romulo
 * @description DAO Livro
 * @date 2017.05.01
 *
 */
public class LivroDao {

	@PersistenceContext
	private EntityManager manager;

	public void salvar(Livro livro) {
		manager.persist(livro);
	}

	/**
	 * @author romulo
	 * @description método para listar livros com seus respectivos autores
	 * @date 2017.05.06
	 * @return lista de livros
	 */
	public List<Livro> listar() {
		String jpql = "select distinct(l) from Livro l" + " join fetch l.autores";// autores é o que está definido na classe livro e fetch, neste caso, trará todos os autores vinculados ao livro
		return manager.createQuery(jpql, Livro.class).getResultList();
	}
}
