package esprit.job.controller;

import esprit.job.entity.Job;
import esprit.job.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobRestAPI {

    @Autowired
    private JobService jobService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Job> createJob(@RequestBody Job job) {
        return new ResponseEntity<>(jobService.addJob(job), HttpStatus.OK);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Job> getAllJobs() {
        return jobService.getAllJobs();
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Job> getJobById(@PathVariable int id) {
        var job = jobService.getJobById(id);
        if(job != null)
            return new ResponseEntity<>(job, HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping(value = "/{id}/etat", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Job> updateEtat(@PathVariable int id, @RequestParam boolean etat) {
        var job = jobService.updateEtat(id, etat);
        if(job != null)
            return new ResponseEntity<>(job, HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}