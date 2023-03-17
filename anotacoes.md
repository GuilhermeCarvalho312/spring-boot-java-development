# Sobre o SpringBoot:

Spring Boot é um framework open source em Java para o desenvolvimento de aplicações web e microsserviços. Ele foi desenvolvido com o objetivo de tornar a criação de aplicativos mais rápida e fácil, eliminando a necessidade de configurações manuais e proporcionando um ambiente de desenvolvimento mais produtivo.

O Spring Boot é baseado no framework Spring e utiliza sua infraestrutura para simplificar o processo de configuração e inicialização de aplicativos. Ele vem com uma série de recursos integrados, como um servidor web incorporado, configuração automática de dependências e outras ferramentas úteis para facilitar o desenvolvimento.

Com o Spring Boot, os desenvolvedores podem criar aplicativos em Java com maior rapidez, facilidade e produtividade, permitindo que se concentrem mais na lógica de negócios da aplicação do que na configuração e infraestrutura. Além disso, o Spring Boot é altamente escalável e flexível, tornando-o uma escolha popular para projetos de todos os tamanhos.

# Anotações Aula 1 - Criação do projeto:

- Para criar o projeto foi utilizado o SpringInitialiazr: https://start.spring.io/

## O que foi feito na Aula - 1:

1. Criar um projeto Spring Boot utilizando o site do Spring Initializr;
2. Importar o projeto no IntelliJ e executar uma aplicação Spring Boot pela classe contendo o método main;
3. Criar uma classe Controller e mapear uma URL nela utilizando as anotações @RestController e @RequestMapping;
4. Realizar uma requisição de teste no browser acessando a URL mapeada no Controller.

# Anotações Aula 1 - Requisições POST:

- link trello: https://trello.com/b/4yiaNIBk/api-voll-med-alura
- Link Figma: https://www.figma.com/file/N4CgpJqsg7gjbKuDmra3EV/Voll.med?node-id=2-1007

Para receber o parâmetro de uma requisição é necessário colocar o @RequestBody

## Padrão DTO:

DTO é a sigla para Data Transfer Object, ou Objeto de Transferência de Dados em português. É um padrão de projeto de software que tem como objetivo transferir dados entre diferentes camadas da aplicação ou entre diferentes aplicações.

O padrão DTO é geralmente usado em sistemas distribuídos, onde as camadas ou aplicações estão fisicamente separadas. Ele ajuda a minimizar a quantidade de dados transferidos, tornando a comunicação mais eficiente e melhorando o desempenho da aplicação.

O DTO é basicamente uma classe que contém um conjunto de atributos que representam os dados que precisam ser transferidos. Geralmente, os atributos do DTO são públicos e não possuem lógica de negócios.

Um exemplo de uso do padrão DTO seria em uma aplicação web que precisa exibir informações de um usuário em uma página HTML. Nesse caso, um objeto DTO seria criado contendo apenas os dados necessários para exibir na página, como nome, sobrenome, idade e endereço. Esse objeto seria então enviado para a camada de apresentação, que usaria os dados para exibir as informações na página.

Em resumo, o padrão DTO é usado para transferir dados entre diferentes camadas ou aplicações de uma forma eficiente e organizada. Ele ajuda a minimizar a quantidade de dados transferidos e a melhorar o desempenho da aplicação. É uma boa prática de programação que pode ser usada em vários tipos de projetos de software.

## O que foi feito na Aula - 2:

1. Mapear requisições POST em uma classe Controller;
2. Enviar requisições POST para a API utilizando o Insomnia;
3. Enviar dados para API no formato JSON;
4. Utilizar a anotação @RequestBody para receber os dados do corpo da requisição em um parâmetro no Controller;
5. Utilizar o padrão DTO (Data Transfer Object), via Java Records, para representar os dados recebidos em uma requisição POST.
