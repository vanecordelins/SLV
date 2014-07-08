package br.com.slv.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Classe modela a entidade Setor.
 * 
 * @author ramonsantos
 */

@Entity
public class Setor {

    @Id
    @GeneratedValue
    private Long id;  
    
    private String nome;
    
    @OneToMany(mappedBy="setorAlocado")
    private List<Usuario> listaUsuarios;

    public Setor(){
        
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

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
    
}
