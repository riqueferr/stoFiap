package br.com.fiap.STO.repository;

import br.com.fiap.STO.model.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {


    @Query("SELECT COUNT(u.id) " +
            "FROM UsuarioEntity u")
    Long contarUsuariosCriados();


}
