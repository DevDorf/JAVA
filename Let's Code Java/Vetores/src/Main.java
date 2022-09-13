import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] letras = new String[5]; //arrays
        letras[0]= "A";
        letras[1]= "B";
        letras[2]= "C";
        letras[3]= "D";
        letras[4]= "E";
        for (int i = 0; i < letras.length; i++) {
            System.out.println(letras[i]);
        }


        int[] numeros = {1, 2, 3, 4, 5};
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        System.out.println(Arrays.toString(letras));

        int[] dados = {9, 10, 12, 25, 2};
        int maior = dados[0];
        int menor = dados[0];
        int media = 0;

        for(int i=0; i < dados.length; i++){
            if (dados[i] > maior) {
                maior = dados[i];
            }
            if (dados[i] < menor) {
                menor = dados[i];
            }
            media += dados[i];
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Media: " + media/dados.length);

    }
}