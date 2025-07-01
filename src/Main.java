import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo a sua conta bancária!");
        ContaBancaria conta1 = new ContaBancaria();
        conta1.titular = "Marcelo de Alcantara";
        System.out.println("Nome Completo: " + conta1.titular);
        conta1.numeroConta = "741.852-9";
        System.out.println("Número da Conta: " + conta1.numeroConta);
        conta1.saldo = 586.52;
//        titular.mostrarSaldo();
//        titular.depositar(500.00);
//        titular.mostrarSaldo();
//        titular.sacar(300.00);
//        titular.mostrarSaldo();
//        titular.sacar(1000.00);
//        titular.mostrarSaldo();


        boolean estaAtivo = true;
        String entrada;
        Scanner s = new Scanner(System.in);
        while (estaAtivo) {
            System.out.println("Digite o que deseja:\n" +
                    "1 - Verificar Saldo\n" +
                    "2 - Depositar\n" +
                    "3 - Sacar\n" +
                    "4 - Sair\n");
            entrada = s.nextLine();
            switch (entrada) {
                case "1":
                    conta1.mostrarSaldo();
                break;

                case "2":
                    System.out.println("Digite o Valor que deseja depositar");
                    conta1.depositar(Double.valueOf(s.nextLine()));
                    conta1.mostrarSaldo();
                    break;

                case "3":
                    System.out.println("Digite o Valor que deseja sacar");
                    conta1.sacar(Double.valueOf(s.nextLine()));
                    conta1.mostrarSaldo();
                    break;

                case "4":
                    estaAtivo = false;
                break;
            }

        }
    }
}