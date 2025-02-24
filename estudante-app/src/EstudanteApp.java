import java.util.Scanner;

public class EstudanteApp {
    public static void main(String[] args) {
        int idade = 18;
        char inicialDoNome = 'M';
        char inicialDoSobrenome = 'B';
        double media = 10.0;
        boolean aprovado = true;
        String nome = "Marcelo";
        String sobrenome = "Barbieri";

        System.out.println("Idade: " + idade);
        System.out.printf("Iniciais: %c %c%n", inicialDoNome, inicialDoSobrenome);
        System.out.println("Média: " + media);
        System.out.println("Aprovado: " + aprovado);
        System.out.println("Nome: " + nome + " " + sobrenome);
        System.out.println(inicialDoNome + " " + inicialDoSobrenome);

        System.out.println(
            idade + ", "
            + inicialDoNome + ", "
            + inicialDoSobrenome + ", "
            + media + ", "
            + aprovado + ", "
            + nome + ", "
            + sobrenome
        );

        System.out.println(nome.charAt(0));
        System.out.println(nome.charAt(1));
        System.out.println(nome.length());
        System.out.println(nome.charAt(nome.length() - 1));
        System.out.println(nome.equals(sobrenome));

        Scanner scanner = new Scanner(System.in);
        media = scanner.nextDouble();
        scanner.close();
        System.out.println(media);
    }
}
