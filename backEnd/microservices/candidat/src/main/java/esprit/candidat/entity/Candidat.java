package esprit.candidat.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
public class Candidat implements Serializable {
    private static final long serialVersionUID = 6L;

    @Id
    @GeneratedValue
    private int id;
    private String nom, prenom, email;

    public Candidat() {
        super();
    }

    public Candidat(String nom, String prenom, String email) {
        super();
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Candidat [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + "]";
    }
}