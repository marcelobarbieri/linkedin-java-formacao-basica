import java.util.Scanner;

public class RepeticaoMusica {
    public static void main(String[] args) {
        boolean repeat = true;
        Scanner scanner = new Scanner(System.in);
        while(repeat == true) {
            System.out.println("Tocar a música");
            System.out.println("Repetir música? (true/false)");
            repeat = scanner.nextBoolean();
        }
        scanner.close();
    }
}
