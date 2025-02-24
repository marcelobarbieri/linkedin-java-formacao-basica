public class App {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante("João", 2020,60);
        Estudante estudante2 = new Estudante("Maria", 2021,80);

        System.out.println(estudante1.anoFormatura);
        System.out.println(estudante2.anoFormatura);

        estudante1.setAnoFormatura(2026);

        System.out.println(estudante1.anoFormatura);
    }
}
