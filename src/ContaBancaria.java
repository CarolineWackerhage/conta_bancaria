public class ContaBancaria {
    String titular;
    String numeroConta;
    Double saldo;

    void mostrarSaldo() {
        System.out.println("Saldo = " + saldo);
    }

    void depositar (Double valor) {
        System.out.println("Depositando = " + valor);
        saldo = saldo  +  valor;
    }

    void sacar (Double valor) {
        System.out.println("Sacando = " + valor);
        saldo = saldo  -  valor;
    }
}
