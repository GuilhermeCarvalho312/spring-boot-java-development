package med.voll.api.endereco;

/**
 * Classe que representa os dados de endereço de uma entidade.
 */
public record DadosEndereco(String logradouro, String bairro, String cep, String cidade, String uf, String complemento,
        String numero) {

}

// Esse código é um exemplo de um registro (record) em Java 16+. Um registro é
// uma nova estrutura de dados introduzida na linguagem Java, que permite
// definir classes imutáveis e com atributos predefinidos.

// No caso desse registro DadosEndereco, ele possui sete atributos definidos no
// construtor, que são: logradouro, bairro, cep, cidade, uf, complemento e
// numero.

// O uso do registro nesse exemplo é uma forma concisa e moderna de definir uma
// classe de dados que representa um endereço, sem a necessidade de escrever
// construtores, getters, setters, equals, hashCode e toString.

// O registro é definido com a palavra-chave record, seguida pelo nome da classe
// e a lista de atributos, onde cada atributo é definido com um tipo e um nome.

// O registro DadosEndereco é imutável por padrão, ou seja, não é possível
// alterar seus atributos depois de criado. Além disso, ele também possui
// automaticamente os métodos equals, hashCode e toString gerados pela linguagem
// Java, que facilitam o uso desse registro em outras partes do código.

// Portanto, esse código define um registro em Java 16+ que representa os dados
// de um endereço, com sete atributos predefinidos.
