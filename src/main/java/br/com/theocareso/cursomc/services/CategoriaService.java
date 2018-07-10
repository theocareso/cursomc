package br.com.theocareso.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.theocareso.cursomc.domain.Categoria;
import br.com.theocareso.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	//informando que está acessando o repository (acesso a dados)
//	autowired - quando é declarado uma dependencia e usa-se essa anotação, 
//	essa dependencia é automaticamente instanciada pelo Spring (injeção de depend ou injeção de controle)
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}
	
}