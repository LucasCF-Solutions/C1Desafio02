package com.devsuperior.Desafio02.enteties;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_participante")
public class Participante {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private String email;
	
	
	 @ManyToMany
	    @JoinTable(name = "tb_participante_atividade",
	            joinColumns = @JoinColumn(name = "participante_id"),
	            inverseJoinColumns = @JoinColumn(name = "atividade_id"))
	    private Set<Atividade>atividades = new HashSet<>();
	 
	@Autowired
	public Participante() {
		
	}
	public Participante(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Set<Atividade> getAtividades() {
		return atividades;
	}
	public void setAtividades(Set<Atividade> atividades) {
		this.atividades = atividades;
	}
	@Override
	public String toString() {
		return "Participante [id=" + id + ", nome=" + nome + ", email=" + email + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Participante other = (Participante) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}
