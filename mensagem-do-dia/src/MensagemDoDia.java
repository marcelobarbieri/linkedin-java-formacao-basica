import java.util.Scanner;

public class MensagemDoDia {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 10: ");
        int numero = scanner.nextInt();
        scanner.close();

        String mensagem;

        if (numero >= 1 && numero <= 5) {
            mensagem = "Quem avisa amigo é";
        } else if (numero > 5 && numero <= 10) {
            mensagem = "Você é o que você come";
        } else {
            mensagem = "Número inválido";
        }

        System.out.println(mensagem);
    }
}
