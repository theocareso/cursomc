package br.com.theocareso.cursomc.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.theocareso.cursomc.domain.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{
//	coloca a anotação @Repository
//	faz com que ele seja uma interface que herda do JPA Repository para acessar dados 
//	do tipo dque for informado no '<Classe, Tipo do atributo identificador>'
	
	
	
}
