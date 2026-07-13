package dev.java10x.CadastroDeNinjas.Ninjas;

import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

// Entity transforma uma classe em uma entidade do DB
@Entity
// JPA = Java Persistence API
// Para criar a tabela e dar nome a tabela
@Data // Getters e Setters
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {

    @Id // Logo o atributo que está abaixo dele vai ser o ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Para passar estrategia de como vai ser passado esse ID, as duas annotations são geralmente usadas juntas
    @Column ( name = "id")
    private Long id;

    @Column ( name = "name")
    private String nome;

    @Column(unique = true)
    private String email;

    @Column(name = "image_url")
    private String imageUrl;

    @Column (name = "idade")
    private int idade;

    // Um ninja tem uma unica missão
    @ManyToOne
    @JoinColumn( name = "missoes_id") // Foreing Key ou Chave estrangeira
    private MissoesModel missoes;

}
