
public class Conta {
    private int numero; 
    private String cpf;
    private double saldo; 
    
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
}
