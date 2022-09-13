public class Main {
    public static void main(String[] args) {
        // Média do aluno

        int nota = 70;
        String graduacao;

        if (nota >= 70) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Não aprovado");
        }

        // graduações com: A 80 B 70 C 60 D 0
        if (nota >= 80) {
            graduacao = "A";
        } else if (nota < 80 && nota >= 70) {
            graduacao = "B";
        } else if (nota < 70 && nota >= 60) {
            graduacao = "C";
        } else if (nota < 60 && nota >= 0) {
            graduacao = "D";
        } else {
            graduacao = "";
        }

        switch (graduacao) {
            case "A":
            case "B":
                System.out.println("Aluno Aprovado");
                break;
            case "C":
            case "D":
                System.out.println("Não Aprovado");
                break;
            default:
                System.out.println("Graduação Invalida");

        }
    }
}