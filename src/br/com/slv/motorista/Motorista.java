package br.com.slv.motorista;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.slv.relatorio_viagem.RelatorioViagem;
import br.com.slv.solicitacao_viagem.SolicitacaoViagem;

/**
 * Classe modela a entidade Motorista.
 * 
 * @author ramonsantos
 */

@Entity
@Table(name = "motorista")
public class Motorista implements Serializable {

	private static final long serialVersionUID = 9031242567455917440L;

	@Id
	@GeneratedValue
	private Long idMotorista;

	private String cpf;
	private String nome;
	private String rgMotorista;
	private String orgaoExpeditor;
	private char sexo;
	private String cnh;
	private String email;
	
	@Column(nullable = false)
	private boolean disponibilidade;

	private String logradouro;
	private String numero;
	private String cidade;
	private String bairro;
	private String estado;
	private String cep;

	private String telefoneResidencial;
	private String telefoneCelular;

	private String senha;
	private String perguntaSecreta;
	private String respostaSecreta;

	@OneToMany(mappedBy = "motoristaResponsavel")
	private List<RelatorioViagem> relatorioViagens;

	@Temporal(TemporalType.TIME)
	private java.util.Date horasExtras;

	@OneToMany(mappedBy = "motoristaAlocado")
	List<SolicitacaoViagem> listaViagem;

	public Motorista() {

	}

	public Long getIdMotorista() {
		return idMotorista;
	}

	public void setIdMotorista(Long idMotorista) {
		this.idMotorista = idMotorista;
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

	public String getRgMotorista() {
		return rgMotorista;
	}

	public void setRgMotorista(String rgMotorista) {
		this.rgMotorista = rgMotorista;
	}

	public String getOrgaoExpeditor() {
		return orgaoExpeditor;
	}

	public void setOrgaoExpeditor(String orgaoExpeditor) {
		this.orgaoExpeditor = orgaoExpeditor;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
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

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getPerguntaSecreta() {
		return perguntaSecreta;
	}

	public void setPerguntaSecreta(String perguntaSecreta) {
		this.perguntaSecreta = perguntaSecreta;
	}

	public String getRespostaSecreta() {
		return respostaSecreta;
	}

	public void setRespostaSecreta(String respostaSecreta) {
		this.respostaSecreta = respostaSecreta;
	}

	public List<RelatorioViagem> getRelatorioViagens() {
		return relatorioViagens;
	}

	public void setRelatorioViagens(List<RelatorioViagem> relatorioViagens) {
		this.relatorioViagens = relatorioViagens;
	}

	public java.util.Date getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(java.util.Date horasExtras) {
		this.horasExtras = horasExtras;
	}

	public List<SolicitacaoViagem> getListaViagem() {
		return listaViagem;
	}

	public void setListaViagem(List<SolicitacaoViagem> listaViagem) {
		this.listaViagem = listaViagem;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
		result = prime * result + ((cep == null) ? 0 : cep.hashCode());
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result + ((cnh == null) ? 0 : cnh.hashCode());
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + (disponibilidade ? 1231 : 1237);
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result
				+ ((horasExtras == null) ? 0 : horasExtras.hashCode());
		result = prime * result
				+ ((idMotorista == null) ? 0 : idMotorista.hashCode());
		result = prime * result
				+ ((logradouro == null) ? 0 : logradouro.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result
				+ ((orgaoExpeditor == null) ? 0 : orgaoExpeditor.hashCode());
		result = prime * result
				+ ((perguntaSecreta == null) ? 0 : perguntaSecreta.hashCode());
		result = prime * result
				+ ((respostaSecreta == null) ? 0 : respostaSecreta.hashCode());
		result = prime * result
				+ ((rgMotorista == null) ? 0 : rgMotorista.hashCode());
		result = prime * result + ((senha == null) ? 0 : senha.hashCode());
		result = prime * result + sexo;
		result = prime * result
				+ ((telefoneCelular == null) ? 0 : telefoneCelular.hashCode());
		result = prime
				* result
				+ ((telefoneResidencial == null) ? 0 : telefoneResidencial
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
		Motorista other = (Motorista) obj;
		if (bairro == null) {
			if (other.bairro != null)
				return false;
		} else if (!bairro.equals(other.bairro))
			return false;
		if (cep == null) {
			if (other.cep != null)
				return false;
		} else if (!cep.equals(other.cep))
			return false;
		if (cidade == null) {
			if (other.cidade != null)
				return false;
		} else if (!cidade.equals(other.cidade))
			return false;
		if (cnh == null) {
			if (other.cnh != null)
				return false;
		} else if (!cnh.equals(other.cnh))
			return false;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (disponibilidade != other.disponibilidade)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
			return false;
		if (horasExtras == null) {
			if (other.horasExtras != null)
				return false;
		} else if (!horasExtras.equals(other.horasExtras))
			return false;
		if (idMotorista == null) {
			if (other.idMotorista != null)
				return false;
		} else if (!idMotorista.equals(other.idMotorista))
			return false;
		if (logradouro == null) {
			if (other.logradouro != null)
				return false;
		} else if (!logradouro.equals(other.logradouro))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		if (orgaoExpeditor == null) {
			if (other.orgaoExpeditor != null)
				return false;
		} else if (!orgaoExpeditor.equals(other.orgaoExpeditor))
			return false;
		if (perguntaSecreta == null) {
			if (other.perguntaSecreta != null)
				return false;
		} else if (!perguntaSecreta.equals(other.perguntaSecreta))
			return false;
		if (respostaSecreta == null) {
			if (other.respostaSecreta != null)
				return false;
		} else if (!respostaSecreta.equals(other.respostaSecreta))
			return false;
		if (rgMotorista == null) {
			if (other.rgMotorista != null)
				return false;
		} else if (!rgMotorista.equals(other.rgMotorista))
			return false;
		if (senha == null) {
			if (other.senha != null)
				return false;
		} else if (!senha.equals(other.senha))
			return false;
		if (sexo != other.sexo)
			return false;
		if (telefoneCelular == null) {
			if (other.telefoneCelular != null)
				return false;
		} else if (!telefoneCelular.equals(other.telefoneCelular))
			return false;
		if (telefoneResidencial == null) {
			if (other.telefoneResidencial != null)
				return false;
		} else if (!telefoneResidencial.equals(other.telefoneResidencial))
			return false;
		return true;
	}
}
