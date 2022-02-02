import java.util.Scanner;

public class Aplicacao {
	
	public static void main(String[] args) {

		System.out.println("Digite um binario de entrada: ");
		Scanner scan = new Scanner(System.in);
		
		String entrada = scan.next();
		
		Binarios StringBinaria = new Binarios(entrada);

		int numeroBinario = ConverteStringParaInteiro.converte(StringBinaria);

		System.out.println("Numero Binario: " + numeroBinario);

		int numCasas = StringBinaria.contaCasas();

		System.out.println("Numero de Casas do binario: " + numCasas);

		int totalParcial = 0;

		for (int i = 0; i < StringBinaria.getNumeroBinario().length(); i++) {
			char c = StringBinaria.getNumeroBinario().charAt(i);
			int myInt = Character.getNumericValue(c);
			totalParcial = totalParcial + (myInt * CalculaPotencia.calcula(2, numCasas - 1));
			numCasas--;
		}

		int totalGeral = totalParcial;	

		System.out.println("Valor da Conversao: " + totalGeral);

	}	
}
	