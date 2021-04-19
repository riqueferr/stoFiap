package br.com.fiap.STO.controller;


import br.com.fiap.STO.model.dto.UsuarioDTO;
import br.com.fiap.STO.model.entity.UsuarioEntity;
import br.com.fiap.STO.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.stylesheets.LinkStyle;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {


    @Autowired
    UsuarioRepository repository;


    @GetMapping
    public List<UsuarioDTO> listar() {
        List<UsuarioEntity> entities = repository.findAll();
        return UsuarioDTO.parseToDTO(entities);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioDTO> buscarId(@PathVariable("id") Long id) {
        Optional<UsuarioEntity> entity = repository.findById(id);
        if (entity.isPresent()) {
            return ResponseEntity.ok(new UsuarioDTO(entity.get()));
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/contarUsuariosCriados")
    public Long contarUsuariosCriados() {
        Long quantidade = repository.contarUsuariosCriados();
        return quantidade;
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<UsuarioDTO> remover(@PathVariable("id") Long id) {
        Optional<UsuarioEntity> entity = repository.findById(id);
        if (entity.isPresent()) {
            repository.deleteById(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }
}
