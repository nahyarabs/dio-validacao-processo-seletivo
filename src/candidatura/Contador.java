package candidatura;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            // chamar o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException exception) {
            // imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }
        terminal.close();
    }
    
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        // validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;

        // realizar o for para imprimir os números com base na variável contagem
        for (int index = 1; index <= contagem; index++) {
            System.out.println("Contando... " + index);

        }
    }
}

/*
 * System.out.println("Processo Seletivo");
 * analisarCandidato(1900.00);
 * analisarCandidato(2200.00);
 * analisarCandidato(2000.00);
 * }
 * 
 * static void imprimirSelecionados(){
 * String [] candidatos = {"João", "Maria", "Ana", "José"};
 * 
 * 
 * 
 * }
 * 
 * // metodo
 * static void analisarCandidato(double salarioPretendido) {
 * double salarioBase = 2000.0;
 * 
 * if (salarioBase > salarioPretendido) {
 * System.out.println("Ligar para o candidato!");
 * }
 * else if (salarioBase == salarioPretendido) {
 * System.out.println("Ligar para o candidato com contra proposta!");
 * }
 * else {
 * System.out.println("Aguardar resultado dos demais candidatos");
 * }
 * 
 * }
 * 
 * }
 */