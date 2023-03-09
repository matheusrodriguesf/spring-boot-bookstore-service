package br.com.arcelino.api.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import br.com.arcelino.api.dto.CategoriaResponse;
import br.com.arcelino.api.repository.CategoriaRepository;
import br.com.arcelino.api.util.CategoriaMapper;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CategoriaService {

    private final CategoriaRepository repository;

    private final CategoriaMapper mapper;

    public List<CategoriaResponse> getAllCategoria() {
        return repository.findAll()
                .stream()
                .map(mapper::toResponse)
                .collect(Collectors.toList());
    }

    public CategoriaResponse getCategoriaById(Integer id) {
        var categoria = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Categoria não encontrada"));
        return mapper.toResponse(categoria);
    }
}
