package Condicionais;

public class IfElseSeSenao {
    public static void main(String[] args) {
        /*O if/else (Se/SeNao) é uma condicional na qual decidimos uma situação no nosso codigo
        * Imagine o sistema de um caixa eletrônico avaliando se um cliente pode fazer um saque:
        * saldo: 100,00 -> saque 90,00 nessa situação ele verifica se o cliente tem saldo
        * se tiver ele efetua o saque, se não ele recusa por saldo insuficiente*/

        /*Estrutura*/
        String condicao = "Saldo do Cliente";
        if (condicao.equals("Saldo do Cliente")) {
            String execucao = "Se a condicao for verdade ele executa essa linha";
        }else {
            String execucao2 = "Se a primeira execucao nao acontecer, ele executa essa linha";
        }
        /*Exemplo prático*/
        double saldo = 100.0;
        double valorSaque = 150.0;

        if (saldo >= valorSaque) {
            System.out.println("Saque de dinheiro liberado!");
        } else {
            System.out.println("Operação negada: Saldo insuficiente.");
        }

        /*Verificando a idade de uma pessoa adulto ou criança*/

        int idade = 15;

        if (idade <= 17) {
            int anosFaltante = 18 - idade;
            System.out.println("Voce é menor de idade, ainda falta: " + anosFaltante + " anos pra voce dirigir");
        }else {
            System.out.println("Ele ja é maior de idade");
        }
    }
}
