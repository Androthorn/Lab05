package documin.documento.elemento;

public class ElementoTitulo extends ElementoAbstrato {

	public ElementoTitulo(int prioridade, String valor, int nivel, boolean linkavel) {
		super(prioridade, valor);
		super.propriedades.put("nivel", String.valueOf(nivel));
		super.propriedades.put("linkavel", String.valueOf(linkavel));
	}

	@Override
	public String pegarRepresentacaoCompleta() {
		String stringNivel = propriedades.get("nivel");
		String ehlinkavel = propriedades.get("linkavel");
		String link = stringNivel + "-" + super.getValor();
		if (ehlinkavel.equals("true")) {
			return pegarRepresentacaoResumida() + " --\n" + link.replace(" ", "").toUpperCase();
		}
		return stringNivel + ". " + super.getValor();
	}

	@Override
	public String pegarRepresentacaoResumida() {
		String stringNivel = propriedades.get("nivel");
		return stringNivel + ". " + super.getValor();
	}

}
