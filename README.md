# Workshop 1 - Architecture Microservices

Ce projet contient deux microservices développés avec Spring Boot dans le cadre de l'atelier sur les architectures distribuées.

## 📂 Structure du projet
- `backEnd/microservices/candidat` : Gestion des candidats (Base H2)
- `backEnd/microservices/Job` : Gestion des offres d'emploi (Base MySQL)

## 🚀 Instructions de lancement

### 1. Microservice Candidat
- **Port** : 8082
- **Base de données** : H2 (En mémoire)
- **Console H2** : http://localhost:8080/h2
- **URLs principales** :
  - Liste : `GET http://localhost:8080/candidats`
  - Recherche : `GET http://localhost:8080/candidats/search/candidatByNom?name=...`

### 2. Microservice Job
- **Port** : 8083
- **Base de données** : MySQL (Base `job_db`)
- **Configuration** : Vérifier `application.properties` pour les identifiants MySQL.
- **URLs principales** :
  - Liste : `GET http://localhost:8083/jobs`
  - Ajouter : `POST http://localhost:8083/jobs`
  - Changer état : `PUT http://localhost:8083/jobs/{id}/etat?etat=false`

## 👤 Auteur
- **Nom & Prénom** : Necib Zeineb
- **Groupe** : 5