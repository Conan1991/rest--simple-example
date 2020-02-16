package com.doronin.springrestapiexample.Controller;


import com.doronin.springrestapiexample.Entity.Prod;
import com.doronin.springrestapiexample.Repository.ProdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

@RestController
@RequestMapping("/prods")
public class ProdController {

    private ProdRepository prodRepository;

    private final EntityManager entityManager;

    @Autowired
    public ProdController(ProdRepository prodRepository, EntityManager entityManager) {
        this.prodRepository = prodRepository;
        this.entityManager = entityManager;
    }

    @RequestMapping("/")
    public String welcome() {//Welcome page, non-rest
        return " this is prods ";
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Prod> getAll() {
        return prodRepository.findAll();
    }

    @RequestMapping(value = "/ByName/{name}", method = RequestMethod.GET)
    public List<Prod> getProByID(@PathVariable String name) {
        TypedQuery<Prod> query = entityManager.
                createQuery("SELECT p FROM Prod p where p.name LIKE :name", Prod.class).setParameter("name", "%" + name + "%");
        return query.getResultList();
    }




}
