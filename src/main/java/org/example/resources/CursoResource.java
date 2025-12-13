package org.example.resources;

import org.example.entities.Curso;
import org.example.services.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/cursos")
public class CursoResource {
    @Autowired
    private CursoService service;

    @GetMapping
    public ResponseEntity<List<Curso>> findAll(){
        List<Curso> list = service.findAll();
        return ResponseEntity.ok().body(list);

    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Curso> findById(@PathVariable Integer id){
        Curso obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity<Curso> insert(@RequestBody Curso obj){
        obj = service.insert(obj);
        return ResponseEntity.noContent().build();
    }


    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        service.delete(id);
        return ResponseEntity.noContent().build();

    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Curso> update(@PathVariable Integer id, @RequestBody Curso obj){
        obj = service.update(id, obj);
        return ResponseEntity.ok().body(obj);
    }
}
