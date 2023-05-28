package documin.documento.elemento;

public class ElementoLista extends ElementoAbstrato {

	public ElementoLista(int prioridade, String valor, String separador, String caractere) {
		super(prioridade, valor);
		super.propriedades.put("separador", String.valueOf(separador));
		super.propriedades.put("caractere", String.valueOf(caractere));
	}

	@Override
	public String representacaoCompleta() {
		String separador = propriedades.get("separador");
		if (separador == "|") {
			separador = "\\|";
		}
		String caractere = propriedades.get("caractere");
		String[] lista = this.getValor().split(separador);
		String saida = "";
		for (String frase : lista) {
			saida += caractere + " " + frase.strip() + "\n";
		}
		return saida;
	}

	@Override
	public String representacaoResumida() {
		String separador = propriedades.get("separador");
		if (separador == "|") {
			separador = "\\|";
		}
		String[] lista = this.getValor().split(separador);
		String saida = "";
		for (String frase : lista) {
			saida += frase.stripTrailing() + separador;
		}
		return saida;
	}

}
