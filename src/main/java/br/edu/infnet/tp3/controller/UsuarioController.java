package br.edu.infnet.tp3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.tp3.model.domain.Usuario;
import br.edu.infnet.tp3.model.service.UsuarioService;



@Controller
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping(value="/cadastrar")
	public String telaCadastro() {
		return "index";
	}
	
	@PostMapping(value = "/incluir")
	public String incluir(Usuario usuario, Model model){
		
		usuarioService.incluir(usuario);
		

		model.addAttribute("usuario", usuario);
		
		return "confirmacao";
	}
	

}
