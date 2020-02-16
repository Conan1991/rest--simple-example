package com.doronin.springrestapiexample.Repository;


import com.doronin.springrestapiexample.Entity.Prod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdRepository extends JpaRepository<Prod, Integer> {
}
