package Testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import documin.Facade;

class ElementoListaTest {

	Facade facade = new Facade();

	@BeforeEach
	public void elementoTitulobase() {
		facade.criarDocumento("Deldel");
		facade.criarLista("Deldel", "Exemplo | de uma lista | de 3 termos", 0, "|", "-");
	}

	@Test
	void representacaoCompletaTest() {
		assertEquals("- Exemplo\n- de uma lista\n- de 3 termos\n", facade.pegarRepresentacaoCompleta("Deldel", 0));
	}

	@Test
	void representacaoResumidaTest() {
		facade.criarLista("Deldel", "Exemplo @ de uma lista @ de 3 termos", 1, "@", "-");
		assertEquals("Exemplo@ de uma lista@ de 3 termos@", facade.pegarRepresentacaoResumida("Deldel", 1));
	}

}
