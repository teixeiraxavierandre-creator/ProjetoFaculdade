package org.example.services;

import org.example.entities.Turma;
import org.example.repositories.TurmaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TurmaService {
    @Autowired
    private TurmaRepository repository;

    public List<Turma> findAll(){
        return repository.findAll();
    }

    public Turma findById(Integer id){
        Optional<Turma> obj = repository.findById(id);
        return obj.get();
    }

    public Turma insert (Turma obj) {
        return repository.save(obj);
    }

    public void delete(Integer id){
        repository.deleteById(id);
    }

    @SuppressWarnings("deprecation")
    public Turma update(Integer id, Turma obj){
        Turma entity = repository.getOne(id);
        updateData(entity, obj);
        return repository.save(entity);
    }

    private void updateData(Turma entity, Turma obj){
        entity.setIdTurma(obj.getIdTurma());
        entity.setAno(obj.getAno());
        entity.setSemestre(obj.getSemestre());
    }
}
