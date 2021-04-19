package br.com.fiap.STO.model.dto;

import br.com.fiap.STO.model.entity.CategoriaUsuarioEntity;

import javax.persistence.Column;
import java.util.List;
import java.util.stream.Collectors;

public class CategoriaUsuarioDTO {

    private Long id;
    private String categoriaUsuario;

    public CategoriaUsuarioDTO(CategoriaUsuarioEntity entity) {
        this.id = entity.getId();
        this.categoriaUsuario = entity.getCategoriaUsuario();
    }

    public CategoriaUsuarioDTO() {
    }

    public static List<CategoriaUsuarioDTO> parseToDTO(List<CategoriaUsuarioEntity> entities) {
        return entities.stream().map(CategoriaUsuarioDTO::new).collect(Collectors.toList());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoriaUsuario() {
        return categoriaUsuario;
    }

    public void setCategoriaUsuario(String categoriaUsuario) {
        this.categoriaUsuario = categoriaUsuario;
    }
}
