package esprit.job.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
public class Job implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String service;
    private Boolean etat;

    public Job() {
        super();
    }

    public Job(String service, Boolean etat) {
        super();
        this.service = service;
        this.etat = etat;
    }

    public int getId() { return id; }

    public String getService() { return service; }
    public void setService(String service) { this.service = service; }

    public Boolean getEtat() { return etat; }
    public void setEtat(Boolean etat) { this.etat = etat; }
}