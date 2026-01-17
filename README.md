# 🥷 Ninja Manager (Java) — Desafio OOP

Projeto em **Java** (nível intermediário) para praticar **Orientação a Objetos**, **herança**, **polimorfismo**, uso de **ArrayList** e interação com o usuário através de um **menu no terminal**.

O sistema permite cadastrar ninjas de diferentes clãs, listar todos os ninjas cadastrados e atualizar a habilidade especial de um ninja pelo nome.

---

## Funcionalidades

- Menu interativo no terminal
- Cadastrar novos ninjas de diferentes clãs:
  - **Uchiha**
  - **Kazekage**
  - **Hyuga**
- Listar todos os ninjas cadastrados com suas informações
- Atualizar a **habilidade especial** de um ninja através do **nome**
- Uso de herança e sobrescrita de métodos

---

## Conceitos praticados

- **Classes e Objetos**
- **Herança (`extends`)**
- **Sobrescrita (`@Override`)**
- **Polimorfismo**
- **Casting + `instanceof`**
- **Coleções (`ArrayList`)**
- **Entrada de dados (`Scanner`)**

---

## Estrutura do Projeto

```txt
NivelIntermediario/
 └── Desafio/
     ├── Main.java
     ├── Ninja.java
     ├── Uchiha.java
     ├── Hyuga.java
     └── Kazegake.java
```

> O package utilizado é: `NivelIntermediario.Desafio`

---

##  Como executar

### Opção 1: Pela IDE (IntelliJ / Eclipse)
1. Abra o projeto na IDE
2. Rode a classe `Main.java`

### Opção 2: Pelo terminal (javac/java)
No diretório onde está a pasta `NivelIntermediario`, rode:

```bash
javac NivelIntermediario/Desafio/*.java
java NivelIntermediario.Desafio.Main
```

---

## 🧾 Como usar (Menu)

Ao iniciar o programa, o menu será exibido com as seguintes opções:

- **1**: Adicionar novo ninja
- **2**: Exibir informações de todos os ninjas
- **3**: Atualizar habilidade especial
- **4**: Sair

---

## Exemplo de uso

### Cadastro de Ninja
1. Selecione `1`
2. Digite o clã: `uchiha`, `kazekage` ou `hyuga`
3. Informe:
   - nome
   - idade
   - missão
   - nível de dificuldade
   - status da missão
   - habilidade especial

### Atualizar habilidade especial
1. Selecione `3`
2. Digite o **nome do ninja**
3. Digite a **nova habilidade especial**
4. O sistema irá localizar e atualizar 

---

## Melhorias futuras (ideias)

- Validar entradas (ex.: evitar letras quando pede número)
- Criar um ID para cada ninja (pra evitar nomes repetidos)
- Buscar ninja por clã
- Salvar ninjas em arquivo (para não perder os dados ao fechar)
- Encapsular atributos (`private` + getters/setters)


