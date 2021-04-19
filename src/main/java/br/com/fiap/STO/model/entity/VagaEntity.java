package br.com.fiap.STO.model.entity;

import org.hibernate.validator.constraints.CodePointLength;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "TB_VAGA")
public class VagaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_VAGA")
    private Long id;

    @Column(name = "NM_VAGA")
    private String nomeVaga;

    @Column(name = "DS_VAGA")
    private String descricaoVaga;

    @Column(name = "VL_SALARIO")
    private Double valorSalario;

    @Column(name = "DS_LOCAL")
    private String local;

    @ManyToOne
    @JoinColumn(name = "ID_USUARIO")
    private UsuarioEntity usuarioEntity;

    @Column(name = "DT_CRIACAO")
    private LocalDateTime dataCriacao;


    public VagaEntity(Long id, String nomeVaga, String descricaoVaga, Double valorSalario, String local, UsuarioEntity usuarioEntity, LocalDateTime dataCriacao) {
        this.id = id;
        this.nomeVaga = nomeVaga;
        this.descricaoVaga = descricaoVaga;
        this.valorSalario = valorSalario;
        this.local = local;
        this.usuarioEntity = usuarioEntity;
        this.dataCriacao = dataCriacao;
    }

    public VagaEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeVaga() {
        return nomeVaga;
    }

    public void setNomeVaga(String nomeVaga) {
        this.nomeVaga = nomeVaga;
    }

    public String getDescricaoVaga() {
        return descricaoVaga;
    }

    public void setDescricaoVaga(String descricaoVaga) {
        this.descricaoVaga = descricaoVaga;
    }

    public Double getValorSalario() {
        return valorSalario;
    }

    public void setValorSalario(Double valorSalario) {
        this.valorSalario = valorSalario;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public UsuarioEntity getUsuarioEntity() {
        return usuarioEntity;
    }

    public void setUsuarioEntity(UsuarioEntity usuarioEntity) {
        this.usuarioEntity = usuarioEntity;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
}
