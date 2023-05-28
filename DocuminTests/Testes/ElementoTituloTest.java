package Testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import documin.Facade;

class ElementoTituloTest {

	Facade facade = new Facade();

	@BeforeEach
	public void elementoTitulobase() {
		facade.criarDocumento("Deldel");
		facade.criarTitulo("Deldel", "Deldel gigachad", 0, 4, true);
	}
	
	@Test
	void representacaoCompletaTest() {
		assertEquals("4. Deldel gigachad --\n4-DELDELGIGACHAD", facade.pegarRepresentacaoCompleta("Deldel", 0));
	}
	
	@Test
	void representacaoResumidaTestAnterior() {
		facade.criarTitulo("Deldel", "Deldel gigachad", 0, 4, true);
		assertEquals("4. Deldel gigachad", facade.pegarRepresentacaoResumida("Deldel", 1));
	}
	
	@Test
	void representacaoResumidaTestCasoNovo() {
		facade.criarTitulo("Deldel", "Deldel melvin", 0, 5, false);
		assertEquals("5. Deldel melvin", facade.pegarRepresentacaoResumida("Deldel", 1));
	}

}
