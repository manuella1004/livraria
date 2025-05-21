package livro.livraria.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import livro.livraria.domain.Livro;

@Repository
public class LivroRepository {

    private final List<Livro> livros = new ArrayList<>();
    
    public LivroRepository() {
        // Dados iniciais para teste
        livros.add(new Livro(1856, "José de Alencar", "Cinco Minutos", "148997"));
        livros.add(new Livro(1939, "J.R.R. Tolkien", "O Hobbit", "123456"));
        livros.add(new Livro(1997, "J.K. Rowling", "Harry Potter e a Pedra Filosofal", "987654"));
    }

    public List<Livro> buscarTodos() {
        return new ArrayList<>(livros); 
    }
    
    public List<Livro> buscarPorTitulo(String titulo) {
        return livros.stream()
                   .filter(livro -> livro.getTitulo().toLowerCase().contains(titulo.toLowerCase()))
                   .collect(Collectors.toList());
    }
    
    public List<Livro> buscarPorAutor(String autor) {
        return livros.stream()
                   .filter(livro -> livro.getAutor().toLowerCase().contains(autor.toLowerCase()))
                   .collect(Collectors.toList());
    }
    
    public Livro buscarPorIsbn(String isbn) {
        return livros.stream()
                   .filter(livro -> livro.getIsbn().equals(isbn))
                   .findFirst()
                   .orElse(null);
    }
    
    public void adicionar(Livro livro) {
        livros.add(livro);
    }
}
