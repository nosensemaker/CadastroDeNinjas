package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Annotation para definir que é uma API REST.
@RestController
//Annotation para todas as rotas no mesmo lugar.
@RequestMapping
public class NinjaController {

    @GetMapping("/boasVindas")
    public String boasVindas( ){
        return "Welcome World :D";
    }



}
