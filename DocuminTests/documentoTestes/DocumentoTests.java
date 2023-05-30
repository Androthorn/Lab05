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
	}
	
	@Test
	void testExibirDocumento() {
		String[] array = facade.exibirDocumento("Deldel");
		String saida = "";
		for (String string : array) {
			saida += string;
		}
		assertEquals("caralho", saida);
	}

	@Test
	void testTemEspaco() {
		fail("Not yet implemented");
	}

	@Test
	void testAdicionarElemento() {
		fail("Not yet implemented");
	}

}
