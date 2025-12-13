package org.example.services;

import org.example.entities.Faculdade;
import org.example.repositories.FaculdadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FaculdadeService {

    @Autowired
    private FaculdadeRepository repository;

    public List<Faculdade> findAll(){
        return repository.findAll();
    }

    public Faculdade findById(Integer id){
        Optional<Faculdade> obj = repository.findById(id);
        return obj.get();
    }

    public Faculdade insert (Faculdade obj) {
        return repository.save(obj);
    }

    public void delete(Integer id){
        repository.deleteById(id);
    }

    @SuppressWarnings("deprecation")
    public Faculdade update(Integer id, Faculdade obj){
        Faculdade entity = repository.getOne(id);
        updateData(entity, obj);
        return repository.save(entity);
    }

    private void updateData(Faculdade entity, Faculdade obj){
        entity.setIdFalcudade(obj.getIdFalcudade());
        entity.setNome(obj.getNome());
        entity.setCnpj(obj.getCnpj());
        entity.setEndereco(obj.getEndereco());
        entity.setTelefone(obj.getTelefone());
    }
}
