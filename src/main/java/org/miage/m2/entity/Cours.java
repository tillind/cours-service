package org.miage.m2.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Set;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cours {

    @Id
    private String id;
    private String nom;
    private String description;
    @ElementCollection
    @JsonProperty("intervenants-id")
    private Set<String> intervenantsId;

    public Cours() {
    }

    public Cours(Cours cours) {
        this.id = cours.id;
        this.nom = cours.nom;
        this.description = cours.description;
        this.intervenantsId = cours.intervenantsId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<String> getIntervenantsId() {
        return intervenantsId;
    }

    public void setIntervenantsId(Set<String> intervenantsId) {
        this.intervenantsId = intervenantsId;
    }

    
}
