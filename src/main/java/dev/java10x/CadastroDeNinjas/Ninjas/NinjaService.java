package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.events.Event;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository){
        this.ninjaRepository = ninjaRepository;
    }

    // Listar todos os meus ninjas = findALL equivalente ao Listar
    public List<NinjaModel> listarNinjas(){
        return ninjaRepository.findAll();
    }

    // Listar todos os meus ninjas por ID

    public NinjaModel listarNinjasPorID(Long id){
        Optional<NinjaModel> ninjaPorID = ninjaRepository.findById(id);
        return ninjaPorID.orElse(null);
    }

    // Criar um novo ninja
    // Save tem a mesma função do insert direto no banco de dados
    public NinjaModel criarNinja(NinjaModel ninja){
        return ninjaRepository.save(ninja);

    }

    // Atualizar ninja

    public NinjaModel atualizarNinja(Long id, NinjaModel ninjaAtualizado){
        if (ninjaRepository.existsById(id)) {
            ninjaAtualizado.setId(id);
            return ninjaRepository.save(ninjaAtualizado);
        }
        return null;
        }

    // Deletar um ninja - Tem que ser um metodo VOID
    public void deletarNinjasPorID(Long id){
        ninjaRepository.deleteById(id);
    }










}
