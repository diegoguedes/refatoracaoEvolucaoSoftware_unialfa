package replaceConditionalWithPolymorphism;

public class Viajante {
	private String tipo;
	
	public Viajante(String tipo){
		this.tipo = tipo;
	}

	public String getBebida() throws Exception {
		switch (tipo) {
		case "ALEMAO":
			return "cerveja";
		case "BRASILEIRO":
			return "pinga + limao";
		case "AMERICANO":
			return "coca_cola";
		}
		throw new Exception("Tipo desconhecido!");
	}
}
