public class Binarios {

	private String numeroBinario = "";

	public String getNumeroBinario() {
		return numeroBinario;
	}

	public void setNumeroBinario(String numeroBinario) {
		this.numeroBinario = numeroBinario;
	}

	public Binarios(String numero) {
		this.numeroBinario = numero;
	}

	public int contaCasas() {
		int length = numeroBinario.length();
		return length;
	}

	public boolean validaBinario(Binarios binario) {
		boolean valida = false;
		try {
			for (int i = 0; i < binario.getNumeroBinario().length(); i++) {
				char c = binario.getNumeroBinario().charAt(i);
				if (c != '0' && c != '1') {
					System.out.println("Caracter: " + c + " invalido ");
					return valida = false;
				} else {
					valida = true;
				}
			}
		} catch (NumberFormatException e) {
			System.out.println("teste");
		}
		return valida;
	}

	void imprime(Binarios binario) {
		for (int i = 0; i < numeroBinario.length(); i++) {
			char c = binario.getNumeroBinario().charAt(i);
			System.out.println(c);
		}

	}

	void imprimePotenciaInversa(Binarios binario) {
		for (int i = numeroBinario.length()-1; i > -1; i--) {
			char c = binario.getNumeroBinario().charAt(i);
			System.out.println(c);

		}

	}	
	
}
