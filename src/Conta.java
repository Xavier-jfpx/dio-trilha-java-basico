public class Conta {
    int numero;
    String agencia, cliente;
    double saldo;

    Conta() {
        this.numero = 1021;
        this.agencia = "067-8";
        this.cliente = "MARIO ANDRADE";
        this.saldo = 237.48;
    }

    public Conta(int numero, String agencia, String cliente, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return this.agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getCliente() {
        return this.cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
