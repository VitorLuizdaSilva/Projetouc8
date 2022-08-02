package br.com.senai.projetouc8.servico;
import java.util.List;


import br.com.senai.projetouc8.orm.Materia;



public interface MateriaServico {
	public List<Materia> listarMaterias();

	public void apagarMateria(Integer id);


	public Materia consultarMateriaId(Integer id);

	public Materia atualizarMateria(Materia materia);

	public void salvarMateria(Materia materia);

	


}
