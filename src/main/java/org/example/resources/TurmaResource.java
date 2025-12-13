package org.example.resources;

import org.example.entities.Turma;
import org.example.services.TurmaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/turmas")
public class TurmaResource {
    @Autowired
    private TurmaService service;

    @GetMapping
    public ResponseEntity<List<Turma>> findAll(){
        List<Turma> list = service.findAll();
        return ResponseEntity.ok().body(list);

    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Turma> findById(@PathVariable Integer id){
        Turma obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity<Turma> insert(@RequestBody Turma obj){
        obj = service.insert(obj);
        return ResponseEntity.noContent().build();
    }


    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        service.delete(id);
        return ResponseEntity.noContent().build();

    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Turma> update(@PathVariable Integer id, @RequestBody Turma obj){
        obj = service.update(id, obj);
        return ResponseEntity.ok().body(obj);
    }
}
