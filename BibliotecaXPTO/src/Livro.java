public class Livro extends Publicacao {
    private String edicao;
    private String isbn;

    public Livro(String titulo, String autor, int anoPublicacao, String genero, String editora, int quantDisponivel, String edicao, String isbn) {
        super(titulo, autor, anoPublicacao, genero, editora, quantDisponivel);
        this.edicao = edicao;
        this.isbn = isbn;
    }

    public String getEdicao() {
        return edicao;
    }

    public String getIsbn() {
        return isbn;
    }

    public void imprimirDados(){
        System.out.println("Edição: " + edicao + "\nISBN: " + isbn);
    }

}

