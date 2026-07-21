package dev.java10x.CadastroDeNinjas.Missoes;

// LOCALHOST:8080/

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class MissoesController {

    // Post -- Mandar uma requisão para criar as missoes
    @PostMapping("/criar")
    public String adicionarMissao(){
        return "Missão criada";
    }

    // GET -- Mandar uma requisão para mandar as missoes
    @GetMapping("/listar")
    public String listarMissoes(){
        return "Mostrar missoes";

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
