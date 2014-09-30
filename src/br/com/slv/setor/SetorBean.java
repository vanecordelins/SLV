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

	private String setorPesquisa;

	public String salvarSetorBean() {

		if (this.setorRN.salvarSetorRN(setor) == false) {

			FacesMessage facesMessage = new FacesMessage(
					"Setor já está cadastrado no sistema");

			context.addMessage(null, facesMessage);

			return null;

		} else {

			FacesMessage facesMessage = new FacesMessage(
					"O setor " + setor.getNome() + " foi cadastrado com sucesso");

			context.addMessage(null, facesMessage);

			return "painel_administrador";

		}
	}

	public String atualizarSetorBean() {

		this.setorRN.atualizarSetorRN(setor);
		
		FacesMessage facesMessage = new FacesMessage(
				"O setor " + setor.getNome() + " foi atualizado com sucesso");

		context.addMessage(null, facesMessage);

		return "painel_administrador";

	}

	public String pesquisarSetorBean() {

		this.setor = this.setorRN.buscarSetorRN(setorPesquisa);

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

	public String getSetorPesquisa() {
		return setorPesquisa;
	}

	public void setSetorPesquisa(String setorPesquisa) {
		this.setorPesquisa = setorPesquisa;
	}
}
