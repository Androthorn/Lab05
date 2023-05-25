package documin.documento.elemento;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ElementoLista extends ElementoAbstrato {
	private String separador;
	private String caractere;
	
	public ElementoLista(int prioridade, String valor, String separador, String caractere) {
		super(prioridade, valor);
		this.separador = separador;
		this.caractere = caractere;
	}

	@Override
	public String representaçãoCompleta() {
		String[] lista = this.getValor().split(this.separador);
		return null;
	}

	@Override
	public String representaçãoResumida() {
		// TODO Auto-generated method stub
		return null;
	}



}
