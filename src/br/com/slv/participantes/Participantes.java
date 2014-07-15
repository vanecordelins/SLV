package br.com.slv.participantes;

import javax.persistence.Embeddable;

@Embeddable
public class Participantes {

	private String nome;
	private String cpfParticipante;

	public Participantes() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpfParticipante() {
		return cpfParticipante;
	}

	public void setCpfParticipante(String cpfParticipante) {
		this.cpfParticipante = cpfParticipante;
	}

}
