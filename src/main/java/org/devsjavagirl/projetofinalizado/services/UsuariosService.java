package org.devsjavagirl.projetofinalizado.services;

import java.util.List;

import org.devsjavagirl.projetofinalizado.models.Usuarios;
import org.devsjavagirl.projetofinalizado.repositories.UsuariosRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuariosService {

	private final UsuariosRepository usuariosRepository;
	
	public UsuariosService(UsuariosRepository usuariosRepository) {
		this.usuariosRepository = usuariosRepository;
	}
	
	public List<Usuarios> listar(){
		return usuariosRepository.findAll();
	}
	
	public void salvar(Usuarios novoUsuario) {
		usuariosRepository.save(novoUsuario);
	}

}
