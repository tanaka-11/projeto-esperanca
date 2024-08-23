public class Livro {
    // Atributos
    private String titulo;
    private String autor;
    private int paginas = 0;

    // Métodos SET (Um método setter permite definir ou atualizar o valor de um atributo)
    // Titulo
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Autor
    public void setAutor(String autor) {
        this.autor = autor;
    }

    // Paginas
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    // Métodos GET (Um método getter retorna o valor de um atributo específico. Por exemplo, se tivermos uma classe Livro com um atributo titulo, o método getter para esse atributo seria algo como)
    // Titulo
    public String getTitulo() {
        return this.titulo;
    }

    // Autor
    public String getAutor() {
        return this.autor;
    }   
    
    // Paginas
    public int getPaginas() {
        return this.paginas;
    }

    // Método main - (Primeiro método chamado quando você executa um programa Java. Ele é obrigatório em qualquer classe que deseje ser executada como um programa independente)
    public static void main(String[] args) {
        // Criando uma instância (Objeto) da classe Livro
        Livro livro = new Livro();
        
        // Chamando os métodos setter
        livro.setTitulo("Percy Jackson"); // Atribuindo o título "Percy Jackson"
        livro.setAutor("Rick Riordan"); // Atribuindo o autor "Rick Riordan"
        livro.setPaginas(336); // Definindo o número de páginas como 336
        
        // Exibindo os valores usando os métodos getter
        // Titulo 
        System.out.println("Título: " + livro.getTitulo());

        // Autor 
        System.out.println("Autor: " + livro.getAutor());

        // Paginas 
        System.out.println("Páginas: " + livro.getPaginas());
    }
}
