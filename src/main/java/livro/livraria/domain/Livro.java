package livro.livraria.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Livro {
    private int ano;
    private String autor;
    private String titulo;
    private String ISBN;

}

