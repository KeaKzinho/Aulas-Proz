import java.util.Scanner;

public class ConversaoDeIdadeEmDias{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int dias;
        int meses;
        int anos;
        int total;

        System.out.println("Anos: ");
        anos = sc.nextInt();

        System.out.println("Meses: ");
        meses = sc.nextInt();

        System.out.println("Dias: ");
        dias = sc.nextInt();

        sc.close();

        total = (anos * 365) + (meses * 30) + dias;

        System.out.printf("%d dias", total);

    }
}