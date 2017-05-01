package br.com.casadocodigo.loja.beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import br.com.casadocodigo.loja.dao.LivroDao;
import br.com.casadocodigo.loja.models.Livro;

// CDI
// Named para indicar que será gerenciado pelo cdi e não pelo jsf
/**
 * 
 * @author romulo
 * @description classe controller de livros
 * @date 2017.05.01
 */
@Named
@RequestScoped
public class AdminLivrosBean {

	private Livro livro = new Livro();
	// CDI
	@Inject
	private LivroDao dao;

	@Transactional
	public void salvar() {
		dao.salvar(livro);
		System.out.println("Livro cadastrado: " + livro);
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}
}
