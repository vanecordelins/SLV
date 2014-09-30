package br.com.slv.veiculo;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "veiculoBean")
@RequestScoped
public class VeiculoBean {

	Veiculo veiculo = new Veiculo();

	VeiculoRN veiculoRN = new VeiculoRN();

	FacesContext context = FacesContext.getCurrentInstance();

	private String tombamentoPesquisa;
	private String tipo;

	public String salvar() {

		if (this.veiculo.getCapacidadeLitros() == 0) {

			FacesMessage facesMessage = new FacesMessage(
					"Informar capacidade em litros");

			context.addMessage("veiculo:capacidadeLitros", facesMessage);

			return null;

		}
		if (this.veiculo.getKmPorLitro() == 0) {

			FacesMessage facesMessage = new FacesMessage(
					"Informar km por litro");

			context.addMessage("veiculo:kmPorLitro", facesMessage);

			return null;

		} else if (this.veiculoRN.salvarVeiculoRN(this.veiculo) == false) {

			FacesMessage facesMessage = new FacesMessage(
					"Veículo já está cadastrado no sistema");

			context.addMessage(null, facesMessage);

			return null;

		} else {

			FacesMessage facesMessage = new FacesMessage("O veículo de placa "
					+ veiculo.getPlaca() + " foi cadastrado com sucesso");

			context.addMessage(null, facesMessage);

			return "painel_administrado";

		}
	}

	public String atualizarVeiculoBean() {

		if (this.veiculo.getCapacidadeLitros() == 0) {

			FacesMessage facesMessage = new FacesMessage(
					"Informar capacidade em litros");

			context.addMessage("veiculo:capacidadeLitros", facesMessage);

			return null;

		}
		if (this.veiculo.getKmPorLitro() == 0) {

			FacesMessage facesMessage = new FacesMessage(
					"Informar km por litro");

			context.addMessage("veiculo:kmPorLitro", facesMessage);

			return null;

		} else {

			this.veiculoRN.atualizarVeiculoRN(this.veiculo);
			
			FacesMessage facesMessage = new FacesMessage(
					"O veículo de placa "
					+ veiculo.getPlaca() + " foi atualizado com sucesso");

			context.addMessage(null, facesMessage);

			return "painel_administrador";

		}
	}

	public String pesquisarVeiculoBean() {

		this.veiculo = this.veiculoRN.buscarVeiculo(tombamentoPesquisa);

		if (this.veiculo == null) {

			FacesMessage facesMessage = new FacesMessage(
					"O veículo não está cadastrado");

			context.addMessage(null, facesMessage);

			return null;

		}

		return "atualizar_veiculo";

	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public String getTombamentoPesquisa() {
		return tombamentoPesquisa;
	}

	public void setTombamentoPesquisa(String tombamentoPesquisa) {
		this.tombamentoPesquisa = tombamentoPesquisa;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
