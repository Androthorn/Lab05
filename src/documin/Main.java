package documin;

public class Main {
	public static void main(String[] args) {

		Facade facade = new Facade();

		facade.criarDocumento("Deldel");
		facade.criarTitulo("Deldel", "Deldel gigachad", 0, 4, true);
		facade.criarTexto("Deldel", "Deldel não é soyboy", 0);

		System.out.println(facade.pegarRepresentacaoCompleta("Deldel", 0));
		System.out.println(facade.pegarRepresentacaoCompleta("Deldel", 1));

	}
}
