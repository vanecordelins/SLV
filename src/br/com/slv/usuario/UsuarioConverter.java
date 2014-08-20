package br.com.slv.usuario;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.slv.setor.Setor;
import br.com.slv.setor.SetorRN;

@FacesConverter(forClass = Usuario.class)
public class UsuarioConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1,
			String nomeSetor) {
/*
		if (nomeSetor != null && nomeSetor.trim().length() > 0) {

			SetorRN setorRN = new SetorRN();

			return setorRN.buscaSetor(nomeSetor);

		}*/

		return null;

	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1,
			Object objetoSetor) {

		/*if (objetoSetor != null) {

			Setor setor = (Setor) objetoSetor;

			return setor.getNome();

		}*/

		return null;

	}

}
