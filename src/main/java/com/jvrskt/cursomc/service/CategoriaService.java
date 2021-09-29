package com.jvrskt.cursomc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jvrskt.cursomc.domain.Categoria;
import com.jvrskt.cursomc.repository.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	public CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		Optional<Categoria> list = repo.findById(id);
		return list.orElse(null);
	}
}
