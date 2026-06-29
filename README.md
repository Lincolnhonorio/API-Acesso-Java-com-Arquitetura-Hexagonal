# acesso-api 🛡️

O **acesso-api** é uma API RESTful de gerenciamento e controle de acesso para condomínios desenvolvida em **Java 17** com **Spring Boot**, utilizando os conceitos estritos da **Arquitetura Hexagonal (Ports and Adapters)**.

O sistema realiza o mapeamento e relacionamento completo entre usuários do sistema, moradores, visitantes e os respectivos encontros (*meets*) entre eles.

---

## 🏗️ Funcionamento da Arquitetura

A arquitetura garante o isolamento total da lógica de negócio contra frameworks, bibliotecas e infraestrutura externa de banco de dados.

* **Mundo Exterior (Postman):** Envia um JSON para a API.
* **Adaptador de Entrada (UsuarioController):** Recebe o JSON, transforma em um objeto que o sistema entende e empurra para a frente.
* **Porta de Entrada (UsuarioServicePort):** É o encaixe (interface) que recebe esse comando e o direciona para dentro do Core.
* **Core (Centro do Hexágono):** Processa a regra de negócio com total segurança e isolamento.

---

## 🛠️ Tecnologias e Ferramentas

* **Java 17** / **Spring Boot**
* **Spring Web** / **Spring Data JPA**
* **H2 Database** (Memória) / **MySQL Workbench** (Modelagem)
* **Lombok** / **ModelMapper**
* **VS Code IDE**
* **Postman** (Testes de Requisições)

---

## 🚀 Fluxo de Execução Principal (Cadastro)

1. O **Controller** recebe uma requisição HTTP `POST` na rota `/api/usuarios`.
2. O objeto recebido é convertido para o Domínio e enviado para a **Porta de Entrada**.
3. O **Core** processa e aciona a **Porta de Saída** para o banco de dados.
4. O **UsuarioRepositoryAdapter** (Adaptador de Saída) recebe o comando, usa o **ModelMapper** para converter o Domínio em Entidade JPA e salva no banco.
