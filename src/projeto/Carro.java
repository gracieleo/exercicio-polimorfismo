package projeto;

public abstract class Carro extends Automovel {

	@Override
	public void ligar() {
		// TODO Auto-generated method stub
		System.out.println("Carro ligando");
		
	}

	@Override
	public void desligar() {
		// TODO Auto-generated method stub
		System.out.println("Carro desligando");
		
	}

	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		System.out.println("Carro acelerando");
		
	}

	@Override
	public void frear() {
		// TODO Auto-generated method stub
		System.out.println("Carro freando");
		
	}
	
	public abstract void seAutoDescrever ();
	

}
