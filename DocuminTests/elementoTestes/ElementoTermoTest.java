package elementoTestes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import documin.Facade;
import documin.documento.elemento.ElementoTermo;

class ElementoTermoTest {
	
	Facade facade = new Facade();

	@BeforeEach
	public void elementoTermoBase() {
		facade.criarDocumento("Deldel");
//		facade.criarTermos("Deldel", "Exemplo | de uma lista | de 3 termos", 0, "|", "-");
		String[] lista =  new String[2];
		lista[0] = "Zenobia";
		lista[1] = "André";
	}

	@Test
	void testRepresentacaoCompleta() {
		fail("Not yet implemented");
	}

	@Test
	void testRepresentacaoResumida() {
		fail("Not yet implemented");
	}

	@Test
	void testOrdenaAlfabeticamente() {
		
	}

}
