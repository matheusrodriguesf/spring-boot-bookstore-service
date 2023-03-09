package br.com.arcelino.api.util;

import org.mapstruct.Mapper;

import br.com.arcelino.api.dto.CategoriaResponse;
import br.com.arcelino.api.entity.Categoria;

@Mapper(componentModel = "spring")
public interface CategoriaMapper {

    CategoriaResponse toResponse(Categoria categoria);
}
