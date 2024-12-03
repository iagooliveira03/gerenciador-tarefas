package com.gerenciador.tarefas.request;



import com.gerenciador.tarefas.status.TarefaStatusEnum;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CadatrarTarefaRequest {

	private String titulo;
	private String descricao;
	private TarefaStatusEnum status;
	private Long resposanvelId;
	private Long criador;
	private int quantidaHorasEstimada;

//	public String getTitulo() {
//		return titulo;
//	}
//
//	public void setTitulo(String titulo) {
//		this.titulo = titulo;
//	}
//
//	public String getDescricao() {
//		return descricao;
//	}
//
//	public void setDescricao(String descricao) {
//		this.descricao = descricao;
//	}
//
//	public TarefasStatusEnum getStatus() {
//		return status;
//	}
//
//	public void setStatus(TarefasStatusEnum status) {
//		this.status = status;
//	}
//
//	public Long getResposanvelId() {
//		return resposanvelId;
//	}
//
//	public void setResposanvelId(Long resposanvelId) {
//		this.resposanvelId = resposanvelId;
//	}
//
//	public Long getCriador() {
//		return criador;
//	}
//
//	public void setCriador(Long criador) {
//		this.criador = criador;
//	}
//
//	public int getQuantidaHorasEstimada() {
//		return quantidaHorasEstimada;
//	}
//
//	public void setQuantidaHorasEstimada(int quantidaHorasEstimada) {
//		this.quantidaHorasEstimada = quantidaHorasEstimada;
//	}

}
