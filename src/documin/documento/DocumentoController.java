package documin.documento;

import java.util.HashMap;
import java.util.Map;


public class DocumentoController {
	public Map<String, Documento> documentos;

	public DocumentoController() {
		this.documentos = new HashMap<String, Documento>();
	}

	public boolean criarDocumento(String titulo) {
		if (this.documentos.containsKey(titulo))
			return false;
		if (titulo.isBlank())
			throw new IllegalArgumentException();

		return this.criarDocumento(titulo, 0);
	}

	public boolean criarDocumento(String titulo, int tamanhoMaximo) {
		if (this.documentos.containsKey(titulo))
			return false;
		if (titulo.isBlank())
			throw new IllegalArgumentException();
		if (tamanhoMaximo < 0)
			throw new IllegalArgumentException();
		this.documentos.put(titulo, new Documento(titulo, tamanhoMaximo));
		return true;
	}

	public int contarElementos(String titulo) {
		Documento documento = documentos.get(titulo);
		return documento.getElementos().size();
	}

	public void removerDocumento(String titulo) {
		this.documentos.remove(titulo);
	}

	public String[] exibirDocumento(String titulo) {
		Documento doc = documentos.get(titulo);
		return doc.exibirDocumento();
	}

	public boolean criarTexto(String tituloDoc, String valor, int prioridade) {
		Documento documento = this.documentos.get(tituloDoc);
		if (documento == null)
			return false;

		return documento.criarTexto(tituloDoc, valor, prioridade);
	}

	public boolean criarTitulo(String tituloDoc, String valor, int prioridade, int nivel, boolean linkavel) {
		Documento documento = this.documentos.get(tituloDoc);
		if (documento == null)
			return false;

		return documento.criarTitulo(tituloDoc, valor, prioridade, nivel, linkavel);
	}

	public boolean criarLista(String tituloDoc, String valor, int prioridade, String separador, String caractere) {
		Documento documento = this.documentos.get(tituloDoc);
		if (documento == null)
			return false;

		return documento.criarLista(tituloDoc, valor, prioridade, separador, caractere);
	}

	public boolean criarTermos(String tituloDoc, String valor, int prioridade, String separador, String ordem) {
		Documento documento = this.documentos.get(tituloDoc);
		if (documento == null)
			return false;

		return documento.criarTermos(tituloDoc, valor, prioridade, separador, ordem);
	}

	public String pegarRepresentacaoCompleta(String tituloDoc, int elementoPosicao) throws IllegalAccessException {
		if (!this.documentos.containsKey(tituloDoc))
			throw new IllegalAccessException();

		Documento documento = this.documentos.get(tituloDoc);
		return documento.pegaRepresentacaoCompletaDoElemento(elementoPosicao);

	}

	public String pegarRepresentacaoResumida(String tituloDoc, int elementoPosicao) throws IllegalAccessException {
		if (!this.documentos.containsKey(tituloDoc))
			throw new IllegalAccessException();

		Documento documento = this.documentos.get(tituloDoc);
		return documento.pegaRepresentacaoResumidaDoElemento(elementoPosicao);
	}
}
