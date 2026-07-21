package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

//Annotation para definir que é uma API REST.
@RestController
//Annotation para todas as rotas no mesmo lugar.
@RequestMapping("ninjas")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService){
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasvindas")
    public String boasvindas( ){
        return "Essa é a minha prmeira rota, seja bem vindo.";
    }

    // Adicionar Ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja(){
        return "Ninja criado";
    }

    // Mostrar todos os Ninjas (READ)

    @GetMapping("/listar")
    public List<NinjaModel> mostrarTodosOsNinja(){
        return ninjaService.listarNinjas();
    }

    // Mostrar ninja por ID  (READ)

    @GetMapping("/listarID")
    public String mostrarTodosOsNinjasPorID(){
        return "Mostrar Ninja por ID";

    }
    // Alterar dados dos Ninjas(UPDATE)

    @PutMapping("/alterarID")
    public String alterarNinjaPorID(){
        return "Alterar Ninja por ID";
    }

    // Deletar Ninja(DELETE)
    @DeleteMapping("/deletarID")
    public String deletarNinjaPorID(){
        return "Ninja deletado por ID";
    }

}
