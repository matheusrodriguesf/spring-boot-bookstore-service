package br.com.arcelino.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoriaResponse {
    private Integer id;
    private String nome;
    private String descricao;
}
