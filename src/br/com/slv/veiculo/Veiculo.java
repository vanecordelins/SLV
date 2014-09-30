package br.com.slv.veiculo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.slv.solicitacao_viagem.SolicitacaoViagem;

/**
 * Classe modela a entidade veiculo.
 * 
 * @author lucianoserafim
 * @author ramonsantos
 * 
 */

@Entity
@Table(name="veiculo")
public class Veiculo implements Serializable {

	private static final long serialVersionUID = -3102948843262179332L;

	@Id
	@GeneratedValue
	private Long codigoVeiculo;

	private String tombamento;
	private String fabricante;
	private String modelo;
	private String cor;
	private String placa;
	private String anoFabricacao;
	private String chassi;
	
	@Column(nullable = false)
	private boolean disponibilidade;
	
	private float capacidadeLitros;
	private float kmPorLitro;
	private String tipo;
	private int lugares;

	@OneToMany(mappedBy = "veiculoViagem")
	private List<SolicitacaoViagem> listaSolicitacoes;

	public Veiculo() {

	}

	public Long getCodigoVeiculo() {
		return codigoVeiculo;
	}

	public void setCodigoVeiculo(Long codigoVeiculo) {
		this.codigoVeiculo = codigoVeiculo;
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

	public int getLugares() {
		return lugares;
	}

	public void setLugares(int lugares) {
		this.lugares = lugares;
	}

	public List<SolicitacaoViagem> getListaSolicitacoes() {
		return listaSolicitacoes;
	}

	public void setListaSolicitacoes(List<SolicitacaoViagem> listaSolicitacoes) {
		this.listaSolicitacoes = listaSolicitacoes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((anoFabricacao == null) ? 0 : anoFabricacao.hashCode());
		result = prime * result + Float.floatToIntBits(capacidadeLitros);
		result = prime * result + ((chassi == null) ? 0 : chassi.hashCode());
		result = prime * result
				+ ((codigoVeiculo == null) ? 0 : codigoVeiculo.hashCode());
		result = prime * result + ((cor == null) ? 0 : cor.hashCode());
		result = prime * result + (disponibilidade ? 1231 : 1237);
		result = prime * result
				+ ((fabricante == null) ? 0 : fabricante.hashCode());
		result = prime * result + Float.floatToIntBits(kmPorLitro);
		result = prime * result + lugares;
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		result = prime * result + ((placa == null) ? 0 : placa.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		result = prime * result
				+ ((tombamento == null) ? 0 : tombamento.hashCode());
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
		Veiculo other = (Veiculo) obj;
		if (anoFabricacao == null) {
			if (other.anoFabricacao != null)
				return false;
		} else if (!anoFabricacao.equals(other.anoFabricacao))
			return false;
		if (Float.floatToIntBits(capacidadeLitros) != Float
				.floatToIntBits(other.capacidadeLitros))
			return false;
		if (chassi == null) {
			if (other.chassi != null)
				return false;
		} else if (!chassi.equals(other.chassi))
			return false;
		if (codigoVeiculo == null) {
			if (other.codigoVeiculo != null)
				return false;
		} else if (!codigoVeiculo.equals(other.codigoVeiculo))
			return false;
		if (cor == null) {
			if (other.cor != null)
				return false;
		} else if (!cor.equals(other.cor))
			return false;
		if (disponibilidade != other.disponibilidade)
			return false;
		if (fabricante == null) {
			if (other.fabricante != null)
				return false;
		} else if (!fabricante.equals(other.fabricante))
			return false;
		if (Float.floatToIntBits(kmPorLitro) != Float
				.floatToIntBits(other.kmPorLitro))
			return false;
		if (lugares != other.lugares)
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		if (placa == null) {
			if (other.placa != null)
				return false;
		} else if (!placa.equals(other.placa))
			return false;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		if (tombamento == null) {
			if (other.tombamento != null)
				return false;
		} else if (!tombamento.equals(other.tombamento))
			return false;
		return true;
	}
}
