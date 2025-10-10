import java.util.Arrays;
import java.util.Collections;
public class Nomes_ordenados {
    public static void main(String[] args) {
        String[] nomes = {"Henrique", "Aquino", "Paulo", "Luan", "Descktop Soares"};
        Arrays.sort(nomes);
        System.out.println("Nomes em ordem crescente:  ");
        for (String nome : nomes) {
            System.out.println(nome);

        }
        System.out.println();

        Arrays.sort(nomes, Collections.reverseOrder());
        System.out.println("Nomes em ordem decrescente:  ");
        for(String nome : nomes) {
            System.out.println(nome);
        }


    }
}
