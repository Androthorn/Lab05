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
	
	public String[] exibirDocumento() {
		int tamanho = elementos.size();
		String[] array = new String[tamanho];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = elementos.get(i).representacaoResumida();
		}
		return array;
	}

	public boolean temEspaco() {
		return tamanhoMaximo == 0 || elementos.size() < tamanhoMaximo;
	}

	public boolean adicionarElemento(Elemento elemento) {
		if (temEspaco()) {
			return this.elementos.add(elemento);
		}
		return false;
	}
}
