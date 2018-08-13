package org.devsjavagirl.projetofinalizado.controllers;

import java.util.List;

import org.devsjavagirl.projetofinalizado.models.Usuarios;
import org.devsjavagirl.projetofinalizado.services.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
@RequestMapping("/usuarios")
public class UsuariosController {
	
	@Autowired
	private UsuariosService usuariosService;

	@GetMapping
	public String listarTodos(Model model) {
		List<Usuarios> usuarios = usuariosService.listar();
		model.addAttribute("usuarios", usuarios);
		return "usuarios/lista";
	}
	
	@GetMapping("/form")
	public String novoUsuario() {
		return "usuarios/form";
	}
	
	@PostMapping
	public String criarUsuario(Usuarios novoUsuario, Model model, RedirectAttributes attributes) {
		usuariosService.salvar(novoUsuario);
		return "redirect:/usuarios";
	}
}
