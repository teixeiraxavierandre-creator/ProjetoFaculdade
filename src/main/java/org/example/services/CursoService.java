package org.example.services;

import org.example.entities.Aluno;
import org.example.entities.Curso;
import org.example.repositories.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoService {
    @Autowired
    private CursoRepository repository;

    public List<Curso> findAll(){
        return repository.findAll();
    }

    public Curso findById(Integer id){
        Optional<Curso> obj = repository.findById(id);
        return obj.get();
    }

    public Curso insert (Curso obj) {
        return repository.save(obj);
    }

    public void delete(Integer id){
        repository.deleteById(id);
    }

    @SuppressWarnings("deprecation")
    public Curso update(Integer id, Curso obj){
        Curso entity = repository.getOne(id);
        updateData(entity, obj);
        return repository.save(entity);
    }

    private void updateData(Curso entity, Curso obj){
        entity.setIdCurso(obj.getIdCurso());
        entity.setNome(obj.getNome());
        entity.setNivel(obj.getNivel());
        entity.setTurno(obj.getTurno());
        entity.setCargaHoraria(obj.getCargaHoraria());
        entity.setTelefone(obj.getTelefone());
        entity.setDataContratacao(obj.getDataContratacao());
        entity.setSalario(entity.getSalario());
    }
}
