package colecoes;

import java.util.HashSet;

@SuppressWarnings("all")
public class VisaoGeral {
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();
        conjunto.add(1.2); // double -> Double
        conjunto.add(true);
        conjunto.add("Douglas");
        conjunto.add(10);
        conjunto.add('M');

        System.out.println("Tamanho: " + conjunto.size()); // em lista usando size pra saber o tamanho do array
        conjunto.remove('M');

        System.out.println("Tamanho: " + conjunto.size());
    }
}
