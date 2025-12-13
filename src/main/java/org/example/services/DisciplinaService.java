package org.example.services;

import org.example.entities.Disciplina;
import org.example.repositories.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DisciplinaService {

    @Autowired
    private DisciplinaRepository repository;

    public List<Disciplina> findAll(){
        return repository.findAll();
    }

    public Disciplina findById(Integer id){
        Optional<Disciplina> obj = repository.findById(id);
        return obj.get();
    }

    public Disciplina insert (Disciplina obj) {
        return repository.save(obj);
    }

    public void delete(Integer id){
        repository.deleteById(id);
    }

    @SuppressWarnings("deprecation")
    public Disciplina update(Integer id, Disciplina obj){
        Disciplina entity = repository.getOne(id);
        updateData(entity, obj);
        return repository.save(entity);
    }

    private void updateData(Disciplina entity, Disciplina obj){
        entity.setIdDisciplina(obj.getIdDisciplina());
        entity.setCargaHoraria(obj.getCargaHoraria());
        entity.setCodigo(obj.getCodigo());
        entity.setSemestre(obj.getSemestre());
        entity.setNome(obj.getNome());
        entity.setEmenta(obj.getEmenta());
        entity.setTipo(obj.getTipo());
        entity.setStatusDisciplina(obj.getStatusDisciplina());
    }
}
