package autenticadorDeSenha;

public class AutenticadorDeSenha {
	public static void main(String[] args) {
		
		String senha = "Henriquealme%ida189";
		validadorDeSenha(senha);

	}

	private static void validadorDeSenha(String senha) {

		if (!contemLetraMaiuscula(senha)) {

			System.out.println("A senha precisa de pelo menos uma letra maiúscula");

		} else if (!contemNumero(senha)) {

			System.out.println("A senha precisa de pelo menos um número");

		} else if (!contemCaractereEspecial(senha)) {

			System.out.println("A senha precisa de pelo menos um caractere especial");

		} else if (!(temComprimentoMinimo(senha, 15))) {

			System.out.println("A senha precisa de pelo menos de 10 caracteres");

		} else if (!(contemSeuqncia(senha))) {

			System.out.println("A senha não pode conter sequencia");

		} else {

			System.out.println("Tudo ok");
		}

	}

	public static boolean contemLetraMaiuscula(String senha) {
		return senha.matches(".*[A-Z].*");
	}

	public static boolean contemNumero(String senha) {
		return senha.matches(".*[0-9].*");
	}

	public static boolean contemCaractereEspecial(String senha) {
		return senha.matches(".*[!@#$%^&*()].*");
	}

	public static boolean temComprimentoMinimo(String senha, int tamanhoMinimo) {
		return senha.length() >= tamanhoMinimo;
	}

	public static boolean contemSeuqncia(String senha) {
		return senha.matches("^(?!.*(?:123|456|789)).+$");
	}

}
