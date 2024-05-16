import java.util.Scanner;

public class Array{
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] numeros = new int[3];
        numeros[0] = 5;
        numeros[1] = 2;
        numeros[2] = 3;

        for (int i = 0; i < numeros.length; i++){
            System.out.printf("Informe um número para posição %d do array");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }

        for (int numero : numeros){
            System.out.println(numero);
        }

        sc.close();
    }
}