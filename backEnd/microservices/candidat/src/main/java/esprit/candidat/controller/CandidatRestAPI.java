package esprit.candidat.controller;

import esprit.candidat.entity.Candidat;
import esprit.candidat.service.CandidatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController("candidats")
public class CandidatRestAPI {

    @Autowired
    private CandidatService candidatService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Candidat> createCandidat(@RequestBody Candidat candidat) {
        return new ResponseEntity<>(candidatService.addCandidat(candidat), HttpStatus.OK);
    }

    @PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Candidat> updateCandidat(@PathVariable int id,
                                                   @RequestBody Candidat candidat) {
        return new ResponseEntity<>(candidatService.updateCandidat(id, candidat), HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> deleteCandidat(@PathVariable int id) {
        return new ResponseEntity<>(candidatService.deleteCandidat(id), HttpStatus.OK);
    }
}