package contaBanco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=========== Conta Banco ============\\n");

        System.out.print("Digite o número da conta: ");
        int numero = entrada.nextInt();

        System.out.print("Digite o número da Agência: ");
        String agencia = entrada.next();

        System.out.print("Digite o nome do Cliente: ");
        String nomeCliente = entrada.next();

        System.out.print("Digite o saldo do Cliente: ");
        double saldo = entrada.nextDouble();

        System.out.printf("\\nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.%n", nomeCliente, agencia, numero, saldo);
    }
}
