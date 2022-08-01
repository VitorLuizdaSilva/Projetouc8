package br.com.senai.projetouc8.servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.projetouc8.orm.Categoria;
import br.com.senai.projetouc8.repository.CategoriaRepository;



@Service
public class CategoriaServicoCRUD implements CategoriaServico{
	@Autowired
	private CategoriaRepository repository;


	public List<Categoria> listarCategorias() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	
		
	}
