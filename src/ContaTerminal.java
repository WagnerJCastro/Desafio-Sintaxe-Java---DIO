import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        Scanner entrada = new Scanner(System.in);


        System.out.println("======= Banco Terminal =======");
        System.out.println("Por gentileza digite seu nome: ");
        nomeCliente = entrada.nextLine();
        System.out.println("Digite o número da sua conta: ");
        numero = entrada.nextInt();
        System.out.println("Digite a agência da sua conta: ");
        agencia = entrada.next();
        System.out.println("Digite o saldo da sua conta: ");
        saldo = entrada.nextDouble();

        System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque.");

    }
}