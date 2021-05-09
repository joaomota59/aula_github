public class Conta {
    private int numero; 
    private Cliente dono;
    private double saldo; 
    
    public Conta(int numero, Cliente dono, double saldo){
        this.numero = numero; 
        this.dono = dono; 
        this.saldo = saldo; 
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
