# Estudo de Padroes de Projetos

API criada para curso de JAVA Developer

## Resources used
- Java
- Lombok
- JPA
- Maven
- Spring openfeign


## Cadastrar cliente

``` localhost:8070/cliente ```

Exemplo

```
{
    "nome": "string",
    "endereco" :{
      "cep": "string"
    }
}
```

## Listar Clientes

``` localhost:8070/clientes ```

Exemplo de Retorno

```
[
    {
        "id": Long,
        "nome": "String",
        "endereco": {
            "cep": "String",
            "logradouro": "String",
            "complemento": "String",
            "bairro": "String",
            "localidade": "String",
            "uf": "String",
            "ibge": "String",
            "gia": "String",
            "ddd": "String",
            "siafi": "String"
        }
    }
]
```

## Listar clientes por id

```localhost:8070/cliente/id```

Exemplo de Retorno

```
[
    {
        "id": Long,
        "nome": "String",
        "endereco": {
            "cep": "String",
            "logradouro": "String",
            "complemento": "String",
            "bairro": "String",
            "localidade": "String",
            "uf": "String",
            "ibge": "String",
            "gia": "String",
            "ddd": "String",
            "siafi": "String"
        }
    }
]
```

## Atualizar Cliente

 ```localhost:8070/clientes/id ```

Exemplo

```
{
    "id": Long
    "nome": "string",
    "endereco" :{
      "cep": "string"
    }
}
```

## Deletar cliente por id

```localhost:8070/cliente/id```

## H2 Data Base
``` http://localhost:8070/h2 ```

## Api Externa
Busca de endereço em: <https://viacep.com.br/>
