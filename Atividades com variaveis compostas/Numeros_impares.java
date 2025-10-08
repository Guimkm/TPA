import java.util.Scanner;

public class Numeros_impares{
public static void main(String[] rgs){
Scanner input = new Scanner(System.in);
int[] numeros = new int[100];
int[] impares = new int[100];
int contadorimpares = 0;
System.out.println("Digite 100 numeros:  ");
for (int i = 0;i < numeros.length; i++) {
    System.out.print("Número "+(i + 1)+": ");
    numeros[i] = input.nextInt();

    if (numeros[i] % 2 != 0){
        impares[contadorimpares] = numeros[i];
        contadorimpares++;
    }
    
}
System.out.println("\nNúmeros impares:  ");
for(int i = 0; i < contadorimpares; i++)
System.out.println(impares[i]);
}
 
}