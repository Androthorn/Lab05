package documin.documento.elemento;

public abstract class ElementoAbstrato implements Elemento {
	private int prioridade;
	private String valor;

	public ElementoAbstrato(int prioridade, String valor) {
		this.prioridade = prioridade;
		this.valor = valor;
	}

	public int getPrioridade() {
		return prioridade;
	}

	public String getValor() {
		return valor;
	}

}
