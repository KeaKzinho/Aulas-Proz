import java.util.Scanner;

public class Media{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[3];
        int totalSoma = 0;

        for (int i = 0; i < numeros.length; i++){
            System.out.printf("Informe um número para adicionar: ");
            numeros[i] = sc.nextInt();
        }

        for (int numero : numeros) {
            totalSoma += numero;
        }

        System.out.printf("A média é %d", totalSoma / numeros.length);

        sc.close();
    }
}
