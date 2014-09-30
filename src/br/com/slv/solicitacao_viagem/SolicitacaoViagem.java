package br.com.slv.solicitacao_viagem;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
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
@Table(name = "solicitacaoviagem")
public class SolicitacaoViagem implements Serializable {

	private static final long serialVersionUID = -6865484452980630812L;

	@Id
	@GeneratedValue
	private Long idSolicitacaoViagem;

	private String protocolo;
	private String naturezaTrabalho;
	private String curso;
	private String itinerario;
	private int quantidadePessoas;

	@Column(nullable = false)
	private boolean status;

	@Temporal(TemporalType.TIME)
	private java.util.Date horaSaida;

	@Temporal(TemporalType.TIME)
	private java.util.Date horaChegadaPrevista;

	@Temporal(TemporalType.DATE)
	private java.util.Date dataViagem;

	@Temporal(TemporalType.DATE)
	private java.util.Date dataSolicitacao;

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

	public Long getIdSolicitacaoViagem() {
		return idSolicitacaoViagem;
	}

	public void setIdSolicitacaoViagem(Long idSolicitacaoViagem) {
		this.idSolicitacaoViagem = idSolicitacaoViagem;
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

	public int getQuantidadePessoas() {
		return quantidadePessoas;
	}

	public void setQuantidadePessoas(int quantidadePessoas) {
		this.quantidadePessoas = quantidadePessoas;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public java.util.Date getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(java.util.Date horaSaida) {
		this.horaSaida = horaSaida;
	}

	public java.util.Date getHoraChegadaPrevista() {
		return horaChegadaPrevista;
	}

	public void setHoraChegadaPrevista(java.util.Date horaChegadaPrevista) {
		this.horaChegadaPrevista = horaChegadaPrevista;
	}

	public java.util.Date getDataViagem() {
		return dataViagem;
	}

	public void setDataViagem(java.util.Date dataViagem) {
		this.dataViagem = dataViagem;
	}

	public java.util.Date getDataSolicitacao() {
		return dataSolicitacao;
	}

	public void setDataSolicitacao(java.util.Date dataSolicitacao) {
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

	public Motorista getMotoristaAlocado() {
		return motoristaAlocado;
	}

	public void setMotoristaAlocado(Motorista motoristaAlocado) {
		this.motoristaAlocado = motoristaAlocado;
	}

	public List<Participantes> getListaParticipantes() {
		return listaParticipantes;
	}

	public void setListaParticipantes(List<Participantes> listaParticipantes) {
		this.listaParticipantes = listaParticipantes;
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
		result = prime
				* result
				+ ((idSolicitacaoViagem == null) ? 0 : idSolicitacaoViagem
						.hashCode());
		result = prime * result
				+ ((itinerario == null) ? 0 : itinerario.hashCode());
		result = prime
				* result
				+ ((naturezaTrabalho == null) ? 0 : naturezaTrabalho.hashCode());
		result = prime * result
				+ ((protocolo == null) ? 0 : protocolo.hashCode());
		result = prime * result + quantidadePessoas;
		result = prime * result + (status ? 1231 : 1237);
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
		if (idSolicitacaoViagem == null) {
			if (other.idSolicitacaoViagem != null)
				return false;
		} else if (!idSolicitacaoViagem.equals(other.idSolicitacaoViagem))
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
		if (status != other.status)
			return false;
		return true;
	}
}
