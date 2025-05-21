package livro.livraria.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import livro.livraria.domain.Livro;
import livro.livraria.repository.LivroRepository;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/livros")
public class LivroController {

    private LivroRepository repository;

    public LivroController(LivroRepository repository){
        this.repository= repository;
    }

    @GetMapping
    public List<Livro> getLivros(@RequestParam (required = false) String titulo, @RequestParam (required = false) String autor) {
        return repository.buscar();
    }

    @GetMapping("/{isbn}")
    public Livro getLivroByIsbn(@PathVariable("isbn") String isbn) {
        return new Livro(1,"ads","asd","asd");
    }
    
}
