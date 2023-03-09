package br.com.arcelino.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.arcelino.api.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
