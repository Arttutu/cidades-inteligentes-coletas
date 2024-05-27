package br.com.fiap.controller;
import br.com.fiap.model.Coleta;
import br.com.fiap.service.ColetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;
import br.com.fiap.exception.ResourceNotFoundException;



@RestController
@RequestMapping("/api/coletas")
public class ColetaController {

    @Autowired
    private ColetaService coletaService;

    @GetMapping
    public List<Coleta> getAllColetas() {
        return coletaService.getAllColetas();
    }

    @PostMapping
    public Coleta createColeta(@Valid @RequestBody Coleta coleta) {
        return coletaService.createColeta(coleta);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Coleta> getColetaById(@PathVariable(value = "id") Long coletaId) {
        Coleta coleta = coletaService.getColetaById(coletaId)
                .orElseThrow(() -> new ResourceNotFoundException("Coleta not found"));
        return ResponseEntity.ok().body(coleta);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Coleta> updateColeta(@PathVariable(value = "id") Long coletaId,
                                               @Valid @RequestBody Coleta coletaDetails) {
        Coleta updatedColeta = coletaService.updateColeta(coletaId, coletaDetails);
        return ResponseEntity.ok(updatedColeta);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteColeta(@PathVariable(value = "id") Long coletaId) {
        coletaService.deleteColeta(coletaId);
        return ResponseEntity.noContent().build();
    }
}

