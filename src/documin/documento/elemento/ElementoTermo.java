package documin.documento.elemento;

import java.util.Arrays;

public class ElementoTermo extends ElementoAbstrato {

	public ElementoTermo(int prioridade, String valor, String separador, String ordem) {
		super(prioridade, valor);
		super.propriedades.put("separador", String.valueOf(separador));
		super.propriedades.put("ordem", String.valueOf(ordem));
	}

	@Override
	public String pegarRepresentacaoCompleta() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String pegarRepresentacaoResumida() {
		// TODO Auto-generated method stub
		return null;
	}

	public void ordenaAlfabeticamente(String[] lista) {
		Arrays.sort(lista);
	}
	
}
