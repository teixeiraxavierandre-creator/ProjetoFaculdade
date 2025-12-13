package org.example.resources;

import org.example.entities.Matricula;
import org.example.services.MatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/matriculas")
public class MatriculaResource {
    @Autowired
    private MatriculaService service;

    @GetMapping
    public ResponseEntity<List<Matricula>> findAll(){
        List<Matricula> list = service.findAll();
        return ResponseEntity.ok().body(list);

    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Matricula> findById(@PathVariable Integer id){
        Matricula obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity<Matricula> insert(@RequestBody Matricula obj){
        obj = service.insert(obj);
        return ResponseEntity.noContent().build();
    }


    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        service.delete(id);
        return ResponseEntity.noContent().build();

    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Matricula> update(@PathVariable Integer id, @RequestBody Matricula obj){
        obj = service.update(id, obj);
        return ResponseEntity.ok().body(obj);
    }
}
