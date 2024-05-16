import java.util.Scanner;

public class MaiorNumero{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[3];
        int maiorNumero;

        for (int i = 0; i < numeros.length; i++){
            System.out.printf("Informe um número para adicionar: ");
            numeros[i] = sc.nextInt();
        }

        maiorNumero = numeros[0];

        for (int numero : numeros) {
            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        }

        System.out.printf("Maior número é: %d", maiorNumero);

        sc.close();
    }
}