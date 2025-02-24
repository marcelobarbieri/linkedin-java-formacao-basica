import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Base: ");
        int base = scanner.nextInt();

        System.out.println("Altura: ");
        int altura = scanner.nextInt();

        scanner.close();
        
        double area = (base * altura) / 2.0;

        System.out.println("Área: "+ area);
    }
}
