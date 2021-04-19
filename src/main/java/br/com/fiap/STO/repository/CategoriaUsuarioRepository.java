package br.com.fiap.STO.repository;

import br.com.fiap.STO.model.entity.CategoriaUsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaUsuarioRepository extends JpaRepository<CategoriaUsuarioEntity, Long> {
}
