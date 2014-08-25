package br.com.slv.motorista;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "motoristaBean")
@RequestScoped
public class MotoristaBean {

	Motorista motorista = new Motorista();

	private String confirmarSenha;

	public String salvar() {

		if (!this.motorista.getSenha().equals(this.confirmarSenha)) {

			return "motorista";

		} else {

			MotoristaRN motoristaRN = new MotoristaRN();

			motorista.setDisponibilidade(false);

			Boolean salvo = motoristaRN.salvar(this.motorista);

			if (salvo.equals(false)) {

				return "motorista";

			} else {

				return "sucesso";

			}

		}

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

}
