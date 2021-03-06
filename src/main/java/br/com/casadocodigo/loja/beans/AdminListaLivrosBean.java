package br.com.casadocodigo.loja.beans;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import br.com.casadocodigo.loja.dao.LivroDao;
import br.com.casadocodigo.loja.models.Livro;

/**
 * 
 * @author romulo
 * @description Bean Lista Livro
 * @date 2017.05.06
 *
 */
@Model // refere a @named e @requestedscope
public class AdminListaLivrosBean {

	@Inject
	private LivroDao dao;

	private List<Livro> livros = new ArrayList<>();

	public List<Livro> getLivros() {
		this.livros = dao.listar();
		return livros;
	}

}
