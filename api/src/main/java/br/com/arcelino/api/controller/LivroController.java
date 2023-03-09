package br.com.arcelino.api.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.arcelino.api.dto.LivroResponse;
import br.com.arcelino.api.service.LivroService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/livros")
@RequiredArgsConstructor
public class LivroController {

    private final LivroService livroService;

    @GetMapping
    public Page<LivroResponse> getLivros(Pageable pageable) {
        return livroService.getLivros(pageable);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<LivroResponse> getLivro(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(livroService.getLivroById(id));
    }
}
