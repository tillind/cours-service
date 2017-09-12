package org.miage.m2.boundary;

import java.util.List;
import java.util.stream.Collectors;
import org.miage.m2.entity.Cours;
import org.miage.m2.entity.Detail;
import org.miage.m2.entity.Intervenant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.ResourceProcessor;
import org.springframework.stereotype.Service;

@Service
public class CoursProcessor implements ResourceProcessor<Resource<? extends Cours>> {

    @Autowired
    IntervenantClient client;

    @Override
    public Resource<Detail> process(Resource<? extends Cours> resource) {
        Cours cours = resource.getContent();
        List<Intervenant> intervenants = cours
                .getIntervenantsId()
                .stream()
                .map(client::get)
                .collect(Collectors.toList());
        return new Resource<>(new Detail(cours, intervenants), resource.getLinks());
    }
}
