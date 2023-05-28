package documin.documento.elemento;

import java.util.Map;
import java.util.HashMap;

public abstract class ElementoAbstrato implements Elemento {
	private int prioridade;
	private String valor;
	protected Map<String, String> propriedades;

	public ElementoAbstrato(int prioridade, String valor) {
		this.prioridade = prioridade;
		this.valor = valor;
		this.propriedades = new HashMap<String, String>();
	}

	public int getPrioridade() {
		return prioridade;
	}

	public String getValor() {
		return valor;
	}

	public Map<String, String> getPropriedades() {
		return propriedades;
	}

}
