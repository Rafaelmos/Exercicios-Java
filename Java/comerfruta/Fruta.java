package comerfruta;

public class Fruta {
	public boolean casca;
	public boolean caroco;
	public int quantCarocos;
	
	public Fruta(boolean casca, boolean caroco, int quantCarocos) {
		super();
		this.casca = casca;
		this.caroco = caroco;
		this.quantCarocos = quantCarocos;
	}
	
	public void retirarCaraco() {
		if (caroco==true) {
			while (quantCarocos>0) {
				quantCarocos--;
				System.out.println("A fruta agora tem " + quantCarocos + " cara�os");
			}
			if (quantCarocos==0) {
				caroco = false;
				System.out.println("Os Cara�os foram retirados");
			}
		} else {
			System.out.println("A fruta n�o tem cara�os");
		}	
	}
	
	public void retirarCasca() {
		if (casca==true) {
			casca = false;
			System.out.println("A casca foi retirada");
		} else {
			System.out.println("A fruta n�o tem casca");
		}
	}
	
	public void comerFruta(Fruta fruta) {
		if (caroco==false && casca==false) {
			fruta=null;
			System.gc();
			System.out.println("A fruta foi comida");
		} else {
			if (caroco==true && casca==true) {
				System.out.println("N�o foi poss�vel comer a fruta, por favor retire os caro�os e a casca");
			} else if (caroco==true && quantCarocos>0) {
				System.out.println("N�o foi poss�vel comer a fruta, por favor retire os caro�os");
			} else if (casca==true) {
				System.out.println("N�o foi poss�vel comer a fruta, por favor retire a casca");
			}
		}
	}
		
	
	
	
}

