public class Funcionario {
    private String nome, cpf, rg, dataContratacao;
    private int matricula, horasTrabalhadas;
    private double salarioBase, salario;
    private static int geraMatricula = 0;

    public Funcionario(String nome, double salarioBase, int horasTrabalhadas){
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.horasTrabalhadas = horasTrabalhadas;
        this.dataContratacao = dataContratacao;
        this.matricula = ++geraMatricula;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(String dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public void calcularSalario(){
        Calculo calculo = new Calculo();
        calculo.calcularSalario(salarioBase, horasTrabalhadas);
        this.salario = Calculo.getTotalSalario();
    }


    public void imprimirDados(){
        System.out.println("Nome: " + nome + "\nCPF: " + cpf + "\nRG: " + rg + "" +
                "\nMatricula: " + matricula + "\nData da contratação: " + dataContratacao + "" +
                "\nSalario base: "+ salarioBase + "\nHoras trabalhadas: "+ horasTrabalhadas
        + "\nSalário: " + salario);
        System.out.println();
    }
}
