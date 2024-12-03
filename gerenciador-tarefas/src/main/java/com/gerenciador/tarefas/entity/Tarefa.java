package com.gerenciador.tarefas.entity;

import java.io.Serializable;
import java.time.LocalTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.gerenciador.tarefas.status.TarefaStatusEnum;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tarefas")
@Getter
@Setter
@Builder
public class Tarefa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	@Column(nullable = false)
	private String titulo;

	@Column(nullable = false)
	private String descricao;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private TarefaStatusEnum status;

	@Column(nullable = false)
	private Usuario resposanvel;

	@Column(nullable = false)
	private Usuario criador;

	@Column(nullable = false)
	private int quantidaHorasEstimada;

	@Column
	private Integer quantidaHorasRealizada;

	@Column
	@CreationTimestamp
	private LocalTime DataCadasto;

	@Column
	@UpdateTimestamp
	private LocalTime DataAtualizacao;

	@Column
	private LocalTime tempoRealizado;

}
