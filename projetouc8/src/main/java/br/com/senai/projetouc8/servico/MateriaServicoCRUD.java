package br.com.senai.projetouc8.servico;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.projetouc8.orm.Materia;
import br.com.senai.projetouc8.repository.MateriaRepository;



@Service
public class MateriaServicoCRUD implements MateriaServico{
	@Autowired
	private MateriaRepository repository;


	public List<Materia> listarMaterias(){
		return (List<Materia>) repository.findAll();
}

	
	public void apagarMateria(Integer id) {
		repository.deleteById(id);	
}
	
	public void salvarMateria(Materia materia) {
		 repository.save(materia);
	}
	
	public Materia consultarMateriaId(Integer id) {
		return repository.findById(id).get();
		
}
	public Materia atualizarMateria(Materia materia) {
		return repository.save(materia);
}


	
		
	}


	
		


	

