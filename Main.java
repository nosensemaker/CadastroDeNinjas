package NivelIntermediario.Desafio;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        ArrayList<Ninja> Ninjas = new ArrayList<>();
        while (continuar){

            System.out.println("==== MENU ====");
            System.out.println("1: Adicionar novo ninja");
            System.out.println("2: Exibir informações de todos os ninjas.");
            System.out.println("3: Atualizar habilidade especial");
            System.out.println("4: Sair.");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    System.out.println("O ninja do clã Uchiha, kazekage ou Hyuga?");
                    String resposta = scanner.nextLine().trim().toLowerCase();
                    switch (resposta) {
                        case "uchiha":

                            Uchiha newUchiha = new Uchiha();
                            System.out.println("Qual o nome do ninja?");
                            newUchiha.nome = scanner.nextLine();
                            System.out.println("Qual a idade do ninja?");
                            newUchiha.idade = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Qual a missão do ninja?");
                            newUchiha.missao = scanner.nextLine();
                            System.out.println("Qual o nível de dificuldade da missão?");
                            newUchiha.nivelDificuldade = scanner.nextLine();
                            System.out.println("Qual é o status da missão do ninja?");
                            newUchiha.statusMissao = scanner.nextLine();
                            System.out.println("Qual é a habilidade especial do ninja?");
                            newUchiha.habilidadeEspecial = scanner.nextLine();

                            Ninjas.add(newUchiha);
                            System.out.println("Ninja adicionado com suceso.");
                            break;
                        case "kazekage":

                            Kazegake newKazegake = new Kazegake();
                            System.out.println("Qual o nome do ninja?");
                            newKazegake.nome = scanner.nextLine();
                            System.out.println("Qual a idade do ninja?");
                            newKazegake.idade = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Qual a missão do ninja?");
                            newKazegake.missao = scanner.nextLine();
                            System.out.println("Qual o nível de dificuldade da missão?");
                            newKazegake.nivelDificuldade = scanner.nextLine();
                            System.out.println("Qual é o status da missão do ninja?");
                            newKazegake.statusMissao = scanner.nextLine();
                            System.out.println("Qual é a habilidade especial do ninja?");
                            newKazegake.habilidadeEspecial = scanner.nextLine();

                            Ninjas.add(newKazegake);
                            System.out.println("Ninja adicionado com suceso.");

                            break;
                        case "hyuga":

                            Hyuga newHyuga = new Hyuga();
                            System.out.println("Qual o nome do ninja?");
                            newHyuga.nome = scanner.nextLine();
                            System.out.println("Qual a idade do ninja?");
                            newHyuga.idade = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Qual a missão do ninja?");
                            newHyuga.missao = scanner.nextLine();
                            System.out.println("Qual o nível de dificuldade da missão?");
                            newHyuga.nivelDificuldade = scanner.nextLine();
                            System.out.println("Qual é o status da missão do ninja?");
                            newHyuga.statusMissao = scanner.nextLine();
                            System.out.println("Qual é a habilidade especial do ninja?");
                            newHyuga.habilidadeEspecial = scanner.nextLine();

                            Ninjas.add(newHyuga);
                            System.out.println("Ninja adicionado com suceso.");

                            break;
                        default:
                            System.out.println("Opção invalida.");

                    }

                    break;

                case 2:
                    if (Ninjas.isEmpty()) {
                        System.out.println("Nenhum ninja foi cadastrado ainda.");
                    } else {
                        System.out.println("==== Ninjas cadastrados ====");
                        for (Ninja n : Ninjas) {
                            n.mostrarInformacoes();
                            System.out.println("----");
                        }
                    }
                    break;
                case 3:
                    if (Ninjas.isEmpty()) {
                        System.out.println("Nenhum ninja cadastrado.");
                        break;
                    }

                    System.out.println("Digite o nome do ninja:");
                    String nomeBusca = scanner.nextLine().trim();

                    boolean encontrou = false;

                    for (Ninja n : Ninjas) {
                        if (n.nome.equalsIgnoreCase(nomeBusca)) {
                            System.out.println("Digite a nova habilidade especial:");
                            String novaHab = scanner.nextLine();

                            if (n instanceof Uchiha) {
                                ((Uchiha) n).habilidadeEspecial = novaHab;
                            } else if (n instanceof Hyuga) {
                                ((Hyuga) n).habilidadeEspecial = novaHab;
                            } else if (n instanceof Kazegake) {
                                ((Kazegake) n).habilidadeEspecial = novaHab;
                            }

                            System.out.println("Habilidade atualizada!");
                            encontrou = true;
                            break;
                        }
                    }

                    if (!encontrou) System.out.println("Ninja não encontrado.");
                    break;

                case 4:
                    System.out.println("Saindo...");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opção invalida");
            }
        }
        scanner.close();
    }
    }
