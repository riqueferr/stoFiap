package br.com.fiap.STO.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "TB_CAT_USUARIO")
public class CategoriaUsuarioEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CATEGORIA")
    private Long id;

    @Column(name = "DS_CATEGORIA")
    private String categoriaUsuario;

    public CategoriaUsuarioEntity(Long id, String categoriaUsuario) {
        this.id = id;
        this.categoriaUsuario = categoriaUsuario;
    }

    public CategoriaUsuarioEntity() {
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
