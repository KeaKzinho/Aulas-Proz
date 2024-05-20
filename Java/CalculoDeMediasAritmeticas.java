public class CalculoDeMediasAritmeticas {
    public static void main(String[] args){
        double media1 = (8 + 9 + 7) / 3;
        double media2 = (4 + 5 + 6) / 3;
        double somaMedia = media1 + media2;
        double mediaDasMedias = somaMedia / 2;

        System.out.printf("Média1 = %.1f%n", media1);
        System.out.printf("Média2 = %.1f%n", media2);
        System.out.printf("Soma das Médias = %.1f%n", somaMedia);
        System.out.printf("Média das Médias: = %.1f%n", mediaDasMedias);
    }

}
