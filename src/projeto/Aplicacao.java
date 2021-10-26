package projeto;

public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("SUV");
		Carro carroSuv = new Suv();
		carroSuv.frear();
		carroSuv.acelerar();
		carroSuv.desligar();
		carroSuv.ligar();
		carroSuv.seAutoDescrever();
	
			
		System.out.println("SEDAN");
		Carro carroSedan = new Sedan();
		carroSedan.frear();
		carroSedan.acelerar();
		carroSedan.desligar();
		carroSedan.ligar();
		carroSedan.seAutoDescrever();
		
		
		System.out.println("ESPORTIVO");
		Carro carroEsportivo = new Esportivo();
		carroEsportivo.frear();
		carroEsportivo.acelerar();
		carroEsportivo.desligar();
		carroEsportivo.ligar();
		carroEsportivo.seAutoDescrever();
		
		
		System.out.println("PICAPE");
		Carro carroPicape = new Picape();
		carroPicape.frear();
		carroPicape.acelerar();
		carroPicape.desligar();
		carroPicape.ligar();
		carroPicape.seAutoDescrever();
		
	

	}

}
