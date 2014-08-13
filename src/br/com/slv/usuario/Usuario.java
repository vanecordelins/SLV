package br.com.slv.usuario;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import br.com.slv.setor.Setor;
import br.com.slv.solicitacao_viagem.SolicitacaoViagem;

/**
 * Classe modela a entidade usuario.
 * 
 * @author lucianoserafim
 * @author ramonsantos
 */

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

	private static final long serialVersionUID = -2273611952866880389L;

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

	private String logradouro;
	private String numero;
	private String cidade;
	private String bairro;
	private String estado;
	private String cep;

	private String perguntaSecreta;
	private String respostaSecreta;

	private String telefoneResidencial;
	private String telefoneCelular;

	@ManyToOne
	@JoinColumn(name = "codigoSetor")
	private Setor setorAlocado;

	@OneToMany(mappedBy = "usuarioSolicitante")
	private List<SolicitacaoViagem> listaSolicitacoesViagens;

	public Usuario() {

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

	public void setListaSolicitacoesViagens(
			List<SolicitacaoViagem> listaSolicitacoesViagens) {
		this.listaSolicitacoesViagens = listaSolicitacoesViagens;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
		result = prime * result + ((cep == null) ? 0 : cep.hashCode());
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((identificador == null) ? 0 : identificador.hashCode());
		result = prime
				* result
				+ ((listaSolicitacoesViagens == null) ? 0
						: listaSolicitacoesViagens.hashCode());
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
				+ ((rgUsuario == null) ? 0 : rgUsuario.hashCode());
		result = prime * result + ((senha == null) ? 0 : senha.hashCode());
		result = prime * result
				+ ((setorAlocado == null) ? 0 : setorAlocado.hashCode());
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
		Usuario other = (Usuario) obj;
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
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
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
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (identificador == null) {
			if (other.identificador != null)
				return false;
		} else if (!identificador.equals(other.identificador))
			return false;
		if (listaSolicitacoesViagens == null) {
			if (other.listaSolicitacoesViagens != null)
				return false;
		} else if (!listaSolicitacoesViagens
				.equals(other.listaSolicitacoesViagens))
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
		if (rgUsuario == null) {
			if (other.rgUsuario != null)
				return false;
		} else if (!rgUsuario.equals(other.rgUsuario))
			return false;
		if (senha == null) {
			if (other.senha != null)
				return false;
		} else if (!senha.equals(other.senha))
			return false;
		if (setorAlocado == null) {
			if (other.setorAlocado != null)
				return false;
		} else if (!setorAlocado.equals(other.setorAlocado))
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
