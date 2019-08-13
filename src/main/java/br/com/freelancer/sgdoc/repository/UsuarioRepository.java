package br.com.freelancer.sgdoc.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.freelancer.sgdoc.model.Usuario;


public interface UsuarioRepository extends CrudRepository<Usuario,String>{
	
	Usuario findByUsuario (String usuario);

}
