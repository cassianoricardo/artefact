package br.com.freelancer.sgdoc.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
public class Usuario implements UserDetails, Serializable{

	private static final long serialVersionUID = 1L;
	
	public Usuario(String usuario, String senha, char isEnabled) {
		super();
		this.usuario = usuario;
		this.senha = senha;
		this.isEnabled = isEnabled;
	}
	public Usuario() {}
	
	@Id
	private String usuario;
	private String senha;
	private char isEnabled;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return (Collection<? extends GrantedAuthority>) this.permissoes;
	}

	@Override
	public String getPassword() {
		return senha;
	}

	@Override
	public String getUsername() {
		return usuario;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return this.isEnabled == 'S' ? true : false;
	}
	
	@ManyToMany
	@JoinTable( 
	        name = "usuario_permissao", 
	        joinColumns = @JoinColumn(
	          name = "usuario", referencedColumnName = "usuario"), 
	        inverseJoinColumns = @JoinColumn(
	          name = "permissao", referencedColumnName = "permissao")) 
	private Set<Permissao> permissoes;

}
