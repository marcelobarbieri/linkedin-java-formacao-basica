/*
 * Crie um programa que calcule o salário do empregado
 * O programa deve ler:
 * - O número de horas trabalhadas na semana
 * - O preço da hora do empregado
 */

public class CalculadoraSalario {
    public static void main(String[] args) {
        System.out.println("Salário: " + calcularSalario(40, 10.5));
    }

    public static double calcularSalario(int horasTrabalhadas, double precoHora) {
        return horasTrabalhadas * precoHora;
    }
}
