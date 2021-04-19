package br.com.fiap.STO.controller;

import br.com.fiap.STO.model.dto.VagaDTO;
import br.com.fiap.STO.model.entity.VagaEntity;
import br.com.fiap.STO.repository.VagaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/vagas")
public class VagaController {

    @Autowired
    VagaRepository repository;

    //http://localhost:8080/sto/vagas
    @GetMapping
    public ResponseEntity<List<VagaDTO>> listar() {
        List<VagaEntity> entities = repository.findAll();
        return ResponseEntity.ok(VagaDTO.parseToDTO(entities));
    }

    //http://localhost:8080/sto/vagas/1
    @GetMapping("/{id}")
    public ResponseEntity<VagaDTO> buscarPorId(@PathVariable("id") Long id) {
        Optional<VagaEntity> entity = repository.findById(id);
        if (entity.isPresent()){
            return ResponseEntity.ok(new VagaDTO(entity.get()));
        }
        return ResponseEntity.notFound().build();
    }


    //http://localhost:8080/sto/vagas/4
    @DeleteMapping("/{id}")
    public ResponseEntity<VagaDTO> remover(@PathVariable("id") Long id) {
        Optional<VagaEntity> entity = repository.findById(id);
        if(entity.isPresent()) {
            repository.deleteById(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }
}
