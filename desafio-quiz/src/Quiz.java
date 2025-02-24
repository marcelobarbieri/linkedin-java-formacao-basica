import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean continua = true;
        int resposta;

        while (continua == true) {
            System.out.println("Múltipla escolha!");
            System.out.println("Qual é a raiz quadrada de 121: 11, 12 ou 13?");
            System.out.println("Resposta: ");

            resposta = scanner.nextInt();

            if (resposta == 11) {
                System.out.println("Resposta correta!");
                continua = false;
            } else {

                if (resposta == 12 || resposta == 13)
                    System.out.println("Resposta incorreta!");
                else
                    System.out.println("Resposta inválida!");

                System.out.println("Deseja tentar novamente?");
                continua = scanner.nextBoolean();

                if (!continua)
                    System.out.println("Resposta correta: 11");
            }
        }
        scanner.close();

        System.out.println("Fim do programa!");
    }
}
