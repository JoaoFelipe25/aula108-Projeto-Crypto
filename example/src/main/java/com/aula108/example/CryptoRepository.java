package com.aula108.example;

import java.util.List;

import org.springframework.data.repository.CrudRepository;



public interface CryptoRepository extends CrudRepository<Cryptocurrency, Integer>{

    Cryptocurrency findByName(String name);  

    Cryptocurrency findById(int id);

    Cryptocurrency findBySymbol(String symbol);
}
   
 