package org.example.services;

import org.example.entities.Aluno;
import org.example.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository repository;

    public List<Aluno> findAll(){
        return repository.findAll();
    }

    public Aluno findById(Integer id) {
        Optional<Aluno> obj = repository.findById(id);
        return obj.get();

    }

    public Aluno insert(Aluno obj) {
        return repository.save(obj);

    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

    @SuppressWarnings("deprecation")
    public Aluno update(Integer id, Aluno obj) {
        Aluno entity = repository.getOne(id);
        updateData(entity, obj);
        return repository.save(entity);
    }

    private void updateData(Aluno entity, Aluno obj){
        entity.setIdAluno(obj.getIdAluno());
        entity.setCpf(obj.getCpf());
        entity.setDataNascimento(obj.getDataNascimento());
        entity.setEmail(obj.getEmail());
        entity.setEndereco(obj.getEndereco());
        entity.setStatusAluno(obj.getStatusAluno());
        entity.setTelefone(obj.getTelefone());
    }
}
