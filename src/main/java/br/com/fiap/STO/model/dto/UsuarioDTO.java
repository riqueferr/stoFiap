package br.com.fiap.STO.model.dto;

import br.com.fiap.STO.model.entity.CategoriaUsuarioEntity;
import br.com.fiap.STO.model.entity.UsuarioEntity;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.text.CollationElementIterator;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class UsuarioDTO {

    private Long id;
    private String nome;
    private String sobrenome;
    private String usuario;
    private String senha;
    private LocalDateTime dataCriacao = LocalDateTime.now();
    private CategoriaUsuarioEntity categoriaUsuarioEntity;
    private String telefone;
    private String email;

    public UsuarioDTO(UsuarioEntity entity) {
        this.id = entity.getId();
        this.nome = entity.getNome();
        this.sobrenome = entity.getSobrenome();
        this.usuario = entity.getUsuario();
        this.senha = entity.getSenha();
        this.dataCriacao = entity.getDataCriacao();
        this.categoriaUsuarioEntity = entity.getCategoriaUsuarioEntity();
        this.telefone = entity.getTelefone();
        this.email = entity.getEmail();
    }

    public UsuarioDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public CategoriaUsuarioEntity getCategoriaUsuarioEntity() {
        return categoriaUsuarioEntity;
    }

    public void setCategoriaUsuarioEntity(CategoriaUsuarioEntity categoriaUsuarioEntity) {
        this.categoriaUsuarioEntity = categoriaUsuarioEntity;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static List<UsuarioDTO> parseToDTO(List<UsuarioEntity> entities) {
        return entities.stream().map(UsuarioDTO::new).collect(Collectors.toList());
    }
}
