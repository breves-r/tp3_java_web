 package br.edu.infnet.tp3.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import br.edu.infnet.tp3.model.domain.Usuario;
import br.edu.infnet.tp3.model.service.UsuarioService;



@SessionAttributes("user")
@Controller
public class AcessoController {
	
	@Autowired
	private UsuarioService usuarioService;

	
	@GetMapping(value = "/login")
	public String telaLogin() {
		return "login";		
	} 
	


	@PostMapping(value = "/login")
	public String validar(Model model, @RequestParam String email, @RequestParam String senha){
		
		Usuario usuario = usuarioService.autenticacao(email, senha);

		if(usuario != null) {
			model.addAttribute("user", usuario);
			return "autenticado";
		} else {
			model.addAttribute(
					"mensagem", 
					"As credenciais do usuário "+email+" estão incorretas!"
				);

			return telaLogin();
		}	

	}
	
	@GetMapping(value = "/logout")
	public String logout(SessionStatus status, HttpSession session) {
		status.setComplete();
		session.removeAttribute("user");
		return "redirect:/cadastrar";		
	}
} 
