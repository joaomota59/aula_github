
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
	private String title;
	private String name;
	private String cpf;
	private List<String> options;

	public Menu(List<String> options) {
		this.title = "Menu";
		this.options = options;
	}

	public Menu(String title, List<String> options) {
		this.title = title;
		this.options = options;
	}

	public int getSelection() {
		int op = 0;
		while (op==0){
			System.out.println(title+"\n");
			int i=1;
			for (String option : options) {
				System.out.println(i++ + " - " + option);
			}

			System.out.println("Informe a opcao desejada. ");
			Scanner s = new Scanner(System.in);
			String str = s.nextLine();
			try {
				op = Integer.parseInt(str);
			}
			catch (NumberFormatException e) {
				op =0;
			}
			if (op>=i){
				System.out.println("Opcao errada!");
				op=0;
			}
			else if(op==2){
				System.out.print("Informe o nome do cliente: ");
				Scanner names  = new Scanner(System.in);
				this.name = names.nextLine();
				System.out.print("\nInforme o cpf do cliente: ");
				Scanner cpfs  = new Scanner(System.in);
				this.cpf = cpfs.nextLine();
				Client client = new Client(name,cpf);
				System.out.println("\n"+client.getName()+" e cpf:"+client.getCPF());
			}

		}
		return op;
	}
}
