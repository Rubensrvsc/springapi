# springapi

## Um exemplo de API de CRUD utilizando o framework Spring

### Neste projeto foi utilizado as seguintes tecnologias

```
Spring Boot
Spring Data JPA
Spring Boot WEB
MySql Connector Java
Spring Boot Validation
```

### Cloning this project

```
git clone https://github.com/Rubensrvsc/springapi.git
```

### Running project

```
mvn spring-boot:run
```



| Method |EndPoint | Descrção |
|---|---|---|
| GET | `http://localhost:8080/pessoa` | Lista todos as Pessoas que estão no banco de dados |
| GET | `http://localhost:8080/pessoa/<int:id>` | Obtem uma pessoa no banco de dados |
| POST | `http://localhost:8080/pessoa` | Cria uma nova pessoa no banco de dados |
| PUT | `http://localhost:8080/pessoa/<int:id>` | Edita um produto pelo id |
| DELETE | `http://localhost:8080/pessoa/<int:id>` | Deleta uma pessoa no banco de dados |

### Descrição dos EndPoints

#### /pessoa [POST]

| Parâmetro | Tipo | 
|---|---|
| `nome_pessoa` | String |

+ Request (application/json)

    + Body

            {
                "nome_pessoa": "Luiz",
            }

+ Response 200 Ok (application/json)

#### /pessoa [GET]

+ Response 200 OK (application/json)

  + Body

        [
        {
          "id": 1,
          "nome": "Maria"
        },
        {
          "id": 2,
          "nome": "Luiz"
        },
        {
          "id": 3,
          "nome": "Francisco"
        },
        {
          "id": 4,
          "nome": "João"
        }
        ]
 #### /pessoa [GET]

+ Response 200 OK (application/json)

  + Body

        {
          "id": 1,
          "nome": "Maria"
        }     
        
 #### /pessoa [PUT]

| Parâmetro | Tipo | 
|---|---|
| `nome_pessoa` | String |

+ Request (application/json)

    + Body

            {
                "nome_pessoa": "Luiz",
            }

+ Response 200 Ok (application/json)

 #### /pessoa/1 [DELETE]


+ Response 200 Ok (application/json)

