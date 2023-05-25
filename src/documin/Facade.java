package documin;

import documin.documento.DocumentoController;

public class Facade {

	private DocumentoController documentoController;

	public Facade() {
		this.documentoController = new DocumentoController();
	}

	// Criação de documento
	
	public boolean criarDocumento(String titulo) {
		return this.documentoController.criarDocumento(titulo);
	}

	public boolean criarDocumento(String titulo, int tamanhoMaximo) {
		return this.documentoController.criarDocumento(titulo, tamanhoMaximo);
	}

	public void removerDocumento(String titulo) {
		this.documentoController.removerDocumento(titulo);
	}

	public int contarElementos(String titulo) {
		return 0;
	}

	// Criação de elementos em um documento
	
	public boolean criarTexto(String tituloDoc, String valor, int prioridade)  {
			return this.documentoController.criarTexto(tituloDoc, valor, prioridade);
	}
	
	public boolean criarTitulo(String tituloDoc, String valor, int prioridade, int nivel, boolean
	linkavel) {
		return this.documentoController.criarTitulo(tituloDoc, valor, prioridade, nivel, linkavel);
	}
	
	// Representação
	
	public String pegarRepresentacaoCompleta(String tituloDoc, int elementoPosicao) {
		try {
			return this.documentoController.pegarRepresentacaoCompleta(tituloDoc, elementoPosicao);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public String pegarRepresentacaoResumida(String tituloDoc, int elementoPosicao) {
		try {
			return this.documentoController.pegarRepresentacaoResumida(tituloDoc, elementoPosicao);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}