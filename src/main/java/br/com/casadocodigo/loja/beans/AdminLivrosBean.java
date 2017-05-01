package br.com.casadocodigo.loja.beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

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

	public void salvar() {
		System.out.println("Livro cadastrado: " + livro);
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}
}
