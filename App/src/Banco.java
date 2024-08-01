public class Banco {
    private Correntista c1, c2, c3;

    public Banco(String correntista1, ContaCorrente co1, String correntista2, ContaCorrente co2, String correntista3, ContaCorrente co3) {
        c1 = new Correntista(correntista1);
        c2 = new Correntista(correntista2);
        c3 = new Correntista(correntista3);

        c1.getContaCorrente().executarOperacao(new Credito(co1.getSaldo()));
        c2.getContaCorrente().executarOperacao(new Credito(co2.getSaldo()));
        c3.getContaCorrente().executarOperacao(new Credito(co3.getSaldo()));
    }

    public Correntista getCorrentista(String nome) {
        if (c1.getNome().equals(nome)) {
            return c1;
        }
        if (c2.getNome().equals(nome)) {
            return c2;
        }
        if (c3.getNome().equals(nome)) {
            return c3;
        }
        return null;
    }

    public void debitar(String nomeCorrentista, double valor) {
        Debito d = new Debito(valor);
        Correntista correntista = getCorrentista(nomeCorrentista);
        if (correntista != null) {
            correntista.getContaCorrente().executarOperacao(d);
        } else {
            System.out.println("Não foi possível encontrar o correntista.");
        }
    }

    public void creditar(String nomeCorrentista, double valor) {
        Credito c = new Credito(valor);
        Correntista correntista = getCorrentista(nomeCorrentista);
        if (correntista != null) {
            correntista.getContaCorrente().executarOperacao(c);
        } else {
            System.out.println("Não foi possível encontrar o correntista.");
        }
    }

    public double getSaldo(String nomeCorrentista) {
        Correntista correntista = getCorrentista(nomeCorrentista);
        if (correntista != null) {
            return correntista.getContaCorrente().getSaldo();
        } else {
            System.out.println("Não foi possível encontrar o correntista.");
            return 0.0;
        }
    }

    public void transferir(String nomeCorrentistaOrigem, String nomeCorrentistaDestino, double valor) {
        debitar(nomeCorrentistaOrigem, valor);
        creditar(nomeCorrentistaDestino, valor);
    }
}

