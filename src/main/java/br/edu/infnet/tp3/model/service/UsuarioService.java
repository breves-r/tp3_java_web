package br.edu.infnet.tp3.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.tp3.model.domain.Usuario;
import br.edu.infnet.tp3.model.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public Usuario autenticacao(String email, String senha) {
		return usuarioRepository.autenticacao(email, senha); 
	}

	public void incluir(Usuario usuario) {
		usuarioRepository.save(usuario);
		
	}
		

	public Usuario obterPorId(Integer id) {
		return usuarioRepository.findById(id).orElse(null);
	}
	
	public void excluir(Integer id) {
		usuarioRepository.deleteById(id);
	}

}
