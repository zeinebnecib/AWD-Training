package esprit.job.service;

import esprit.job.entity.Job;
import esprit.job.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepository jobRepository;

    public Job addJob(Job job) {
        return jobRepository.save(job);
    }

    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }

    public Job getJobById(int id) {
        return jobRepository.findById(id).orElse(null);
    }

    public Job updateEtat(int id, boolean newEtat) {
        var existingJob = jobRepository.findById(id).orElse(null);
        if (existingJob != null) {
            existingJob.setEtat(newEtat);
            return jobRepository.save(existingJob);
        } else {
            return null;
        }
    }

}
