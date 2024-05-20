import java.util.Scanner;

public class CalculoDeSalariosMinimos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double salarioMinimo;
        double salarioUsuario;
        double total;

        System.out.print("Digite seu salário mínimo: ");
        salarioMinimo = sc.nextDouble();

        System.out.print("Digite seu salário atual: ");
        salarioUsuario = sc.nextDouble();

        sc.close();

        total = salarioUsuario / salarioMinimo;

        System.out.printf("Você recebe %.2f salário(s) mínimo(s).", total);
    }
}
