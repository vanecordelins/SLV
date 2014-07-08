package br.com.slv.model;

import java.util.Calendar;
import java.util.List;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Classe modela a entidade Motorista.
 * 
 * @author ramonsantos
 */

@Entity
public class Motorista {

    @Id
    @GeneratedValue
    private Long id;
    
    private String cpf;
    private String nome;
    private String rg;
    private String orgaoExpeditor;
    private String senha;
    private char sexo;
    private String telefoneResidencial;
    private String telefoneCelular;
    private String cnh;
    private String email;
    private boolean disponibilidade;
    
    @OneToMany(mappedBy="motoristaResponsavel")
    private List<RelatorioViagem> historicoViagens;
    
    @Embedded
    private Endereco endereco = new Endereco();
    
    @Temporal(TemporalType.TIME)
    private Calendar horasExtras;

    public Motorista(){
        
    }
    
    public Long getId() {
        return id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getOrgaoExpeditor() {
        return orgaoExpeditor;
    }

    public void setOrgaoExpeditor(String orgaoExpeditor) {
        this.orgaoExpeditor = orgaoExpeditor;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getTelefoneResidencial() {
        return telefoneResidencial;
    }

    public void setTelefoneResidencial(String telefoneResidencial) {
        this.telefoneResidencial = telefoneResidencial;
    }

    public String getTelefoneCelular() {
        return telefoneCelular;
    }

    public void setTelefoneCelular(String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Calendar getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(Calendar horasExtras) {
        this.horasExtras = horasExtras;
    }

}
