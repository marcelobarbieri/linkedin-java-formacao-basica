public class App {

    public static void main(String[] args)  {
        alarmeHoraDoLanche();

        double media = calcularMedia(10,20,40);
        System.out.println("Média: " + media);
        if (media >= 7.0) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        System.out.println("Potenciação: " + potenciacao(2, 3));
        System.out.println("Potenciação: " + potenciacao(3, 2));
    }

    public static void alarmeHoraDoLanche() {
        System.out.println("Hora do lanche!");
    }

    public static double calcularMedia(double nota1, double nota2, double nota3) {
        double media = (nota1 + nota2 + nota3) / 3;
        return media;
    }

    public static double potenciacao(double base, double expoente)
    {
        return Math.pow(base, base);
    }
}
