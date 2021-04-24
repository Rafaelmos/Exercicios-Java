package II_exercicio_1;

public class Main {

	public static void main(String[] args) {
		
		Socio socio1 = new Socio("4534543543", "Douglas", "111", "Rua fulano de tal", "879-0493-323");
		
		Filme filme1 = new Filme(1, "Vingadores", "hjfkjsdhkfsdj", 2012, "Joss Whedon", "A��o");
		Filme filme2 = new Filme(2, "Vingadores: Endgame", "sahjkhsakas", 2019, "Irm�os Russo", "A��o");
		
		DVD dvd1 = new DVD(filme1, 1, "n�o locado");
		DVD dvd2 = new DVD(filme1, 2, "n�o locado");
		DVD dvd3 = new DVD(filme2, 3, "n�o locado");
		
		Locacao locacao = socio1.realizarLocacao(dvd2, 1, "17/12/2019", "20/12/2019");
		
		System.out.println(locacao.getDvd().getFilme().getTitulo());
		System.out.println(locacao.getSocio().getNome());
		System.out.println(locacao.isDevolvido());
		
		socio1.realizarDevolucao(locacao);
		
		System.out.println(locacao.isDevolvido());
		
		
		
	}
	
}
