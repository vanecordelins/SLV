package br.com.slv.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author ramonsantos
 */

@Entity
public class Aluno {
    
    @Id
    @GeneratedValue
    private Long id;
    
    private String nome;
    private String cpf;

    public Aluno(){
        
    }
    
    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
}
