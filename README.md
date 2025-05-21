# Projeto Integrador - Concessionária de Veículos (Teste) - Programa Jovem Programador SENAC SC

Este é um READ.me preliminar para o projeto integrador de teste sobre uma concessionária de veículos. Este projeto ainda está em desenvolvimento e não representa a versão final.

## Visão Geral

Este projeto tem como objetivo simular um sistema básico para uma concessionária de veículos. A ideia principal é praticar os conhecimentos adquiridos em programação Java, utilizando a interface gráfica Swing e a conexão com o banco de dados PostgreSQL via JDBC. As funcionalidades principais incluem:

* Gerenciamento de clientes.
* Cadastro e gerenciamento de veículos (modelos, marcas, anos, preços, equipamentos, etc.).
* Registro de vendas de veículos.
* Gerenciamento de equipamentos disponíveis para os veículos.

Este projeto é um teste e serve como um exercício prático para consolidar conceitos de programação em Java, interação com banco de dados e desenvolvimento de interfaces gráficas.

## Tecnologias Utilizadas

* **Linguagem de Programação:** Java
* **Interface Gráfica:** Java Swing (JFrame)
* **Banco de Dados:** PostgreSQL
* **Conexão com Banco de Dados:** JDBC (Java Database Connectivity)

## Estrutura do Projeto

O projeto será estruturado em classes que representam as entidades do sistema:

* **`Cliente`:** Representa os clientes da concessionária (nome, CPF, endereço, etc.).
* **`Veiculo`:** Representa os veículos disponíveis para venda (modelo, marca, ano, preço, etc.).
* **`Venda`:** Representa as vendas realizadas (cliente, veículo, data, valor total, etc.).
* **`Equipamento`:** Representa os equipamentos que podem ser associados aos veículos (descrição, código, etc.).

A interação com o banco de dados PostgreSQL será feita através de classes específicas (DAOs - Data Access Objects) utilizando a biblioteca JDBC. A interface gráfica Swing fornecerá as telas para interação do usuário com o sistema.

## Funcionalidades Atuais (Em Desenvolvimento)

No momento, as seguintes funcionalidades estão sendo desenvolvidas ou planejadas:

* [x] Criação das classes `Cliente`, `Veiculo`, `Venda` e `Equipamento` com seus respectivos atributos.
* [x] Implementação da conexão com o banco de dados PostgreSQL via JDBC.
* [/] Desenvolvimento de interfaces Swing para:
    * [/] Cadastro de clientes.
    * [ ] Cadastro de veículos.
    * [ ] Cadastro de equipamentos.
    * [ ] Listagem de clientes.
    * [ ] Listagem de veículos.
    * [ ] Listagem de equipamentos.
* [ ] Implementação das operações básicas de CRUD (Create, Read, Update, Delete) para as entidades.
* [ ] Desenvolvimento da funcionalidade de registro de vendas, associando clientes e veículos.

**Legenda:**

* [ ] A fazer
* [x] Concluído
* [/] Em desenvolvimento

## Próximos Passos

Os próximos passos para este projeto incluem:

* Implementar a persistência dos dados no banco de dados PostgreSQL utilizando JDBC.
* Desenvolver as interfaces Swing para todas as funcionalidades planejadas.
* Implementar a lógica de negócios para o registro de vendas.
* Estabelecer o relacionamento entre veículos e equipamentos.
* Testar e refinar a interface e a lógica do sistema.

## Como Contribuir (Neste Estágio Inicial, Não Aplicável)

Como este é um projeto integrador de teste e não a versão final, contribuições externas não são esperadas neste momento. O foco principal é o aprendizado e a prática individual/em grupo (dependendo da natureza do projeto integrador).

## Notas

Este READ.me será atualizado conforme o projeto evolui. As decisões sobre funcionalidades e a implementação podem mudar.