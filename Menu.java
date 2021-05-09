
import java.io.IOException;
import java.util.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
	private String title;
	private List<String> options;
	private String name; 
	private String cpf;
	private ArrayList<Client> Clientes = new ArrayList();
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
		while (true){
			op = 0;
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
			}else if(op == 1) {
				
				System.out.print("\nInforme o numero da conta: ");
				Scanner ler = new Scanner(System.in);
				int numeroConta; 
				
				numeroConta = ler.nextInt();
				
				System.out.print("\nInforme o cpf do cliente: ");
				Scanner cpfCliente = new Scanner(System.in);
				this.cpf = cpfCliente.nextLine();
				
				Conta c1 = new Conta(numeroConta, this.cpf);
				
				System.out.println("\n"+c1.getSaldo());
				
				
				
				
				
			}else if(op==2){
				System.out.print("Informe o nome do cliente: ");
				Scanner names  = new Scanner(System.in);
				this.name = names.nextLine();
				System.out.print("\nInforme o cpf do cliente: ");
				Scanner cpfs  = new Scanner(System.in);
				this.cpf = cpfs.nextLine();
				Client client = new Client(name,cpf);
				Clientes.add(client);//cada cliente cadastrado é adicionado ao vetor
				
				System.out.println("\nCliente "+client.getName()+" cadastrado\ncom cpf:"+client.getCPF());
			}
			
			else if(op==3) {
				
				System.out.print("\nInforme o cpf do cliente: ");
				Scanner cpfs  = new Scanner(System.in);
				this.cpf = cpfs.nextLine();
				System.out.print("\nInforme o numero da conta: ");
				Scanner ler = new Scanner(System.in);
				int numeroConta; 
				numeroConta = ler.nextInt();
				System.out.print("\nInforme o valor do Saque: ");
				Scanner saque  = new Scanner(System.in);
				double saquex = saque.nextDouble();
				for (Client client : Clientes) {//pecorre o array de clientes
					if(client.getCPF().equals(this.cpf)) {
						Conta conta = new Conta(numeroConta, this.cpf);
						conta.saca(saquex);
						System.out.println("\nSaldo Realizado!");
						System.out.println("\nSaldo Atual"+conta.getSaldo());
						break;
					}
					
				}
				
			}
			
	else if(op==4) {
				
				System.out.print("\nInforme o cpf do cliente: ");
				Scanner cpfs  = new Scanner(System.in);
				this.cpf = cpfs.nextLine();
				System.out.print("\nInforme o numero da conta: ");
				Scanner ler = new Scanner(System.in);
				int numeroConta; 
				numeroConta = ler.nextInt();
				System.out.print("\nDigite 1 - Para registrar uma chave codigo aleatorio ou 2 para registrar a chave CPF");
				Scanner opcaoChave  = new Scanner(System.in);
				for (Client client : Clientes) {//pecorre o array de clientes
					if(client.getCPF().equals(this.cpf)) {
						Conta conta = new Conta(numeroConta, this.cpf);
						conta.cadastrarChavePix(opcaoChave.nextInt());
						System.out.println("\nChave Cadastrada!");
						break;
					}
					
				}
				
			}
			else {
				break;
			}
			
			


		}
		return op;
	}
}
