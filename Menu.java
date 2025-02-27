
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
	private ArrayList<Conta> Contas = new ArrayList();
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
				Contas.add(c1);
				
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
				for (Conta c : Contas) {//pecorre o array de clientes
					if(c.getCpf().equals(this.cpf)) {
						c.saca(saquex);
						System.out.println("\nSaldo Realizado!");
						System.out.println("\nSaldo Atual: "+c.getSaldo());
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
				for (Conta c : Contas) {//pecorre o array de clientes
					if(c.getCpf().equals(this.cpf)) {
						c.cadastrarChavePix(opcaoChave.nextInt());
						System.out.println("\nChave Cadastrada!");
						break;
					}
				}
			}
      
      else if(op==5){
				
				System.out.print("\nInforme o cpf do cliente: ");
				Scanner cpfs  = new Scanner(System.in);
				this.cpf = cpfs.nextLine();
				System.out.print("\nInforme o numero da conta: ");
				Scanner ler = new Scanner(System.in);
				int numeroConta; 
				numeroConta = ler.nextInt();
				System.out.println("\n Informe o valor do depósito: ");
				Scanner v = new Scanner(System.in);
				double valor = v.nextDouble();
				System.out.println(valor);
				
				for(Conta c : Contas) {
					if(c.getCpf().equals(this.cpf)) {
						c.deposita(valor);
						System.out.println("\nDeposito Realizado!");
						System.out.println("\nSaldo Atual: "+c.getSaldo());
					}
					
				}
				
				
			}
      else if(op==6){
			
			System.out.print("\nInforme o cpf do cliente: ");
			Scanner cpfs  = new Scanner(System.in);
			this.cpf = cpfs.nextLine();
			System.out.print("\nInforme o numero da conta: ");
			Scanner ler = new Scanner(System.in);
			int numeroConta; 
			numeroConta = ler.nextInt();
			System.out.println("\n Informe o valor do boleto: ");
			Scanner v = new Scanner(System.in);
			double valor = v.nextDouble();
			System.out.println("\n Informe o codigo do boleto: ");
			Scanner v1 = new Scanner(System.in);
			String boletoCod = v1.nextLine();
			for(Conta c : Contas) {
				if(c.getCpf().equals(this.cpf)) {
					c.pagarBoleto(boletoCod,valor);
					System.out.println("\nBoleto Pago Com Sucesso!");
					System.out.println("\nSaldo Atual: "+c.getSaldo());
				}
				
			}
			
			
		}else if(op==7) {
			System.out.print("\nInforme o cpf do cliente: ");
			Scanner cpfs  = new Scanner(System.in);
			this.cpf = cpfs.nextLine();
			System.out.print("\nInforme o numero da conta: ");
			Scanner ler = new Scanner(System.in);
			int numeroConta; 
			numeroConta = ler.nextInt();
			for(Conta c : Contas) {
				if(c.getCpf().equals(this.cpf)) {
					System.out.println("\nSeu saldo �: "+ c.getSaldo());
				}
								
		}
		}else {
     
				break;
			}
			
			


		}
		return op;
	}
}
