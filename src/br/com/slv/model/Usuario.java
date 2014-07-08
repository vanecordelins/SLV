package br.com.slv.model;

import java.util.List;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Classe modela a entidade usuario.
 * 
 * @author lucianoserafim
 * @author ramonsantos
 */

@Entity
public class Usuario {

    @Id
    @GeneratedValue
    private Long id;
   
    private String cpf;
    private String nome;
    private String rgUsuario;
    private String orgaoExpeditor;
    private String identificador;
    private String senha;
    private String email;
    private char sexo;
    
    @Embedded
    private Endereco endereco = new Endereco();
    private String telefoneResidencial;
    private String telefoneCelular;
    
    @ManyToOne
    private Setor setorAlocado;
    
    @OneToMany(mappedBy="usuarioSolicitante")
    private List<SolicitacaoViagem> listaSolicitacoesViagens;

    public Usuario(){
        
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

    public String getRgUsuario() {
        return rgUsuario;
    }

    public void setRgUsuario(String rgUsuario) {
        this.rgUsuario = rgUsuario;
    }

    public String getOrgaoExpeditor() {
        return orgaoExpeditor;
    }

    public void setOrgaoExpeditor(String orgaoExpeditor) {
        this.orgaoExpeditor = orgaoExpeditor;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
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

    public Setor getSetorAlocado() {
        return setorAlocado;
    }

    public void setSetorAlocado(Setor setorAlocado) {
        this.setorAlocado = setorAlocado;
    }
    
    public List<SolicitacaoViagem> getListaSolicitacoesViagens() {
        return listaSolicitacoesViagens;
    }

    public void setListaSolicitacoesViagens(List<SolicitacaoViagem> listaSolicitacoesViagens) {
        this.listaSolicitacoesViagens = listaSolicitacoesViagens;
    }
    
}
