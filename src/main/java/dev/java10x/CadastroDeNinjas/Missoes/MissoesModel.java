package dev.java10x.CadastroDeNinjas.Missoes;
import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table( name = "tb_missoes")
public class MissoesModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String descricao;
    private char rank;


    // Uma missão pode ter vários ninjas

    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;

    public MissoesModel(){}

    public MissoesModel(String name, String descricao, char rank, NinjaModel ninja){
        this.name = name;
        this.descricao = descricao;
        this.rank = rank;
    }

    public String getName(){
        return name;
    }

    public String getDescricao(){
        return descricao;
    }

    public char getRank(){
        return rank;
    }

    public void setName(){
        this.name = name;
    }

    public void setDescricao(){
        this.descricao = descricao;
    }

    public void setRank(){
        this.rank = rank;
    }
}
