import entidades.Trabalhador;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos trabalhadores serao criados: ");
        int quantidadeTrabalhadores = sc.nextInt();

        List<Trabalhador> lista = new ArrayList<Trabalhador>(); // cria a lista vazia para receber os objetos trabalhadores que seram criados

        for (int i = 0; i < quantidadeTrabalhadores; i++) { // usei for para altomatizar a criação dos objetos
            System.out.println("Qual a id do " + i +" trabalhador? ");
            Integer id = sc.nextInt();

            System.out.println("Nome do trabalhador? ");
            String nome = sc.next();

            System.out.println("Qual o salario do trabalhador? ");
            Double salario = sc.nextDouble();

            lista.add(new Trabalhador(id, nome, salario)); // estrutura para criar obejto e ja colocando os paramentros no novo objeto
        }

        //Pesquisa de trabalhador pelo id para fazer o incremento de bonus salarial
        System.out.println("Digite o Id do trabalhador: ");
        Integer idAlvo = sc.nextInt();

        System.out.println("Digite o percentual: ");
        Double percentual = sc.nextDouble();

        Trabalhador t = lista.stream()// percorre a lista procurando o id
                .filter(x -> x.getId()// filter → verifica cada trabalhador e pega o Id
                .equals(idAlvo)) // faz comparação de id solicitado com os de objetos
                .findFirst()// findFirst → pega o primeiro que bater
                .orElse(null); // se nao achar um compativel retorna null

        if (t != null) {
            t.aumentarSalario(percentual);
        }else {
            System.out.println("Nenhum trabalhador foi encontrado.");
        }

        for (Trabalhador trab : lista) {
            System.out.println(trab);
        }
    }
}