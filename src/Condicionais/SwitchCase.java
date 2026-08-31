package Condicionais;

public class SwitchCase {
    public static void main(String[] args) {
        /* O switch (que pode ser traduzido como "escolha" ou "interruptor") é uma estrutura de decisão.
         * Ele serve para escolher rapidamente um único caminho de execução,
         * avaliando o conteúdo de uma variável e direcionando o código direto para a resposta correspondente.*/

        /* Imagine um menu de um sistema de Biblioteca*/

        int menudigitado = 2;

        switch (menudigitado) {
            case 1:
                System.out.println("Listar livros disponiveis");
                break;
            case 2:
                System.out.println("Listar livros atrasados com mais de 2 dias");
                break;
            case 3:
                System.out.println("Cadastrar livro");
                break;
        }
    }
}
