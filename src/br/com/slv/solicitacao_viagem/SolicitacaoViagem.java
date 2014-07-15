package br.com.slv.solicitacao_viagem;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.slv.motorista.Motorista;
import br.com.slv.participantes.Participantes;
import br.com.slv.relatorio_viagem.RelatorioViagem;
import br.com.slv.usuario.Usuario;
import br.com.slv.veiculo.Veiculo;

/**
 * Classe modela a entidade SolicitacaoViagem.
 * 
 * @author lucianoserafim
 * @author ramonsantos
 */

@Entity
public class SolicitacaoViagem implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4214344606581227976L;

	@Id
	@GeneratedValue
	private Long id;

	private String protocolo;
	private String naturezaTrabalho;
	private String curso;
	private String itinerario;
	private int quantidadePessoas;
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
	
	@ManyToOne
	private Motorista motoristaAlocado;
	
	@Embedded
	List<Participantes> listaParticipantes;

	public SolicitacaoViagem() {

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

	public String getNaturezaTrabalho() {
		return naturezaTrabalho;
	}

	public void setNaturezaTrabalho(String naturezaTrabalho) {
		this.naturezaTrabalho = naturezaTrabalho;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getItinerario() {
		return itinerario;
	}

	public void setItinerario(String itinerario) {
		this.itinerario = itinerario;
	}

	public int getQuantPessoas() {
		return quantidadePessoas;
	}

	public void setQuantPessoas(int quantPessoas) {
		this.quantidadePessoas = quantPessoas;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	public Calendar getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(Calendar horaSaida) {
		this.horaSaida = horaSaida;
	}

	public Calendar getHoraChegadaPrevista() {
		return horaChegadaPrevista;
	}

	public void setHoraChegadaPrevista(Calendar horaChegadaPrevista) {
		this.horaChegadaPrevista = horaChegadaPrevista;
	}

	public Calendar getDataViagem() {
		return dataViagem;
	}

	public void setDataViagem(Calendar dataViagem) {
		this.dataViagem = dataViagem;
	}

	public Calendar getDataSolicitacao() {
		return dataSolicitacao;
	}

	public void setDataSolicitacao(Calendar dataSolicitacao) {
		this.dataSolicitacao = dataSolicitacao;
	}

	public Usuario getUsuarioSolicitante() {
		return usuarioSolicitante;
	}

	public void setUsuarioSolicitante(Usuario usuarioSolicitante) {
		this.usuarioSolicitante = usuarioSolicitante;
	}

	public Veiculo getVeiculoViagem() {
		return veiculoViagem;
	}

	public void setVeiculoViagem(Veiculo veiculoViagem) {
		this.veiculoViagem = veiculoViagem;
	}

	public RelatorioViagem getRelatorioViagem() {
		return relatorioViagem;
	}

	public void setRelatorioViagem(RelatorioViagem relatorioViagem) {
		this.relatorioViagem = relatorioViagem;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((curso == null) ? 0 : curso.hashCode());
		result = prime * result
				+ ((dataSolicitacao == null) ? 0 : dataSolicitacao.hashCode());
		result = prime * result
				+ ((dataViagem == null) ? 0 : dataViagem.hashCode());
		result = prime
				* result
				+ ((horaChegadaPrevista == null) ? 0 : horaChegadaPrevista
						.hashCode());
		result = prime * result
				+ ((horaSaida == null) ? 0 : horaSaida.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((itinerario == null) ? 0 : itinerario.hashCode());
		result = prime
				* result
				+ ((naturezaTrabalho == null) ? 0 : naturezaTrabalho.hashCode());
		result = prime * result
				+ ((protocolo == null) ? 0 : protocolo.hashCode());
		result = prime * result + quantidadePessoas;
		result = prime * result
				+ ((relatorioViagem == null) ? 0 : relatorioViagem.hashCode());
		result = prime * result + status;
		result = prime
				* result
				+ ((usuarioSolicitante == null) ? 0 : usuarioSolicitante
						.hashCode());
		result = prime * result
				+ ((veiculoViagem == null) ? 0 : veiculoViagem.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SolicitacaoViagem other = (SolicitacaoViagem) obj;
		if (curso == null) {
			if (other.curso != null)
				return false;
		} else if (!curso.equals(other.curso))
			return false;
		if (dataSolicitacao == null) {
			if (other.dataSolicitacao != null)
				return false;
		} else if (!dataSolicitacao.equals(other.dataSolicitacao))
			return false;
		if (dataViagem == null) {
			if (other.dataViagem != null)
				return false;
		} else if (!dataViagem.equals(other.dataViagem))
			return false;
		if (horaChegadaPrevista == null) {
			if (other.horaChegadaPrevista != null)
				return false;
		} else if (!horaChegadaPrevista.equals(other.horaChegadaPrevista))
			return false;
		if (horaSaida == null) {
			if (other.horaSaida != null)
				return false;
		} else if (!horaSaida.equals(other.horaSaida))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (itinerario == null) {
			if (other.itinerario != null)
				return false;
		} else if (!itinerario.equals(other.itinerario))
			return false;
		if (naturezaTrabalho == null) {
			if (other.naturezaTrabalho != null)
				return false;
		} else if (!naturezaTrabalho.equals(other.naturezaTrabalho))
			return false;
		if (protocolo == null) {
			if (other.protocolo != null)
				return false;
		} else if (!protocolo.equals(other.protocolo))
			return false;
		if (quantidadePessoas != other.quantidadePessoas)
			return false;
		if (relatorioViagem == null) {
			if (other.relatorioViagem != null)
				return false;
		} else if (!relatorioViagem.equals(other.relatorioViagem))
			return false;
		if (status != other.status)
			return false;
		if (usuarioSolicitante == null) {
			if (other.usuarioSolicitante != null)
				return false;
		} else if (!usuarioSolicitante.equals(other.usuarioSolicitante))
			return false;
		if (veiculoViagem == null) {
			if (other.veiculoViagem != null)
				return false;
		} else if (!veiculoViagem.equals(other.veiculoViagem))
			return false;
		return true;
	}

}
