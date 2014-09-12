package br.com.slv.converter;

import java.io.Serializable;
import java.util.Map;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("converterSetor")
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
			Object value) {

		if (value != null && !"".equals(value)) {

			SampleEntity entity = (SampleEntity) value;
			
			this.addAttribute(component, entity);

			Long codigo = entity.getCodigoSetor();
			
			if (codigo != null) {
				
				return String.valueOf(codigo);
				
			}
		}

		return (String) value;
	}

	protected void addAttribute(UIComponent component, SampleEntity o) {
		
		String key = o.getCodigoSetor().toString();
		
		this.getAttributesFrom(component).put(key, o);
	}

	protected Map<String, Object> getAttributesFrom(UIComponent component) {
		
		return component.getAttributes();
		
	}

}