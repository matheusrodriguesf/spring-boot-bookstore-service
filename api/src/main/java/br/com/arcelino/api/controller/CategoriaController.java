package br.com.arcelino.api.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.arcelino.api.dto.CategoriaResponse;
import br.com.arcelino.api.service.CategoriaService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/categorias")
@RequiredArgsConstructor
public class CategoriaController {
    private final CategoriaService categoriaService;

    @GetMapping
    public ResponseEntity<List<CategoriaResponse>> getAllCategoria() {
        return ResponseEntity.ok(categoriaService.getAllCategoria());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<CategoriaResponse> getCategoriaById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(categoriaService.getCategoriaById(id));
    }
}
