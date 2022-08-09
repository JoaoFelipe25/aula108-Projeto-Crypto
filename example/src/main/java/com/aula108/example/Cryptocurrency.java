package com.aula108.example;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Cryptocurrency {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String symbol;

    protected Cryptocurrency(){}

    public Cryptocurrency(String name, String symbol){
       
        this.name =name;
        this.symbol =symbol;
    }

    @Override
    public String toString(){
        return String.format("Crypto: [id=%d, name=%s, symbol=%s]", id, name, symbol);
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }
        
    
}
