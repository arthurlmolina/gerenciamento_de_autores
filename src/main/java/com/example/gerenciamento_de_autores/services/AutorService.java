package com.example.gerenciamento_de_autores.services;

import com.example.gerenciamento_de_autores.models.AutorModel;
import com.example.gerenciamento_de_autores.repositories.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutorService {

    @Autowired
    AutorRepository autorRepository;

    public List<AutorModel> findAll(){
        return autorRepository.findAll();
    }

    public Optional<AutorModel> buscarPorId(Long id){
        return autorRepository.findById(id);
    }

    public AutorModel criarAutor(AutorModel autorModel){
        return autorRepository.save(autorModel);
    }

    public AutorModel atualizar(AutorModel autorModel, Long id){
        AutorModel autor = autorRepository.findById(id).get();
        autor.setNome(autorModel.getNome());
        return autorRepository.save(autor);
    }

    public void deletar(Long id){
        autorRepository.deleteById(id);
    }
}
