    import java.util.Arrays;
public class Nomes_em_ordem_crescente {
    public static void main(String[] args) {
        String[] nomes = {"Henrique", "Aquino rego", "Paulo bidinoso", "Luan", "Descktop Soares"};
        Arrays.sort(nomes);
        System.out.println("Nomes em ordem crescente:  ");
        for (String nome : nomes) {
            System.out.println(nome);

            
        }


    }
}