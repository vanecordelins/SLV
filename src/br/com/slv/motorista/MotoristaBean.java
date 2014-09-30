package br.com.slv.motorista;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import br.com.slv.utilidades.Util;

@ManagedBean(name = "motoristaBean")
@RequestScoped
public class MotoristaBean {

	Motorista motorista = new Motorista();

	MotoristaRN motoristaRN = new MotoristaRN();

	Util cpf = Util.getInstancia();

	FacesContext context = FacesContext.getCurrentInstance();

	private String confirmarSenha;
	private String cpfPesquisa;

	public String salvarMotoristaBean() {

		if (!this.motorista.getSenha().equals(this.confirmarSenha)) {

			FacesMessage facesMessage = new FacesMessage(
					"A senha informada não confere");

			context.addMessage("motorista:confirmarSenha", facesMessage);

			return null;

		} else if (this.cpf.isCpf(this.motorista.getCpf()) == false) {

			FacesMessage facesMessage = new FacesMessage("CPF inválido");

			context.addMessage("motorista:cpf", facesMessage);

			return null;

		} else if (motoristaRN.salvarMotoristaRN(this.motorista) == false) {

			FacesMessage facesMessage = new FacesMessage(
					"Motorista já está cadastrado no sistema");

			context.addMessage(null, facesMessage);

			return null;

		} else {
			
			FacesMessage facesMessage = new FacesMessage(
					"Motorista cadastrado com sucesso");

			context.addMessage(null, facesMessage);

			return "painel_administrador";

		}

	}

	public String atualizarMotoristaBean() {

		if (!this.motorista.getSenha().equals(this.confirmarSenha)) {

			FacesMessage facesMessage = new FacesMessage(
					"A senha informada não confere");

			context.addMessage("motorista:confirmarSenha", facesMessage);

			return null;

		} else if (this.cpf.isCpf(motorista.getCpf()) == false) {

			FacesMessage facesMessage = new FacesMessage("CPF inválido");

			context.addMessage("motorista:cpf", facesMessage);

			return null;

		} else {

			this.motoristaRN.atualizarMotoristaRN(motorista);
			
			FacesMessage facesMessage = new FacesMessage(
					"Motorista atualizado com sucesso");

			context.addMessage(null, facesMessage);

			return "painel_administrador";

		}

	}

	public String pesquisarMotoristaBean() {

		this.motorista = this.motoristaRN.buscarMotoristaRN(cpfPesquisa);

		if (motorista == null) {

			FacesMessage facesMessage = new FacesMessage(
					"O motorista não está cadastrado");

			context.addMessage(null, facesMessage);

			return null;

		}

		return "atualizar_motorista";

	}

	public Motorista getMotorista() {
		return motorista;
	}

	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}

	public String getConfirmarSenha() {
		return confirmarSenha;
	}

	public void setConfirmarSenha(String confirmaSenha) {
		this.confirmarSenha = confirmaSenha;
	}

	public String getCpfPesquisa() {
		return cpfPesquisa;
	}

	public void setCpfPesquisa(String cpfPesquisa) {
		this.cpfPesquisa = cpfPesquisa;
	}
}
