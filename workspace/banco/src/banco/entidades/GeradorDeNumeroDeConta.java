package banco.entidades;

public class GeradorDeNumeroDeConta {
	private static long num = 0;
	
	public static long geraNumero() {
		return num++;
	}
}
