package org.example.services;

import org.example.entities.Matricula;
import org.example.repositories.MatriculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MatriculaService {

    @Autowired
    private MatriculaRepository repository;

    public List<Matricula> findAll(){
        return repository.findAll();
    }

    public Matricula findById(Integer id){
        Optional<Matricula> obj = repository.findById(id);
        return obj.get();
    }

    public Matricula insert (Matricula obj) {
        return repository.save(obj);
    }

    public void delete(Integer id){
        repository.deleteById(id);
    }

    @SuppressWarnings("deprecation")
    public Matricula update(Integer id, Matricula obj){
        Matricula entity = repository.getOne(id);
        updateData(entity, obj);
        return repository.save(entity);
    }

    private void updateData(Matricula entity, Matricula obj){
        entity.setIdMatricula(entity.getIdMatricula());
        entity.setSemestre(obj.getSemestre());
        entity.setDataMatricula(obj.getDataMatricula());
        entity.setStatus(obj.getStatus());
        entity.setValor(obj.getValor());
    }
}
