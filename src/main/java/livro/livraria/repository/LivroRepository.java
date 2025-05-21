package livro.livraria.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import livro.livraria.domain.Livro;
@Repository
public class LivroRepository {

    private List<Livro> livros = new ArrayList<>();
    
    public LivroRepository(){
        Livro livro1 = new Livro(1856, "José de Alencar", "Cinco Minutos", "148997");
        livros.add(livro1);
    }

    public List<Livro> buscar(){
        return livros;
    }
}

