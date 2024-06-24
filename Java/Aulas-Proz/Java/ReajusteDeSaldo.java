import java.util.Scanner;

public class ReajusteDeSaldo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double saldo;
        double ajuste;

        System.out.println("Informe seu saldo: ");
        saldo = sc.nextDouble();
        sc.close();

        ajuste = saldo * 0.01 + saldo;

        System.out.printf("%.2f", ajuste);

    }


    
}
