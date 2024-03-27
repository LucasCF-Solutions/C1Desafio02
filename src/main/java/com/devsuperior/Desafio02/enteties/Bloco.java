package com.devsuperior.Desafio02.enteties;

import java.time.Instant;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_bloco")
public class Bloco {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	//@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant inicio;
	//@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant fim;
	
	@ManyToOne
    @JoinColumn(name = "atividade_id")
	private Atividade atividade;
	
	@Autowired
	public Bloco() {
		
	}
	
	public Bloco(Instant inicio, Instant fim) {
		super();
		this.inicio = inicio;
		this.fim = fim;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getInicio() {
		return inicio;
	}

	public void setInicio(Instant inicio) {
		this.inicio = inicio;
	}

	public Instant getFim() {
		return fim;
	}

	public void setFim(Instant fim) {
		this.fim = fim;
	}

	
	public Atividade getAtividade() {
		return atividade;
	}

	public void setAtividade(Atividade atividade) {
		this.atividade = atividade;
	}

	@Override
	public String toString() {
		return "Bloco [id=" + id + ", inicio=" + inicio + ", fim=" + fim + "]";
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
		Bloco other = (Bloco) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
}
