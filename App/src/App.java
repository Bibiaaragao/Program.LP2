public class App {
    public static void main(String[] args) {

        ContaCorrente conta1 = new ContaCorrente();
        ContaCorrente conta2 = new ContaCorrente();
        ContaCorrente conta3 = new ContaCorrente();

        Banco banco = new Banco("Ana", conta1, "Marcos", conta2, "Laura", conta3);

        banco.creditar("Ana", 450.0);
        banco.creditar("Marcos", 120.0);
        banco.creditar("Laura", 849.0);

        System.out.println("Saldo de Ana (após crédito) " + banco.getSaldo("Ana") + "\nSaldo de Marcos (após crédito): " + banco.getSaldo("Marcos") + "\nSaldo de Laura (após crédito): " + banco.getSaldo("laura"));

        banco.debitar("Ana", 320.5);
        banco.debitar("Marcos", 43.0);
        banco.debitar("Laura", 48.0);

        System.out.println("Saldo de Ana (após débito): " + banco.getSaldo("Ana") + "\nSaldo de Marcos (após débito): " + banco.getSaldo("Marcos") + "\nSaldo de Laura: (após débito)" + banco.getSaldo("laura"));

        banco.transferir("Laura", "Ana", 250.0);

        System.out.println("Saldo de Ana (após transferência): " + banco.getSaldo("Ana") + "\nSaldo de Laura (após transferência): " + banco.getSaldo("Laura"));
    }
}