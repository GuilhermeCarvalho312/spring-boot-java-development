package med.voll.api.medico;

/**
 * Enumeração que representa as especialidades médicas disponíveis na aplicação.
 */
public enum Especialidade {
    ORTOPEDIA,
    CARDIOLOGIA,
    GINECOLOGIA,
    DERMATOLOGIA
}

// Essa enumeração Especialidade representa as especialidades médicas
// disponíveis na aplicação. Ela é uma coleção de constantes, onde cada
// constante representa uma especialidade médica específica.

// A enumeração é definida pela palavra-chave enum, seguida pelo nome da
// enumeração e pelos valores que a compõem, que nesse caso são ORTOPEDIA,
// CARDIOLOGIA, GINECOLOGIA e DERMATOLOGIA. Esses valores são separados por
// vírgula e não possuem nenhum valor adicional associado a eles.

// Em Java, uma enumeração é uma classe especial que define um conjunto limitado
// de valores possíveis. Cada valor é uma constante da enumeração, que pode ter
// um ou mais atributos associados a ele, dependendo do que é definido pelo
// programador.

// No caso dessa enumeração, não há nenhum atributo associado a cada
// especialidade médica, pois ela é simples e autoexplicativa. No entanto, em
// outros casos, poderíamos definir atributos adicionais para cada constante da
// enumeração, como valores padrão, descrições ou outras informações relevantes.

// No geral, essa enumeração é uma forma simples e segura de representar um
// conjunto de valores limitados e bem definidos, como as especialidades
// médicas. Ela também é fácil de usar em outras partes do código, já que as
// constantes são acessíveis através do nome da enumeração, seguido de um ponto
// e do nome da constante. Por exemplo, podemos usar Especialidade.ORTOPEDIA
// para acessar a constante de ortopedia em outras partes do código.
