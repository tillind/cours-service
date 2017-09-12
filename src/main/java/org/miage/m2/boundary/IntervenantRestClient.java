package org.miage.m2.boundary;

import org.miage.m2.entity.Intervenant;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("intervenants-service")
public interface IntervenantRestClient {

    @RequestMapping(method = RequestMethod.GET, value = "/intervenants/{id}")
    Intervenant get(@PathVariable("id") String id);
}
