package br.com.slv.converter;

import java.io.Serializable;
import java.util.Map;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.slv.setor.Setor;

@FacesConverter(value="converterSetor")
public class ConverterSetor implements Converter, Serializable {

	private static final long serialVersionUID = -1679772342891398642L;

	public Object getAsObject(FacesContext ctx, UIComponent component,
			String value) {
		
		if (value != null) {

			return this.getAttributesFrom(component).get(value);
			
		}
		
		return null;
		
	}

	public String getAsString(FacesContext ctx, UIComponent component,
			Object objeto) {

		if (objeto != null && !objeto.equals("")) {

			Setor setor = (Setor) objeto;
			
			this.addAttribute(component, setor);

			Long codigoSetor = setor.getCodigoSetor();
			
			if (codigoSetor != null) {
				
				return String.valueOf(codigoSetor);
				
			}
		}

		return (String) objeto;
	}

	protected void addAttribute(UIComponent component, Setor o) {
		
		String key = o.getCodigoSetor().toString();
		
		this.getAttributesFrom(component).put(key, o);
	}

	protected Map<String, Object> getAttributesFrom(UIComponent component) {
		
		return component.getAttributes();
		
	}

}