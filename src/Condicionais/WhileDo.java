package Condicionais;

import java.util.Scanner;

public class WhileDo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /* A diferença fundamental entre o while e o do-while
         * é a ordem em que as validações acontecem:
         * While → Pensa primeiro, age depois
         * do-while -> age primeiro e pensa depois*/

        int numero = 5;
        do {
            System.out.println("Entrou no loop");
        }while (numero < 0);

        /* Um cenário clássico para o do-while é um menu de opções em que
         * o usuário precisa digitar um número para sair do programa.
         * O menu tem que aparecer na tela pelo menos na primeira vez.*/

//        System.out.println("Digite a opção do menu - 1 lista os livros 2 sair");
//        int opcaoMenu = input.nextInt();

//        do {
//            System.out.println("Digite 1 para continuar");
//        } while (opcaoMenu != 0);

        /*Exemplo Caixa eletronico*/

        double valorSaque;

        do {
            System.out.print("Digite o valor para saque (maior que R$ 0.00): R$ ");
            valorSaque = input.nextDouble();

            if (valorSaque <= 0) {
                System.out.println("Valor inválido! Tente novamente.");
            }
        } while (valorSaque > 0); // Repete ENQUANTO o valor digitado for menor ou igual a zero

        System.out.println("Saque de R$ " + valorSaque + " realizado com sucesso!");
        input.close();
    }

}
