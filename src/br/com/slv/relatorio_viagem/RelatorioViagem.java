package br.com.slv.relatorio_viagem;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.slv.motorista.Motorista;
import br.com.slv.solicitacao_viagem.SolicitacaoViagem;

/**
 * Classe modela a entidade RelatorioViagem.
 * 
 * @author ramonsantos
 */

@Entity
@Table(name = "relatorioviagem")
public class RelatorioViagem implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5099098207639585580L;

	@Id
	@GeneratedValue
	private Long id;

	private String ocorrencia;
	private float kmSaida;
	private float kmChegada;

	@Temporal(TemporalType.DATE)
	private java.util.Date dataChegada;

	@Temporal(TemporalType.TIME)
	private java.util.Date horaChegada;

	@ManyToOne
	private Motorista motoristaResponsavel;

	@OneToOne
	private SolicitacaoViagem solicitacaoViagem;

	public RelatorioViagem() {

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

	public java.util.Date getDataChegada() {
		return dataChegada;
	}

	public void setDataChegada(java.util.Date dataChegada) {
		this.dataChegada = dataChegada;
	}

	public java.util.Date getHoraChegada() {
		return horaChegada;
	}

	public void setHoraChegada(java.util.Date horaChegada) {
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

	public Long getId() {
		return id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dataChegada == null) ? 0 : dataChegada.hashCode());
		result = prime * result
				+ ((horaChegada == null) ? 0 : horaChegada.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + Float.floatToIntBits(kmChegada);
		result = prime * result + Float.floatToIntBits(kmSaida);
		result = prime
				* result
				+ ((motoristaResponsavel == null) ? 0 : motoristaResponsavel
						.hashCode());
		result = prime * result
				+ ((ocorrencia == null) ? 0 : ocorrencia.hashCode());
		result = prime
				* result
				+ ((solicitacaoViagem == null) ? 0 : solicitacaoViagem
						.hashCode());
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
		RelatorioViagem other = (RelatorioViagem) obj;
		if (dataChegada == null) {
			if (other.dataChegada != null)
				return false;
		} else if (!dataChegada.equals(other.dataChegada))
			return false;
		if (horaChegada == null) {
			if (other.horaChegada != null)
				return false;
		} else if (!horaChegada.equals(other.horaChegada))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (Float.floatToIntBits(kmChegada) != Float
				.floatToIntBits(other.kmChegada))
			return false;
		if (Float.floatToIntBits(kmSaida) != Float
				.floatToIntBits(other.kmSaida))
			return false;
		if (motoristaResponsavel == null) {
			if (other.motoristaResponsavel != null)
				return false;
		} else if (!motoristaResponsavel.equals(other.motoristaResponsavel))
			return false;
		if (ocorrencia == null) {
			if (other.ocorrencia != null)
				return false;
		} else if (!ocorrencia.equals(other.ocorrencia))
			return false;
		if (solicitacaoViagem == null) {
			if (other.solicitacaoViagem != null)
				return false;
		} else if (!solicitacaoViagem.equals(other.solicitacaoViagem))
			return false;
		return true;
	}

}
