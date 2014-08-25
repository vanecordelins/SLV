package br.com.slv.setor;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "setorBean")
@RequestScoped
public class SetorBean {

	private Setor setor = new Setor();

	public String salvar() {

		SetorRN setorRN = new SetorRN();

		Boolean salvo = setorRN.salvar(setor);

		if (salvo.equals(false)) {
			
			return "setor";
			
		} else {
			
			return "sucesso";
			
		}
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}
}
