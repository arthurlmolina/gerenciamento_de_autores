package com.example.gerenciamento_de_autores.repositories;

import com.example.gerenciamento_de_autores.models.AutorModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<AutorModel, Long> {
}
