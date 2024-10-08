package br.com.sgtp.todolist.task;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "task_tab")
public class TaskModel {

    /**
 * ID
 * Usuario
 * Descrição
 * Titulo
 * Data inicio
 * Data termino
 * Prioridade
 */

@Id
@GeneratedValue(generator = "UUID")
 private UUID id;
 private String description;

 @Column(length = 100)
 private String title;
 private LocalDateTime startAT;
 private LocalDateTime endAT;
 private String priority;

 private LocalDateTime createdAT;

 private UUID idUser;


}
