package br.com.fiap.STO.model.dto;

import br.com.fiap.STO.model.entity.UsuarioEntity;
import br.com.fiap.STO.model.entity.VagaEntity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class VagaDTO {

    private Long id;
    private String nomeVaga;
    private String descricaoVaga;
    private Double valorSalario;
    private String local;
    private UsuarioEntity usuarioEntity;
    private LocalDateTime dataCriacao;

    public VagaDTO(VagaEntity entity) {
        this.id = entity.getId();
        this.nomeVaga = entity.getNomeVaga();
        this.descricaoVaga = entity.getDescricaoVaga();
        this.valorSalario = entity.getValorSalario();
        this.local = entity.getLocal();
        this.usuarioEntity = entity.getUsuarioEntity();
        this.dataCriacao = entity.getDataCriacao();
    }

    public VagaDTO() {
    }

    public static List<VagaDTO> parseToDTO(List<VagaEntity> entities) {
        return entities.stream().map(VagaDTO::new).collect(Collectors.toList());
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
