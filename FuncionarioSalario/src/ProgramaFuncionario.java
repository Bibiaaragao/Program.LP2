public class ProgramaFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("João", 45,48);
        funcionario1.setRg("87346974");
        funcionario1.setCpf("23764384501");
        funcionario1.setDataContratacao("12/042021");
        funcionario1.calcularSalario();
        funcionario1.imprimirDados();

        Funcionario funcionario2 = new Funcionario("Carla", 56, 28);
        funcionario2.setRg("62375690");
        funcionario2.setCpf("18723549853");
        funcionario2.setDataContratacao("27/08/2021");
        funcionario2.calcularSalario();
        funcionario2.imprimirDados();
    }

    /* A) Ao executar a linha 5, um objeto do tipo Funcionário é criado com nome = "Zé",
    salário base = 25 e horas trabalhadas = 44. Além de que o construtor gera uma matrícul.

    B)São permitidas porque na classe Funcionário os atributos "numRG" e "cpf" são públicos, ou seja,
     possui o modificador de acesso public

    C)A construção é permitida pela classe, pois os atributos "salario" e "matricula" possuem modificador de acesso público.
    Se o modificador de acesso fosse privado, seria necessário o uso do método setter.
     */

}

