package br.com.slv.setor;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.slv.converter.SampleEntity;
import br.com.slv.usuario.Usuario;

/**
 * Classe modela a entidade Setor.
 * 
 * @author lucianoserafim
 * @author ramonsantos
 */

@Entity
@Table(name = "setor")
public class Setor implements Serializable, SampleEntity {

	private static final long serialVersionUID = 9101816051539078803L;

	@Id
	@GeneratedValue
	private Long codigoSetor;

	private String nome;

	@OneToMany(mappedBy = "setorAlocado")
	private List<Usuario> listaUsuarios;

	public Setor() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((codigoSetor == null) ? 0 : codigoSetor.hashCode());
		result = prime * result
				+ ((listaUsuarios == null) ? 0 : listaUsuarios.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Setor other = (Setor) obj;
		if (codigoSetor == null) {
			if (other.codigoSetor != null)
				return false;
		} else if (!codigoSetor.equals(other.codigoSetor))
			return false;
		if (listaUsuarios == null) {
			if (other.listaUsuarios != null)
				return false;
		} else if (!listaUsuarios.equals(other.listaUsuarios))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long getCodigoSetor() {
		return codigoSetor;
	}
}
