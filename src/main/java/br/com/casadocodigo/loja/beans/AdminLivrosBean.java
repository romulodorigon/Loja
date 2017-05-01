package br.com.casadocodigo.loja.beans;

import java.util.Arrays;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import br.com.casadocodigo.loja.dao.LivroDao;
import br.com.casadocodigo.loja.models.Autor;
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

	public List<Autor> getAutores() {
		return Arrays.asList(new Autor(1, "Paulo Silveira"), new Autor(2, "Sergio Lopes"));
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}
}
