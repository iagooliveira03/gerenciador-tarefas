package com.gerenciador.tarefas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gerenciador.tarefas.entity.Tarefa;

@Repository
public interface GerenciadorTarefasRepository extends JpaRepository<Tarefa, Long> {

}
