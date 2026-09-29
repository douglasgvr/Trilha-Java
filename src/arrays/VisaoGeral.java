package arrays;

public class VisaoGeral {
    public static void main(String[] args) {
        /*Um Array é a estrutura de dados mais primitiva e fundamental do Java.
         *Ele resolve o problema de ter que declarar dezenas de variáveis individuais
         *para armazenar dados relacionados,
         *agrupando múltiplos valores sob um único nome de variável.*/

        /*Exemplo de um array*/
        /*Arrays são indexados começando com o número 0*/
        String[] nomes = new String[3];
        nomes[0] = "Douglas";
        nomes[1] = "Sabrina";
        nomes[2] = "Stella";

        /*Declaração por inicialização, já declares os tipos e o tamanho do array junto*/
        int[] idades = {38, 32, 8};

        /*Arrays tem tipagem fortes e únicas, ao declarar um arrays de Strings
        * você não consegue colocar inteiros nele ou qualquer outro tipo de variavel*/

        /*Eles têm tamanhos estáticos, o array de nomes foi declarado com 3 strings
        * eu não consigo mais acrescentar outra string nele*/

        double[] precos = {10.99, 5.95, 3.49};
        System.out.println(precos[1]);
    }
}
