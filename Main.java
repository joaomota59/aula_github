import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Menu mainMenu =  new Menu("Menu Principal", Arrays.asList("Abrir Conta", "Cliente", "Operacoes"));
		System.out.println(mainMenu.getSelection() + " foi selecionada");
		System.out.println("Fim");
	}

}
