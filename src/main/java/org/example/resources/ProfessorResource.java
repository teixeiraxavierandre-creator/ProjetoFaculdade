package org.example.resources;

import org.example.entities.Professor;
import org.example.services.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/professores")
public class ProfessorResource {
    @Autowired
    private ProfessorService service;

    @GetMapping
    public ResponseEntity<List<Professor>> findAll(){
        List<Professor> list = service.findAll();
        return ResponseEntity.ok().body(list);

    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Professor> findById(@PathVariable Integer id){
        Professor obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity<Professor> insert(@RequestBody Professor obj){
        obj = service.insert(obj);
        return ResponseEntity.noContent().build();
    }


    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        service.delete(id);
        return ResponseEntity.noContent().build();

    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Professor> update(@PathVariable Integer id, @RequestBody Professor obj){
        obj = service.update(id, obj);
        return ResponseEntity.ok().body(obj);
    }
}
