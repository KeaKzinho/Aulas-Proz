import java.util.Scanner;

public class Aprovacao {

    public static int aprovado(double[] medias){
        int contador = 0;
        for (double nota : medias){
            if (nota>=6){
                contador++;
            }
        }
        return contador;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double [] medias = new double[3];
        

        for (int i = 0; i < medias.length; i++){
            System.out.printf("Informe a média a %d aluno: ", i+1);
            medias[i] = sc.nextFloat();
        }
        System.out.println(aprovado(medias));

        sc.close();
    }
}
