package dev.java10x.CadastroDeNinjas.Missoes;


import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class MissoesService {

    private MissoesRepository missoesRepository;

    public MissoesService(MissoesRepository missoesRepository){
        this.missoesRepository = missoesRepository;
    }

    // Listar todas as missoes
    public List<MissoesModel> listarMissoes(){
        return missoesRepository.findAll();
    }

    // Listar missoes por ID

    public MissoesModel listarMissoesPorID(Long id){
        Optional<MissoesModel> missoesPorID = missoesRepository.findById(id);
        return missoesPorID.orElse(null);
    }


    // Criar uma nova missão

    public MissoesModel criarMissao(MissoesModel missao){
        return missoesRepository.save(missao);
    }


    // Alterar uma missão


    // Deletar uma missão
    public void deletarNinjasPorId(long id){
        missoesRepository.deleteById(id);
    }


}
