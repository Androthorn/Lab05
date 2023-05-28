package documin.documento;

import documin.documento.elemento.Elemento;
import java.util.HashMap;
import java.util.Map;

import documin.documento.elemento.ElementoLista;
import documin.documento.elemento.ElementoTexto;
import documin.documento.elemento.ElementoTitulo;

public class DocumentoController {
	public Map<String, Documento> documentos;

	public DocumentoController() {
		this.documentos = new HashMap<String, Documento>();
	}

	public boolean criarDocumento(String titulo) {
		return this.criarDocumento(titulo, 0);
	}

	public boolean criarDocumento(String titulo, int tamanhoMaximo) {
		if (this.documentos.containsKey(titulo))
			return false;

		this.documentos.put(titulo, new Documento(titulo, tamanhoMaximo));
		return true;
	}

	public void removerDocumento(String titulo) {
		this.documentos.remove(titulo);
	}

	public boolean criarTexto(String tituloDoc, String valor, int prioridade) {
		Documento documento = this.documentos.get(tituloDoc);
		if (documento == null)
			return false;

		Elemento texto = new ElementoTexto(prioridade, valor);
		return documento.adicionarElemento(texto);
	}

	public boolean criarTitulo(String tituloDoc, String valor, int prioridade, int nivel, boolean linkavel) {
		Documento documento = this.documentos.get(tituloDoc);
		if (documento == null)
			return false;

		Elemento titulo = new ElementoTitulo(prioridade, valor, nivel, linkavel);
		return documento.adicionarElemento(titulo);
	}

	public boolean criarLista(String tituloDoc, String valor, int prioridade, String separador, String caractere) {
		Documento documento = this.documentos.get(tituloDoc);
		if (documento == null)
			return false;

		Elemento lista = new ElementoLista(prioridade, valor, separador, caractere);
		return documento.adicionarElemento(lista);
	}

	public String pegarRepresentacaoCompleta(String tituloDoc, int elementoPosicao) throws IllegalAccessException {
		if (!this.documentos.containsKey(tituloDoc))
			throw new IllegalAccessException();

		Documento documento = this.documentos.get(tituloDoc);
		Elemento elemento = documento.getElementos().get(elementoPosicao);
		return elemento.representacaoCompleta();

	}

	public String pegarRepresentacaoResumida(String tituloDoc, int elementoPosicao) throws IllegalAccessException {
		if (!this.documentos.containsKey(tituloDoc))
			throw new IllegalAccessException();

		Documento documento = this.documentos.get(tituloDoc);
		Elemento elemento = documento.getElementos().get(elementoPosicao);
		return elemento.representacaoResumida();
	}
}
