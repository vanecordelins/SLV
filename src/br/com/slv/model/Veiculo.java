package br.com.slv.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Classe modela a entidade veiculo.
 * 
 * @author lucianoserafim
 * @author ramonsantos
 * 
 */

@Entity
public class Veiculo {

    @Id
    @GeneratedValue
    private Long id;
    
    private String tombamento;
    private String fabricante;
    private String modelo;
    private String cor;
    private String placa;
    private String anoFabricacao;
    private String chassi;
    private boolean disponibilidade;
    private float capacidadeLitros;
    private float kmPorLitro;
    private String tipo;
    
    @OneToMany(mappedBy="veiculoViagem")
    private List<SolicitacaoViagem> historicoSolicitacoes;

    public Veiculo(){
        
    }
    
    public Long getId() {
        return id;
    }

    public String getTombamento() {
        return tombamento;
    }

    public void setTombamento(String tombamento) {
        this.tombamento = tombamento;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(String anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public float getCapacidadeLitros() {
        return capacidadeLitros;
    }

    public void setCapacidadeLitros(float capacidadeLitros) {
        this.capacidadeLitros = capacidadeLitros;
    }

    public float getKmPorLitro() {
        return kmPorLitro;
    }

    public void setKmPorLitro(float kmPorLitro) {
        this.kmPorLitro = kmPorLitro;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<SolicitacaoViagem> getHistoricoSolicitacoes() {
        return historicoSolicitacoes;
    }

    public void setHistoricoSolicitacoes(List<SolicitacaoViagem> historicoSolicitacoes) {
        this.historicoSolicitacoes = historicoSolicitacoes;
    }
    
}
