
public class Client {
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCPF() {
		return this.CPF;
	}

	public void setCPF(String cPF) {
		this.CPF = cPF;
	}

	private String name;
	private String CPF;
	
	public Client(String Name, String CPF) {
		this.name = Name;
		this.CPF = CPF;
		
	}

}
