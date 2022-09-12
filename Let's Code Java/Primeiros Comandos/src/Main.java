public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Olá Caio");

        // Variáveis

        String nome;
        nome = "Camila";
        nome = "Tuã";

        // Operadores aritméticos

        int a;
        int b = 2;
        a = 3;
        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        float divisao = (float) a / b;

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);

        // Operadores Lógicos

        boolean resultado = false;
        System.out.println(resultado);

         boolean fimDeSemana = true;
         boolean fazendoSol = true;
         boolean vamosAPraia = fimDeSemana && fazendoSol;
        System.out.println("Vamos a praia?: " + vamosAPraia);

        // Tabela Verdade
        // Operador && (AND)
        // true && true = true
        // true && false = false
        // false && true = false
        // false && false = true

        // Operador || (OR)
        // true || true = true
        // true || falso = true
        // false || true = true
        // false || false = false

        // Operadores Ternários
        // ? (IF)
        // : (ELSE)

        String mensagem = fimDeSemana ? "É fim de Semana." : "Não é fim de semana.";
        System.out.println(mensagem);



    }
}
