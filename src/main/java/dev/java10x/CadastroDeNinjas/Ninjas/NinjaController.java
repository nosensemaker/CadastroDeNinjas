package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

//Annotation para definir que é uma API REST.
@RestController
//Annotation para todas as rotas no mesmo lugar.
@RequestMapping("ninjas")
public class NinjaController {

    private final NinjaRepository ninjaRepository;
    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService, NinjaRepository ninjaRepository){
        this.ninjaService = ninjaService;
        this.ninjaRepository = ninjaRepository;
    }

    @GetMapping("/boasvindas")
    public String boasvindas( ){
        return "Essa é a minha prmeira rota, seja bem vindo.";
    }

    // Adicionar Ninja (CREATE)
    @PostMapping("/criar")
    public NinjaModel criarNinja(@RequestBody NinjaModel ninja){
        return ninjaService.criarNinja(ninja);
    }

    // Mostrar todos os Ninjas (READ)

    @GetMapping("/listar")
    public List<NinjaModel> mostrarTodosOsNinja(){
        return ninjaService.listarNinjas();
    }

    // Mostrar ninja por ID  (READ)

    @GetMapping("/listar/{id}")
    public NinjaModel listarNinjasPorID(@PathVariable Long id){
        return ninjaService.listarNinjasPorID(id);

    }
    // Alterar dados dos Ninjas(UPDATE)

    @PutMapping("/alterar/{id}")
    public NinjaModel alterarNinjaPorID(@PathVariable Long id, @RequestBody NinjaModel ninjaAtualizado){
        return ninjaService.atualizarNinja(id, ninjaAtualizado);
    }

    // Deletar Ninja(DELETE)
    @DeleteMapping("/deletar/{id}")
    public void deletarNinjaPorID(@PathVariable Long id){
       ninjaService.deletarNinjasPorID(id);
    }

}
