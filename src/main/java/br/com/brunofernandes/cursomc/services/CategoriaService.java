package br.com.brunofernandes.cursomc.services;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.brunofernandes.cursomc.domain.Categoria;
import br.com.brunofernandes.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	CategoriaRepository categoriaRepository;
	
	public Categoria buscarPorId(Integer id) {
		 Optional<Categoria> obj = categoriaRepository.findById(id);
		return obj.orElse(null);
	}

}
