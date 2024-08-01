public class Debito extends Operacao {
    public Debito(double valor) {
        super(valor);
    }

    public double operar() {
        return -valor;
    }
}