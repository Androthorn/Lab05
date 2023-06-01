package documin.documento.elemento;

public class ElementoTexto extends ElementoAbstrato {

	public ElementoTexto(int prioridade, String valor) {
		super(prioridade, valor);
	}

	@Override
	public String pegarRepresentacaoCompleta() {
		return super.getValor();
	}

	@Override
	public String pegarRepresentacaoResumida() {
		return super.getValor();
	}
}
