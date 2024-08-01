public class Credito extends Operacao {
    public Credito(double valor) {
        super(valor);
    }

    public double operar() {
        return valor;
    }
}