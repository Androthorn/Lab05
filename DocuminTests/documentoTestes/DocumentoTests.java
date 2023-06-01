package documentoTestes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import documin.Facade;
import documin.documento.Documento;
import documin.documento.DocumentoController;

class DocumentoTests {
	
	Facade facade = new Facade();

	@BeforeEach
	public void documentoBase() {
		facade.criarDocumento("Deldel");
		facade.criarLista("Deldel", "Caramba | testei!", 0, "|", "-");
		facade.criarTexto("Deldel", "olá testando", 1);
		facade.criarDocumento("teste2", 1);
		facade.criarTexto("teste2", "fala, corno", 0);
	}
	
	@Test
	void testExibirDocumento() {
		String[] array = facade.exibirDocumento("Deldel");
		String saida = "";
		for (String string : array) {
			saida += string + " ";
		}
		assertEquals("Caramba| testei! olá testando ", saida);
	}

	@Test
	void testTemEspaco() {
		Documento doc = facade.getDocumentoController().documentos.get("Deldel");
		assertTrue(doc.temEspaco());
	}
	
	@Test
	void testNaoTemEspaco() {
		Documento doc = facade.getDocumentoController().documentos.get("teste2");
		assertFalse(doc.temEspaco());
	}

	@Test
	void testAdicionarElemento() {
		fail("Not yet implemented");
	}

}
