package br.com.freelancer.sgdoc.login;

import javax.transaction.Transactional;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.freelancer.sgdoc.model.Permissao;
import br.com.freelancer.sgdoc.model.Usuario;
import br.com.freelancer.sgdoc.repository.PermissaoRepository;
import br.com.freelancer.sgdoc.repository.UsuarioRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class UsuarioTest {
	
	@Autowired
	BCryptPasswordEncoder bcryptPasswordEncoder;
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@Autowired
	PermissaoRepository permissaoRepository;
	
	
	@Test
	public void cadastrarUsuarios() {
		Permissao permissao = permissaoRepository.save(new Permissao("admin"));
		permissao.getPermissao();
		Assert.assertEquals(permissao.getPermissao(), "admin");
		Usuario usuario = usuarioRepository.save(new Usuario("cassiano",bcryptPasswordEncoder.encode("123"),'S'));
		Assert.assertEquals(usuario.getUsername(), "cassiano");
	
		
		//Assert.assertEquals(usuarioPermissao.getPermissao(), "admin");
		//Assert.assertEquals(usuarioPermissao.getUsuario(), "cassiano");
	}
	
	//$2a$10$FnPy1yUr9RN13kjsmG1Mc.TXzzXo3eJgu40yX2dNw680sr9qbEoqa
}
