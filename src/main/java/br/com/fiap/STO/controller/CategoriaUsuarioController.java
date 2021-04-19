package br.com.fiap.STO.controller;

import br.com.fiap.STO.model.dto.CategoriaUsuarioDTO;
import br.com.fiap.STO.model.entity.CategoriaUsuarioEntity;
import br.com.fiap.STO.repository.CategoriaUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaUsuarioController {


    @Autowired
    CategoriaUsuarioRepository repository;

    @GetMapping
    public ResponseEntity<List<CategoriaUsuarioDTO>> listar() {
        List<CategoriaUsuarioEntity> entities = repository.findAll();
        return ResponseEntity.ok(CategoriaUsuarioDTO.parseToDTO(entities));
    }
}
