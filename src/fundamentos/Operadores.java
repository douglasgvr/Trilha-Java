package fundamentos;

public class Operadores {
    public static void main(String[] args) {
        /*Os Operadores são simbolos que usamos para fazer o Java calcular e comprar dados
        * 1-Operadores Matemáticos
        * + (soma), - (subtração), * (multiplicação), / (divisão)
        *
        * 2-Operadores Relacionais
        * > (Maior que), < (Menor que), == (Igual a), !=
        * Obs: um = guarda valores nas variaveis, doi == comparam se é igual*/

        // Para fixar isso, vamos simular o carrinho de compras de uma loja.

        double produto1 = 45.50;
        double produto2 = 60.00;

        double total = produto1 + produto2;
        System.out.println(total);

        boolean temFreteGratis = total > 100;
        System.out.println(temFreteGratis);

        /* 3-Operadores Lógicos
        * && (E / AND) exige que todas as condições sejam verdadeiras (Ex: Precisa ter saldo && a loja precisa estar aberta).
        * || (OU / OR): Exige que apenas uma condição seja verdadeira. (Ex: Pode pagar com cartão || pagar com dinheiro).
        * ! (NÃO / NOT): Inverte uma condição de verdadeira para falsa, e vice-versa.*/

        boolean clienteVip = true;
        temFreteGratis = total > 100 && clienteVip;
        System.out.println(temFreteGratis);

    }
}
