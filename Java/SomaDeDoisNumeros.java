import java.util.Scanner;

public class SomaDeDoisNumeros {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int valorTotal;

        System.out.print("Digite o primeiro número: ");
        num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = sc.nextInt();

        valorTotal = num1 + num2;

        System.out.printf("Valor total: %d", valorTotal);

        sc.close();
    }
}
