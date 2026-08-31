package fundamentos;

import java.util.Scanner;

public class DesafioFundamentos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = input.nextLine();

        System.out.println("Seu nome Completo é: "
                + nomeCompleto.toUpperCase()
                + ", Você sabia que seu nome completo tem "
                + nomeCompleto.length() + " Caracteres");

        System.out.println("Qual é o saldo atual da sua conta? ");
        double saldoAtual = input.nextDouble();
        double valorMonitor = 500.50;
        int quantidadeMonitores = 2;
        char setor = 'T';
        double valorTotal = valorMonitor * quantidadeMonitores;

        System.out.println("O valor dos monitores deu: " + valorTotal);

        boolean compraAprovada = saldoAtual >= valorTotal && quantidadeMonitores > 0;

        System.out.println(compraAprovada);

    }

}
