

# DSList - Lista de jogos

DSList é uma aplicação back-end que lista jogos e permite ao usuário criar, atualizar e excluir jogos. 

## Conceitos

A aplicação é construída com base em conceitos de desenvolvimento web, como arquitetura cliente/servidor, protocolo HTTP, REST, ORM e banco de dados.

## Cliente/servidor, HTTP, JSON

O servidor fornece recursos para o cliente acessar aos jogos. A comunicação é realizada através do protocolo HTTP. 
A resposta das requisições é feita no formato JSON.

## Padrão Rest para API web

A aplicação segue o padrão REST para API web. As requisições HTTP são mapeadas para operações CRUD (create, read, update, delete) e retornam recursos em JSON.

## Estruturação de projeto Spring Rest

A aplicação é estruturada como um projeto Spring Rest. O projeto é dividido em camadas (controller, service, repository) e utiliza o padrão DTO para transferência de dados.

## Entidades e ORM

A comunicação com o banco de dados é feita através do ORM Hibernate.

## Database seeding

O banco de dados é inicializado com dados de teste utilizando o recurso de database seeding do Spring Boot.

## Embedded id

Para implementar o relacionamento N-N é utilizado uma classe de associação com uma chave composta (embedded id).

## Consultas SQL no Spring Data JPA

O Spring Data JPA é utilizado para lidar com a comunicação com o banco de dados.

## Projections

Projeções são utilizadas para selecionar apenas os dados necessários de uma entidade ou DTO. Isso ajuda a reduzir o tráfego de rede
e melhorar o desempenho e principalmente traz uma camada extra de segurança da aplicação.

