package br.com.senai.projetouc8.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.senai.projetouc8.orm.Materia;
import br.com.senai.projetouc8.servico.MateriaServico;

@Controller
public class MateriaController {
	
	@Autowired
	private MateriaServico servico;
	

	@GetMapping({"/provas", "/"})	
	public String listarMaterias(Model modelo) {
		modelo.addAttribute("materia", servico.listarMaterias());
		return "provas"; //mostrar a página grupo.html
	}
	
	@GetMapping({"/materia", "/"})
	public String listarMateria(Model modelo) {
		modelo.addAttribute("materia", servico.listarMaterias());
		return "materia"; //mostrar a página grupo.html
	}
	
	@GetMapping({"/materia/{id}"})
	public String apagarCategoria(@PathVariable Integer id) {
		servico.apagarMateria(id);
		return "redirect:/materia"; //mostrar a página grupo.html
	}
	
	@GetMapping("/materia/adicionar")
	public String adicionarMateria(Model modelo) {
		Materia materia = new Materia();
		modelo.addAttribute("materia", materia);
		return "formCategoria";
	}
	
	@PostMapping("/materia")
	public String salvarMateria(@ModelAttribute("materia") Materia materia) {
		servico.salvarMateria(materia);
		return "redirect:/materia";
	}
	
	@GetMapping({"/materia/editar/{id}"})
	public String editarMateria(@PathVariable Integer id, Model modelo) {
		modelo.addAttribute("materia", servico.consultarMateriaId(id));
		return "editarMateria";
	}
	
	@PostMapping("/materia/{id}")
	public String atualizarMateria(@PathVariable Integer id, @ModelAttribute("materia") Materia materia, Model modelo) {
		Materia cat = servico.consultarMateriaId(id);
		cat.setId(id);
		cat.setMaterias(materia.getMaterias());
		cat.setTema(materia.getTema());
		servico.atualizarMateria(cat);
		return "redirect:/materia";
	}
}