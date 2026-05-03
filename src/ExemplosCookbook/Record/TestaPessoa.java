package ExemplosCookbook.Record;

public class TestaPessoa {
	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Renata Lima", 25);

		System.out.printf("Nome: %s%n", p1.nome());
		System.out.printf("Idade: %d%n", p1.idade());
		System.out.println(p1);

	}
}
