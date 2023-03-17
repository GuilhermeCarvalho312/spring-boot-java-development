package med.voll.api.medico;

import med.voll.api.endereco.DadosEndereco;

/**
 * Classe de registro que contém os dados de cadastro de um médico.
 * 
 * @param nome          o nome do médico a ser cadastrado.
 * @param email         o endereço de email do médico a ser cadastrado.
 * @param crm           o número do Conselho Regional de Medicina (CRM) do
 *                      médico a ser cadastrado.
 * @param especialidade a especialidade do médico a ser cadastrado.
 * @param endereco      os dados de endereço do médico a ser cadastrado,
 *                      representados por um objeto {@link DadosEndereco}.
 */
public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade,
        DadosEndereco endereco) {

}

// Esse código define uma classe de registro (record) em Java 16+, chamada
// DadosCadastroMedico, que contém os dados de cadastro de um médico. Um
// registro é uma nova estrutura de dados introduzida na linguagem Java, que
// permite definir classes imutáveis e com atributos predefinidos.

// O registro é definido com a palavra-chave record, seguida pelo nome da classe
// e a lista de atributos, onde cada atributo é definido com um tipo e um nome.

// Nesse caso, a classe de registro DadosCadastroMedico contém cinco atributos
// predefinidos: nome, email, crm, especialidade e endereco. Cada atributo é
// definido como uma String, um objeto Especialidade (que é uma enumeração
// definida em outro lugar) e um objeto DadosEndereco (que é uma classe definida
// em outro pacote).

// Como uma classe de registro é imutável por padrão, não há necessidade de
// definir construtores, getters, setters, equals, hashCode e toString, pois
// esses métodos são gerados automaticamente pelo compilador.

// O registro DadosCadastroMedico é útil para representar os dados de cadastro
// de um médico de forma clara e concisa, sem a necessidade de escrever muito
// código. Ele também é fácil de usar em outras partes do código, já que os
// atributos são acessíveis através do nome da classe de registro, seguido de um
// ponto e do nome do atributo. Por exemplo, podemos usar
// dadosCadastroMedico.nome para acessar o nome do médico em outras partes do
// código.
