import java.util.Scanner;

public class CalculoDeValorComIPI {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int porcentagemIPI;
        int codigo1;
        int codigo2;
        int quant1;
        int quant2;
        double valor1;
        double valor2;
        double valorSemIPI;
        double valorIPI;
        double valorTotal;

        System.out.print("Digite a porcentagem IPI: ");
        porcentagemIPI = sc.nextInt();

        // Peça 1
        System.out.print("Digite o Código1: ");
        codigo1 = sc.nextInt();

        System.out.print("Digite o Valor1: ");
        valor1 = sc.nextInt();

        System.out.print("Digite a Quantidade1: ");
        quant1 = sc.nextInt();

        // Peça 2
        System.out.print("Digite o Código2: ");
        codigo2 = sc.nextInt();

        System.out.print("Digite o Valor2: ");
        valor2 = sc.nextInt();

        System.out.print("Digite a Quantidade2: ");
        quant2 = sc.nextInt();

        sc.close();

        // Calcular total sem IPI
        valorSemIPI = (valor1 * quant1) + (valor2 * quant2);

        // Calcular o IPI
        valorIPI = (valorSemIPI * porcentagemIPI) / 100;

        // Calcular o valor a ser pago
        valorTotal = valorSemIPI + valorIPI;

        System.out.printf("O total com IPI a ser pago, dos códigos %d e %d, é de: %.2f.", codigo1, codigo2, valorTotal);

    }
}
