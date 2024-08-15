import java.util.Scanner;

public class AntecessorESucessor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero;
        int antecessor;
        int sucessor;

        System.out.print("Digite o número: ");
        numero = sc.nextInt();

        sc.close();

        antecessor = numero - 1;
        sucessor = numero + 1;

        System.out.printf("Antecessor: %d%n", antecessor);
        System.out.printf("Sucessor %d%n", sucessor);

    }

}
