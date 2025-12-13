package org.example.resources;

import org.example.entities.Faculdade;
import org.example.services.FaculdadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/faculdades")
public class FaculdadeResource {
    @Autowired
    private FaculdadeService service;

    @GetMapping
    public ResponseEntity<List<Faculdade>> findAll(){
        List<Faculdade> list = service.findAll();
        return ResponseEntity.ok().body(list);

    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Faculdade> findById(@PathVariable Integer id){
        Faculdade obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity<Faculdade> insert(@RequestBody Faculdade obj){
        obj = service.insert(obj);
        return ResponseEntity.noContent().build();
    }


    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        service.delete(id);
        return ResponseEntity.noContent().build();

    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Faculdade> update(@PathVariable Integer id, @RequestBody Faculdade obj){
        obj = service.update(id, obj);
        return ResponseEntity.ok().body(obj);
    }
}
