public class Conta {
    private int numero; 
    private String cpf;
    public String getCpf() {
		return cpf;
	}
	private double saldo; 
    
    private String chave_CPF;
    private String chave_Codigo;
    
    public Conta(int numero, String cpf){
        this.numero = numero; 
        this.cpf = cpf; 
        this.saldo = 0.0; 
    }

    public double getSaldo(){
        return this.saldo;
    }

    void deposita(double quantidade){
        this.saldo += quantidade;
    }

    void saca(double quantidade){
        double novoSaldo = this.saldo - quantidade;
        this.saldo = novoSaldo;
    }

    void transfere(Conta destino, double valor){
        this.saldo = this.saldo - valor; 
        destino.saldo = destino.saldo + valor; 
    }
    
   public void cadastrarChavePix(int tipoDeChave) {
    	
    	switch(tipoDeChave) {
    		case 1:
    			if(this.chave_CPF == "")
    				this.chave_CPF = this.cpf;
    			break;
    			
    		case 2:
    			if(this.chave_Codigo ==""){
    				//Código 'Randomico'
    				this.chave_Codigo ="ACFEDFAGR" ;
    			}
    			
    		default: 
    			break;
    	}
    }
   public void pagarBoleto(String codigoBoleto,double valorBoleto) {
	   
	   /*
	    * Verifica Codigo do boleto
	    
	    */
	   
	   if((this.saldo - valorBoleto)>0.0) {
		   this.saldo -=valorBoleto;
	   }
	   else {
		   System.out.print("Saldo Insuficiente para pagar o boleto\n");
	   }
   }
}
