
public class Client {
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	private String Name;
	private String CPF;
	
	public Client(String Name, String CPF) {
		this.Name = Name;
		this.CPF = CPF;
		
	}

}
