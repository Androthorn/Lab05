package documin.documento.elemento;

public class ElementoTitulo extends ElementoAbstrato {
	private int nivel;
	private boolean linkavel;

	public ElementoTitulo(int prioridade, String valor, int nivel, boolean linkavel) {
		super(prioridade, valor);
		this.nivel = nivel;
		this.linkavel = linkavel;
	}

	@Override
	public String representaçãoCompleta() {
		return this.representaçãoResumida() + (this.linkavel ? " -- linkavel" : "");
	}

	@Override
	public String representaçãoResumida() {
		return Integer.toString(this.nivel) + ". " + super.getValor();
	}

	public int getNivel() {
		return nivel;
	}

	public boolean isLinkavel() {
		return linkavel;
	}
}
