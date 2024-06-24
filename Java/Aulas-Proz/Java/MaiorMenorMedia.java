import java.util.Scanner;

public class MaiorMenorMedia {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[3];
        int maiorNumero;
        int menorNumero;
        double totalSoma = 0;

        for (int i = 0; i < numeros.length; i++){
            System.out.printf("Informe um número para adicionar: ");
            numeros[i] = sc.nextInt();
        }

        menorNumero = numeros[0];
        maiorNumero = numeros[0];

        for (int numero : numeros) {
            if (numero > maiorNumero) {
                maiorNumero = numero;
            }

            if (numero < menorNumero) {
                menorNumero = numero;
            }

            totalSoma += numero;
        }

        System.out.printf("Maior número é %d%n", maiorNumero);
        System.out.printf("Menor número é %d%n", menorNumero);
        System.out.printf("A média é: %.2f%n", totalSoma / numeros.length);

        sc.close();
    }
}
