package br.com.slv.setor;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "setorBean")
@RequestScoped
public class SetorBean {

	private Setor setor = new Setor();

	SetorRN setorRN = new SetorRN();

	FacesContext context = FacesContext.getCurrentInstance();

	private String nomeSetor;

	public String salvarSetorBean() {

		if (this.setorRN.salvarSetorRN(setor) == false) {

			FacesMessage facesMessage = new FacesMessage(
					"Setor já está cadastrado no sistema");

			context.addMessage(null, facesMessage);

			return null;

		} else {

			return "sucesso";

		}
	}

	public String atualizarSetorBean() {

		this.setorRN.atualizarSetorRN(setor);

		return "sucesso";

	}

	public String pesquisarSetorBean() {

		this.setor = this.setorRN.buscarSetorRN(nomeSetor);

		if (this.setor == null) {

			FacesMessage facesMessage = new FacesMessage(
					"O setor não está cadastrado");

			context.addMessage(null, facesMessage);

			return null;

		}

		return "atualizar_setor";
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	public String getNomeSetor() {
		return nomeSetor;
	}

	public void setNomeSetor(String nomeSetor) {
		this.nomeSetor = nomeSetor;
	}
}
