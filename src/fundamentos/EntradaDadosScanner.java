package fundamentos;

import java.util.Scanner;

public class EntradaDadosScanner {
    public static void main(String[] args) {
        /*Para capturar o que digitamos (Dados) no teclado, usamos uma ferramenta chamada Scanner*/

        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.println("Em que ano você nasceu?");
        int anoNascimento = input.nextInt();

        int anoAtual = 2026;
        int idade = anoAtual - anoNascimento;

        System.out.println("Olá " + nome + ", " + "Você tem aproximadamente " + idade + " anos.");
    }
}
