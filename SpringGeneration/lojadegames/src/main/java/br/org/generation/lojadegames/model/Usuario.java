package br.org.generation.lojadegames.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_usuarios")
public class Usuario {
	
	//Gerando Chave Primaria
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//Criando Nome para usuario
	@NotBlank(message = "O atributo Nome é obrigatório!!!")
	private String nome;
	
	// Criando o usuario
	@NotBlank(message = "O atributo Usuario é obrigatório!!!")
	@Email(message = "O atributo Email é obrigatório e deve ser válido!!!")
	private String usuario;
	
	// Criando a senha
	@NotBlank(message = "O atributo Senha é obrigatório!!!")
	@Size(min = 8, message = "A Senha deve conter no mínimo 8 caracteres!!!")
	private String senha;
	
	/*// Criando a Data de Nascimento
	@NotBlank(message = "O atributo Data de Nascimento é obrigatório!!!")
	private LocalDate dataNascimento; */

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	

}
