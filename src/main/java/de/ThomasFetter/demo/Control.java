package controller;


import db.WunschListe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import repository.WunschListeRepository;

import java.util.List;

@RestController
public class Control {

    private WunschListeRepository wunschListeRepository;

    @Autowired
    public void setWunschListeRepository(WunschListeRepository wunschListeRepository) {
        this.wunschListeRepository = wunschListeRepository;
    }

    @PostMapping(value = "/insert", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<WunschListe> eintragen(@RequestBody WunschListe w){
        WunschListe wunschListe = wunschListeRepository.save(w);
        return new ResponseEntity<>(wunschListe, HttpStatus.CREATED);
    }

    @GetMapping("/init")
    public void bla(){
        WunschListe w1 = new WunschListe();
        w1.setWunsch("blubb f i u e");
        wunschListeRepository.save(w1);
    }
    @GetMapping("/insert")
    public List<WunschListe> getAll(){
        return wunschListeRepository.findAll();
    }

    @DeleteMapping("/insert/{id}")
    public void delete(@PathVariable Long id){
        wunschListeRepository.deleteById(id);
    }


}
