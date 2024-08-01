public class Calculo {
    private static double totalSalario;

    public void calcularSalario(double salarioBase, int horasTrabalhadas){
        this.totalSalario = salarioBase * horasTrabalhadas;
    }

    public static double getTotalSalario() {
        return totalSalario;
    }
}
