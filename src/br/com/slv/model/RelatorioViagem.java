package br.com.slv.model;

import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Classe modela a entidade RelatorioViagem.
 * 
 * @author ramonsantos
 */

@Entity
public class RelatorioViagem {
    
    @Id
    @GeneratedValue
    private Long id;
    
    private String protocolo;
    private String ocorrencia;
    private float kmSaida;
    private float kmChegada;
    
    @Temporal(TemporalType.DATE)
    private Calendar dataChegada;
    
    @Temporal(TemporalType.TIME)
    private Calendar horaChegada;
   
    @ManyToOne
    private Motorista motoristaResponsavel;
    
    @OneToOne
    private SolicitacaoViagem solicitacaoViagem;

    public RelatorioViagem(){
        
    }
    
    public Long getId() {
        return id;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    public String getOcorrencia() {
        return ocorrencia;
    }

    public void setOcorrencia(String ocorrencia) {
        this.ocorrencia = ocorrencia;
    }

    public float getKmSaida() {
        return kmSaida;
    }

    public void setKmSaida(float kmSaida) {
        this.kmSaida = kmSaida;
    }

    public float getKmChegada() {
        return kmChegada;
    }

    public void setKmChegada(float kmChegada) {
        this.kmChegada = kmChegada;
    }

    public Calendar getDataChegada() {
        return dataChegada;
    }

    public void setDataChegada(Calendar dataChegada) {
        this.dataChegada = dataChegada;
    }

    public Calendar getHoraChegada() {
        return horaChegada;
    }

    public void setHoraChegada(Calendar horaChegada) {
        this.horaChegada = horaChegada;
    }

    public Motorista getMotoristaResponsavel() {
        return motoristaResponsavel;
    }

    public void setMotoristaResponsavel(Motorista motoristaResponsavel) {
        this.motoristaResponsavel = motoristaResponsavel;
    }

    public SolicitacaoViagem getSolicitacaoViagem() {
        return solicitacaoViagem;
    }

    public void setSolicitacaoViagem(SolicitacaoViagem solicitacaoViagem) {
        this.solicitacaoViagem = solicitacaoViagem;
    }
    
}
