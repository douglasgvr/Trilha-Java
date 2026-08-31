package Condicionais;

public class While {
    public static void main(String[] args) {
        /* Ele funciona de forma muito parecida com o if. A diferença é que,
         * quando o bloco do if termina, o programa continua para baixo.
         * Já no while, quando o bloco termina, o Java volta lá para cima e testa a condição de novo.
         * Ele só para de repetir quando a condição virar false.*/

        int contador = 0;
        while (contador <= 10){
            //Ele vai percorrer de 0 a 10 e vai terminar o bloco da repetição
            //Usamos o ++ ao final da variavel para que ele some de um em um até 10
            System.out.println("Contador: " + contador++);
        }
        System.out.println("Fim da contagem");

        /*Exemplo de uma Bomba Relogio*/

        int tempo = 10;
        while (tempo >= 0){
            // aqui usamos o -- pois ele começa no 10 e vai chegar até o 0
            System.out.println("Contagem regressiva: " + tempo--);
        }
        System.out.println("Booooom");
    }
}
