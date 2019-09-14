package inlineMethod;

public class Taxi {

	int bandeiradaDoTaxi(int hora) {		
		return (horaMaiorQue22(hora) ? 2 : 1);
	}
	
	boolean horaMaiorQue22(int hora) {
		return hora > 22;
	}

}
