package org.example.services;

import org.example.entities.Professor;
import org.example.repositories.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfessorService {

    @Autowired
    private ProfessorRepository repository;

    public List<Professor> findAll(){
        return repository.findAll();
    }

    public Professor findById(Integer id){
        Optional<Professor> obj = repository.findById(id);
        return obj.get();
    }

    public Professor insert (Professor obj) {
        return repository.save(obj);
    }

    public void delete(Integer id){
        repository.deleteById(id);
    }

    @SuppressWarnings("deprecation")
    public Professor update(Integer id, Professor obj){
        Professor entity = repository.getOne(id);
        updateData(entity, obj);
        return repository.save(entity);
    }

    private void updateData(Professor entity, Professor obj){
        entity.setIdProfessor(obj.getIdProfessor());
        entity.setNome(obj.getNome());
        entity.setCpf(obj.getCpf());
        entity.setEmail(obj.getEmail());
        entity.setTitulacao(obj.getTitulacao());
    }
}
