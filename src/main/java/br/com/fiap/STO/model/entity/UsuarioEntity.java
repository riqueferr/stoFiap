package br.com.fiap.STO.model.entity;


import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "TB_USUARIO")
public class UsuarioEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_USUARIO")
    private Long id;

    @Column(name = "NM_PRIMEIRO")
    private String nome;

    @Column(name = "NM_SOBRENOME")
    private String sobrenome;

    @Column(name = "NM_USUARIO")
    private String usuario;

    @Column(name = "DS_SENHA")
    private String senha;

    @Column(name = "DT_CRIACAO")
    private LocalDateTime dataCriacao = LocalDateTime.now();

    @ManyToOne
    @JoinColumn(name = "ID_CATEGORIA")
    private CategoriaUsuarioEntity categoriaUsuarioEntity;

    @Column(name = "NR_TELEFONE")
    private String telefone;

    @Column(name = "DS_EMAIL")
    private String email;


    public UsuarioEntity(Long id, String nome, String sobrenome, String usuario, String senha, LocalDateTime dataCriacao, CategoriaUsuarioEntity categoriaUsuarioEntity, String telefone, String email) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.usuario = usuario;
        this.senha = senha;
        this.dataCriacao = dataCriacao;
        this.categoriaUsuarioEntity = categoriaUsuarioEntity;
        this.telefone = telefone;
        this.email = email;
    }

    public UsuarioEntity() {
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
}
