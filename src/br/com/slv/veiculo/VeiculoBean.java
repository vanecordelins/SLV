package br.com.slv.veiculo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="veiculoBean")
@RequestScoped
public class VeiculoBean {

	Veiculo veiculo = new Veiculo();

	public String salvar() {

		VeiculoRN veiculoRN = new VeiculoRN();
		
		this.veiculo.setDisponibilidade(false);

		Boolean salvo = veiculoRN.salvar(this.veiculo);

		if (salvo.equals(false)) {
			
			return "veiculo";
			
		} else {

			return "sucesso";

		}

	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
}
