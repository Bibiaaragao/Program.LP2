public class Filme extends Publicacao{
    private String diretor;
    private String atorPrincipal;
    private String sinopse;
    private String tempoDuracao;

    public Filme(String titulo, String autor, int anoPublicacao, String genero, String editora, int quantDisponivel, String diretor, String atorPrincipal, String sinopse, String tempoDuracao) {
        super(titulo, autor, anoPublicacao, genero, editora, quantDisponivel);
        this.diretor = diretor;
        this.atorPrincipal = atorPrincipal;
        this.sinopse = sinopse;
        this.tempoDuracao = tempoDuracao;
    }

    public void imprimirDados(){
        System.out.println("Diretor: " + diretor +
                "\nAtor principal: " + atorPrincipal+ "\nSinopse: "
                + sinopse + "\nTempo de duração: " + tempoDuracao);
    }

}
