public class Main {
    public static void main(String[] args) {
        String nomeOriginal = "caio";
        saudacao(nomeOriginal);

        int resultado = soma(2, 3);
        System.out.println(resultado);
    }
    
    public static int soma(int a, int b) {
        return a + b;
    }

    public static void saudacao(String nomeParametro) {
        System.out.println("Olá " + nomeParametro);
    }
}