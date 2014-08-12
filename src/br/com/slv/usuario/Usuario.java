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

	public Long getId() {
		return id;
	}

}
