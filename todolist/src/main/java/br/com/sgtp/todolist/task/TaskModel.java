package br.com.sgtp.todolist.task;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
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

 //quantidade de caracteres, "length = 50"
 @Column(length = 50)
 private String title;
 private LocalDateTime startAT;
 private LocalDateTime endAT;
 private String priority;

 @CreationTimestamp
 private LocalDateTime createdAT;

 private UUID idUser;

 public void setTitle(String title) throws Exception {
    if(title.length() > 50) {
          throw new Exception("O campo title deve conter no máximo 50 caracteres");
    }
   
    this.title = title;
 }


}
