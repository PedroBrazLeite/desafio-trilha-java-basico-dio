import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o nome do Cliente !");
        nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o número da Agência !");
        numero = sc.nextInt();

        System.out.println("Por favor, digite a Agência !");
        agencia = sc.next();

        System.out.println("Por favor, digite o saldo do Cliente !");
        saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " +
                agencia + ", conta " + numero + " e seu saldo de R$ " + saldo + " já está disponível para saque.");
    }
}