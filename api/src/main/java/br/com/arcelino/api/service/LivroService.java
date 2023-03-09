package br.com.arcelino.api.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.arcelino.api.dto.LivroResponse;
import br.com.arcelino.api.repository.LivroRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LivroService {

    private final LivroRepository repository;

    public Page<LivroResponse> getLivros(Pageable pageable) {
        return repository.getLivros(pageable);
    }

    public LivroResponse getLivroById(Integer id) {
        return repository.getLivros(Pageable.unpaged()).stream()
                .filter(livro -> livro.getId().equals(id))
                .findFirst()
                .orElseThrow();
    }

}
