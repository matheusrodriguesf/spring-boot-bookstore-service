package br.com.arcelino.api.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.arcelino.api.dto.LivroResponse;
import br.com.arcelino.api.entity.Livro;

public interface LivroRepository extends JpaRepository<Livro, Integer> {

    @Query("""
            select new br.com.arcelino.api.dto.LivroResponse(
                livro.id as id,
                livro.titulo as titulo,
                livro.isbn as isbn,
                livro.editora as editora,
                livro.autor as autor,
                livro.ano as ano,
                livro.categoria.nome as categoria)
                from Livro livro
            """)
    Page<LivroResponse> getLivros(Pageable pageable);

}
