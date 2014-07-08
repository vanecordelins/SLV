package br.com.slv.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Classe modela a entidade SolicitacaoViagem.
 * 
 * @author lucianoserafim
 * @author ramonsantos
 */

@Entity
public class SolicitacaoViagem {

    @Id
    @GeneratedValue
    private Long id;
    
    private String protocolo;
    private String naturezaTrabalho;
    private String curso;
    private String itinerario;
    private int quantPessoas;
    private char status;
    
    @Temporal(TemporalType.TIME)
    private Calendar horaSaida;
    
    @Temporal(TemporalType.TIME)
    private Calendar horaChegadaPrevista;
    
    @Temporal(TemporalType.DATE)
    private Calendar dataViagem;
    
    @Temporal(TemporalType.DATE)
    private Calendar dataSolicitacao;
    
    @ManyToOne
    private Usuario usuarioSolicitante;
    
    @ManyToOne
    private Veiculo veiculoViagem;
    
    @OneToOne
    private RelatorioViagem relatorioViagem;
    
    @ManyToMany
    private List<Aluno> listaAlunos = new ArrayList<Aluno>();

    public SolicitacaoViagem(){
        
    }
    
    
}
