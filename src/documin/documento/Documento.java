package documin.documento;

import java.util.ArrayList;
import java.util.List;

import documin.documento.elemento.Elemento;

public class Documento {
	private String titulo;
	private int tamanhoMaximo;
	private List<Elemento> elementos;

	public Documento(String titulo, int tamanhoMaximo) {
		this.titulo = titulo;
		this.tamanhoMaximo = tamanhoMaximo;
		this.elementos = new ArrayList<Elemento>();
	}

	public String getTitulo() {
		return titulo;
	}

	public List<Elemento> getElementos() {
		return elementos;
	}

	public int getTamanhoMaximo() {
		return tamanhoMaximo;
	}

	public boolean adicionarElemento(Elemento elemento) {
		return this.elementos.add(elemento);
	}
}
