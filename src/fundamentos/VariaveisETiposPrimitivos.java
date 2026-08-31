package fundamentos;

public class VariaveisETiposPrimitivos {
    public static void main(String[] args) {
        /*Variaveis no Java são como caixas no qual armazenamos os dados nelas
        * Existem vários tipos de dados, como se eu tivesse vários tipos de caixas em determinados tamanhos*/

        //String é aonde armazenamos nossos textos, frases, sempre devem ser armazenados com "".
        String nome = "Douglas Coelho";

        //Os números armazenamos nas seguintes variaveis.
        int idade = 38; // para números inteiros
        double salario = 1200.00; // para números decimais

        char sexo = 'M'; // para um único carácter

        boolean estaChovendoHoje = false; // Para verdadeiro ou falso -True e False-

        /*Tipos de Referência (String) e seus Métodos (A diferença crucial).*/

        //toUpperCase() modifica a string colocando todas as letras em maiúsculas.
        //length() dias a quantidade de carácter que tem a variavel nome
        nome = nome.toUpperCase();
        System.out.println("Nome: " + nome); // DOUGLAS COELHO
        System.out.println("Quantas letras tem a variavel nome: " + nome.length());


    }
}
