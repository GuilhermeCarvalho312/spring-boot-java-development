package med.voll.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import med.voll.api.medico.DadosCadastroMedico;

@RestController
@RequestMapping("medicos")
public class MedicoController {

    /**
     * Cadastra um novo médico com base nos dados recebidos no corpo da solicitação
     * HTTP POST.
     * 
     * @param jsonData um objeto {@link DadosCadastroMedico} contendo as informações
     *                 do médico a ser cadastrado.
     * @throws AlgumaExcecao caso ocorra algum erro durante o processamento do
     *                       cadastro.
     */
    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroMedico jsonData) {
        System.out.println(jsonData);
    }
}

// Esse código é um exemplo de um controlador (controller) em Spring Boot, que é
// uma classe responsável por gerenciar as solicitações HTTP recebidas pela
// aplicação.

// O controlador é definido pela anotação @RestController e mapeado para o
// caminho /medicos usando a anotação @RequestMapping. Quando um usuário faz uma
// solicitação POST para esse caminho, a função cadastrar é acionada.

// A anotação @RequestBody indica que o corpo da solicitação HTTP deve ser
// interpretado como um objeto DadosCadastroMedico, que é uma classe que contém
// os dados de cadastro de um médico. Essa classe provavelmente tem campos como
// nome, especialidade, CRM, etc.

// Dentro da função cadastrar, o objeto jsonData contém as informações do médico
// recebidas no corpo da solicitação. Nesse exemplo, a função simplesmente
// imprime esses dados no console usando System.out.println(jsonData).

// No geral, esse código define um controlador que pode receber dados de
// cadastro de médicos enviados via solicitação HTTP POST, e imprimir esses
// dados no console para fins de depuração.
