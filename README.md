# 🛡️ acesso-api

API REST para gerenciamento de acesso condominial desenvolvida em **Java 17** utilizando **Spring Boot 3** e baseada nos princípios da **Arquitetura Hexagonal (Ports and Adapters)**.

O projeto demonstra uma abordagem moderna para construção de aplicações backend, mantendo as regras de negócio desacopladas da infraestrutura, favorecendo manutenção, escalabilidade e testabilidade.

---

## ✨ Funcionalidades

- Cadastro de usuários
- Cadastro de moradores
- Cadastro de visitantes
- Registro de encontros (Meets)
- Histórico de acessos
- Persistência em banco relacional
- API REST

---

## 🏛 Arquitetura

O projeto utiliza **Arquitetura Hexagonal**, separando responsabilidades em:

```text
Clientes
    │
    ▼
Controllers
    │
    ▼
Input Ports
    │
    ▼
Core
    │
    ▼
Output Ports
    │
    ▼
Repositories
    │
    ▼
Banco de Dados
```

Essa arquitetura permite que o domínio permaneça independente do Spring Boot, do banco de dados e de outras tecnologias externas.

---

## 🛠 Tecnologias

- Java 17
- Spring Boot 3
- Spring MVC
- Spring Data JPA
- Hibernate
- ModelMapper
- Lombok
- Maven
- H2 Database
- MySQL
- Postman

---

## 📂 Estrutura

```text
src
├── core
├── adapters
└── AcessoApiApplication
```

---

## 🚀 Como executar

### Clonar o projeto

```bash
git clone https://github.com/usuario/acesso-api.git
```

### Entrar na pasta

```bash
cd acesso-api
```

### Executar

```bash
mvn spring-boot:run
```

Ou execute diretamente pela IDE utilizando a classe:

```
AcessoApiApplication
```

---

## 📖 Documentação

A documentação técnica completa está disponível em:

```
docs/DOCUMENTATION.md
```

---

## 🎯 Objetivos do Projeto

Este projeto foi desenvolvido com foco em:

- Arquitetura Hexagonal
- Boas práticas de desenvolvimento
- Separação de responsabilidades
- Código limpo
- Escalabilidade
- Facilidade de manutenção

---

## 👨‍💻 Autor

**Lincoln Honorio**

- Desenvolvedor Back-end Java
- Java • Spring Boot • SQL • Arquitetura Hexagonal
