package br.com.freelancer.sgdoc.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.springframework.security.core.GrantedAuthority;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Permissao implements GrantedAuthority, Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public Permissao() {}
	
	public Permissao(String permissao) {
		this.permissao = permissao;
	}

	@Id
	@Getter @Setter private String permissao;
	
	@Override
	public String getAuthority() {
		return this.permissao;
	}
	
	@ManyToMany(mappedBy = "permissoes")
	private List<Usuario> usuarios;
}
