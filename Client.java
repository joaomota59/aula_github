
public class Client {
	public String getName() {
		return this.Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public String getCPF() {
		return this.CPF;
	}

	public void setCPF(String cPF) {
		this.CPF = cPF;
	}

	private String Name;
	private String CPF;
	
	public Client(String Name, String CPF) {
		this.Name = Name;
		this.CPF = CPF;
		
	}

}
