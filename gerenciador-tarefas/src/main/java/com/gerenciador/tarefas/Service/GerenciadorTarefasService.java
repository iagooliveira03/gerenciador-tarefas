package com.gerenciador.tarefas.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerenciador.tarefas.entity.Tarefa;
import com.gerenciador.tarefas.repository.GerenciadorTarefasRepository;
import com.gerenciador.tarefas.request.CadatrarTarefaRequest;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class GerenciadorTarefasService {
	
	@Autowired
	private GerenciadorTarefasRepository gerenciadorTarefasRepository;
	@Autowired
	private UsuarioService usuarioService;
	
	public Tarefa salvarTarefa(CadatrarTarefaRequest request ) {
		
		Tarefa tarefa = new Tarefa.builder().quantidadeHorasEastimadas(request.getQuantidaHorasEstimada()).status(request.getStatus()).titulo(request.getTitulo()).descricao(request.getDescricao()).build();
		
		gerenciadorTarefasRepository.save();
		
		
	
	}

}
