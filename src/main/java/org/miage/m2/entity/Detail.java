package org.miage.m2.entity;

import java.util.List;
import org.springframework.hateoas.core.Relation;

@Relation(collectionRelation="cours")
public class Detail extends Cours {

    private final List<Intervenant> intervenants;

    public Detail(Cours cours, List<Intervenant> intervenants) {
        super(cours);
        this.intervenants = intervenants;
    }

    public List<Intervenant> getIntervenants() {
        return intervenants;
    }
}
