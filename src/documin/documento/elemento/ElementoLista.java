package documin.documento.elemento;

import java.util.regex.Pattern;

public class ElementoLista extends ElementoAbstrato {

	public ElementoLista(int prioridade, String valor, String separador, String caractere) {
		super(prioridade, valor);
		super.propriedades.put("separador", String.valueOf(separador));
		super.propriedades.put("caractere", String.valueOf(caractere));
	}

	@Override
	public String pegarRepresentacaoCompleta() {
		String separador = propriedades.get("separador");
		String caractere = propriedades.get("caractere");
		String[] lista = this.getValor().split(Pattern.quote(separador));
		StringBuilder saida = new StringBuilder();
		for (String frase : lista) {
			saida.append(caractere).append(" ").append(frase.strip()).append("\n");
		}
		return saida.toString();
	}

	@Override
	public String pegarRepresentacaoResumida() {
		String separador = propriedades.get("separador");
		String[] lista = this.getValor().split(Pattern.quote(separador));
		StringBuilder saida = new StringBuilder();
		for (int i = 0; i < lista.length; i++) {
			String frase = lista[i].stripTrailing();
			saida.append(frase);
			if (i < lista.length - 1) {
				saida.append(separador);
			}
		}
		return saida.toString();
	}
}