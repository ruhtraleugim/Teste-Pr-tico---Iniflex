# Projeto de Gestão de Funcionários

Este projeto é uma aplicação em Java realizada como forma de desafio tecnico de nivel de entrada, resolvi por optar usar mais expreções lambda as quais, 
sempre tive umas certa dificuldade, para realizar o desafio.

mesmo que tenham sido relativamente facil , levaram cerca de 2.5 horas .

## Funcionalidades

A aplicação realiza as seguintes ações com os dados dos funcionários:

1. **Inserir Funcionários**: Adiciona uma lista de funcionários com informações como nome, data de nascimento, salário e função.Como não tinha um banco de dados simulei um em memoria
2. **Remover Funcionário**: Remove o funcionário "João" da lista de funcionários. nada a comentar , mas tadinho do joão 
3. **Exibir Funcionários**: Exibe todos os funcionários com suas informações no formato correto. O famoso get basico 
4. **Aumento de Salário**: Aplica um aumento de 10% no salário de todos os funcionários.
5. **Agrupar Funcionários por Função**: Agrupa os funcionários por sua função, armazenando esses grupos em um mapa. Isso foi meio chatinho pq tive que refazer a logica umas 3 vezes pra funcionar.
6. **Exibir Funcionários Agrupados**: Exibe os funcionários agrupados por função.
7. **Aniversários de Funcionários**: Exibe os funcionários que fazem aniversário nos dias 10 e 12. PS: O joão fazia dia 12 , tadinho do joão
8. **Funcionário Mais Velho**: Exibe o nome e idade do funcionário mais velho.
9. **Ordenar Funcionários por Nome**: Exibe a lista de funcionários ordenada alfabeticamente por nome.
10. **Total de Salários**: Exibe o total de todos os salários dos funcionários.
11. **Salários Mínimos**: Exibe quantos salários mínimos (R$ 1212,00) cada funcionário ganha.

## Estrutura do Projeto
1. **Domain** : Representa a abstração de uma enatidade
   
   - Pessoa
   - Funcionario

3. **Persistence** : é o banco de dados em memoria

   - Funcionarios

5. **useCases** : São as regras de negocios, geralemte são separadas em varias por entidade mas resolvi fazer assim pq era só uma entidade

   - FuncionarioUsecase

### Classes:

1. **Pessoa**: Classe base que contém os atributos `nome` (String) e `dataNascimento` (LocalDate).
2. **Funcionario**: Classe que estende a classe `Pessoa` e contém os atributos `salario` (BigDecimal) e `funcao` (String).
3. **Principal**: Classe que executa as operações solicitadas como inserção de funcionários, aumento de salários, agrupamento, entre outras.

### Exemplos de Funcionários:

- **Maria**: Operador, salário de R$ 2.458,15, nascimento em 18/10/2000
- **Arthur**: Contador, salário de R$ 4.479,02, nascimento em 31/03/1983
- **Caio**: Coordenador, salário de R$ 10.819,75, nascimento em 02/05/1961
- **Miguel**: Diretor, salário de R$ 21.031,87, nascimento em 14/10/1988
- E outros...

## Como Usar

1. Clone o repositório para sua máquina local:

   ```bash
   git clone https://github.com/seu-usuario/projeto-gestao-funcionarios.git
