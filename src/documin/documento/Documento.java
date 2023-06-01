package documin.documento;

import java.util.ArrayList;
import java.util.List;

import documin.documento.elemento.ElementoI;
import documin.documento.elemento.ElementoLista;
import documin.documento.elemento.ElementoTermo;
import documin.documento.elemento.ElementoTexto;
import documin.documento.elemento.ElementoTitulo;

public class Documento {
	private String titulo;
	private int tamanhoMaximo;
	private List<ElementoI> elementos;

	public Documento(String titulo, int tamanhoMaximo) {
		this.titulo = titulo;
		this.tamanhoMaximo = tamanhoMaximo;
		this.elementos = new ArrayList<ElementoI>();
	}

	public String getTitulo() {
		return titulo;
	}

	public List<ElementoI> getElementos() {
		return elementos;
	}

	public int getTamanhoMaximo() {
		return tamanhoMaximo;
	}

	public String[] exibirDocumento() {
		int tamanho = elementos.size();
		String[] array = new String[tamanho];

		for (int i = 0; i < array.length; i++) {
			array[i] = elementos.get(i).pegarRepresentacaoResumida();
		}
		return array;
	}

	public boolean temEspaco() {
		return tamanhoMaximo == 0 || elementos.size() < tamanhoMaximo;
	}

	public boolean adicionarElemento(ElementoI elemento) {
		if (temEspaco()) {
			return this.elementos.add(elemento);
		}
		return false;
	}

	public boolean criarTexto(String tituloDoc, String valor, int prioridade) {
		ElementoI texto = new ElementoTexto(prioridade, valor);
		return adicionarElemento(texto);
	}
	
	public boolean criarTitulo(String tituloDoc, String valor, int prioridade, int nivel, boolean linkavel) {
		ElementoI titulo = new ElementoTitulo(prioridade, valor, nivel, linkavel);
		return adicionarElemento(titulo);
	}
	
	public boolean criarLista(String tituloDoc, String valor, int prioridade, String separador, String caractere) {
		ElementoI lista = new ElementoLista(prioridade, valor, separador, caractere);
		return adicionarElemento(lista);
	}
	
	public boolean criarTermos(String tituloDoc, String valor, int prioridade, String separador, String ordem) {
		ElementoI termo = new ElementoTermo(prioridade, valor, separador, ordem);
		return adicionarElemento(termo);
	}

	public String pegaRepresentacaoCompletaDoElemento(int elementoPosicao) {
		ElementoI elemento = elementos.get(elementoPosicao);
		return elemento.pegarRepresentacaoCompleta();
	}

	public String pegaRepresentacaoResumidaDoElemento(int elementoPosicao) {
		ElementoI elemento = elementos.get(elementoPosicao);
		return elemento.pegarRepresentacaoResumida();
	}
}