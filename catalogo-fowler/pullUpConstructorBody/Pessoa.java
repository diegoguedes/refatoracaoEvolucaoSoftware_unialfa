package pullUpConstructorBody;

public class Pessoa {
	String nome;
	String endereco;
	int idade;

	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public Pessoa(String nome, int idade, String endereco) {
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
	}
}
