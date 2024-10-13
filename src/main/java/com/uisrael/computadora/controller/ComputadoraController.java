package com.uisrael.computadora.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.uisrael.computadora.repository.CursoRepository;
import com.uisrale.computadora.modelo.entity.Computadora;

import org.springframework.ui.Model;

@Controller
public class ComputadoraController {

	@Autowired
	private CursoRepository cursoRepository;
	
	@GetMapping
	public String home() {
		return "redirect:/computadora";
	}
	@GetMapping("/computadora")
	public String listarComputadora(Model model) {
		List<Computadora> computadora = cursoRepository.findAll();
		computadora = cursoRepository.findAll();
		model.addAttribute("computadora",computadora);
		return  "computadora";
	}
}
