package dev.java10x.CadastroDeNinjas.Missoes;

// LOCALHOST:8080/

import dev.java10x.CadastroDeNinjas.Ninjas.NinjaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("missoes")
public class MissoesController {

    private final MissoesRepository missoesRepository;
    private MissoesService missoesService;

    public MissoesController(MissoesRepository missoesRepository, MissoesRepository missoesRepository1, MissoesService missoesService) {
        this.missoesRepository = missoesRepository;
        this.missoesService = missoesService;
    }

    // Post -- Mandar uma requisão para criar as missoes
    @PostMapping("/criar")
    public MissoesModel criarMissao(@RequestBody MissoesModel missao){
        return missoesService.criarMissao(missao);
    }

    // GET -- Mandar uma requisão para mandar as missoes
    @GetMapping("/listar")
    public List<MissoesModel> listarMissoes(){
        return missoesService.listarMissoes();
    }

    // Get -- Listar as missoes p ID

    @GetMapping("/listar/{id}")
    public MissoesModel listarMissoesPorID(@PathVariable Long id){
        return missoesService.listarMissoesPorID(id);
    }

    // PUT -- Mandar uma requisão para alterar as missoes
    @PutMapping("/alterar")
    public String alterarMissao(){
        return "Missao alterada";
    }

    // DELETE -- Mandar uma requisão para deletar as missoes
    @DeleteMapping("/delete")
    public String deleteMissao(){
        return "Missao deletada";
    }

}
