# Sistema de Cadastro de Estudantes

## Descrição

API REST simples desenvolvida com **Spring Boot** para simular um sistema de cadastro de estudantes.
A aplicação permite consultar informações do sistema, listar cursos disponíveis e buscar informações de estudantes através de endpoints HTTP.

O projeto foi desenvolvido como atividade prática utilizando **Spring Web, Spring Data JPA, H2 Database e Thymeleaf**.

---

# Tecnologias Utilizadas

* Java
* Spring Boot
* Spring Web
* Spring Data JPA
* H2 Database
* Thymeleaf
* Maven

---

# Como executar o projeto

1. Clonar ou baixar o projeto

```
git clone <url-do-repositorio>
```

2. Abrir o projeto em uma IDE (IntelliJ, Eclipse ou VS Code)

3. Executar a classe principal:

```
SistemaEstudantesApplication.java
```

4. A aplicação será iniciada em:

```
http://localhost:8080
```

---

# Endpoints Disponíveis

## 1. Informações do Sistema

**Endpoint**

```
GET /api/sistema/info
```

**Descrição**

Retorna informações gerais do sistema.

**Exemplo**

```
http://localhost:8080/api/sistema/info
```

**Resposta exemplo**

```
{
  "nome": "Sistema de Cadastro de Estudantes",
  "versao": "1.0",
  "dataHora": "2026-03-05T20:30:00",
  "status": "operacional"
}
```

---

# 2. Listar Cursos

**Endpoint**

```
GET /api/cursos
```

**Descrição**

Retorna a lista de cursos disponíveis.

**Exemplo**

```
http://localhost:8080/api/cursos
```

**Resposta exemplo**

```
[
  {
    "id": 1,
    "nome": "Engenharia de Software"
  },
  {
    "id": 2,
    "nome": "Ciência da Computação"
  },
  {
    "id": 3,
    "nome": "Sistemas de Informação"
  },
  {
    "id": 4,
    "nome": "Análise e Desenvolvimento de Sistemas"
  },
  {
    "id": 5,
    "nome": "Engenharia da Computação"
  }
]
```

---

# 3. Buscar Curso por ID

**Endpoint**

```
GET /api/cursos/{id}
```

**Descrição**

Retorna o nome do curso correspondente ao ID informado.

**Exemplo**

```
http://localhost:8080/api/cursos/1
```

**Resposta exemplo**

```
Engenharia de Software
```

---

# 4. Buscar Estudante por Matrícula

**Endpoint**

```
GET /api/estudantes/{matricula}
```

**Descrição**

Retorna as informações de um estudante específico.

**Exemplo**

```
http://localhost:8080/api/estudantes/2024001
```

**Resposta exemplo**

```
{
  "matricula": "2024001",
  "nome": "João Silva",
  "curso": "Engenharia de Software",
  "semestre": 3
}
```

---

# 5. Buscar Estudantes por Curso

**Endpoint**

```
GET /api/estudantes?curso=Engenharia de Software
```

**Descrição**

Retorna todos os estudantes matriculados em um determinado curso.

**Exemplo**

```
http://localhost:8080/api/estudantes?curso=Engenharia%20de%20Software
```

---

# Autor

Nome: **João Francisco Marca**

Matrícula: **20246884**
