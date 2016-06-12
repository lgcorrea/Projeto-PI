/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PI;

import static PI.Layout.layout;
import static PI.Vagas.formatador;
import static PI.Vagas.infoVagas;

/**
 *
 * @author Carlos Eduardo
 */
public class RelatorioVagas {

    static void OpcoesRelatorios() {
        System.out.println("Filtros Disponiveis");
        System.out.println("1. Tipo de Vaga");
        System.out.println("2. Vagas por Faixa Salarial");
        int opcao = Menu.leia.nextInt();

        switch (opcao) {
            case 1: {
                relatVagas();
            }
            break;
            case 2: {
                relatVagasPorSalario();
            }
            break;
            default: {
                System.out.println("Opção Invalidada");
                OpcoesRelatorios();
                layout();
            }
        }
    }

    static void relatVagas() {

        System.out.println("Selecione o tipo de vaga desejada: ");
        System.out.println(" 1. Aux. Limpeza");
        System.out.println(" 2. Faxineira");
        System.out.println(" 3. Diarista");
        int opcaoTipoRelVaga = 0;
        opcaoTipoRelVaga = Checagem.checarNumero(opcaoTipoRelVaga);
        if (opcaoTipoRelVaga >= 1 && opcaoTipoRelVaga <= 3) {
            System.out.println("Relatório de vagas");
            System.out.println("Você selecionou a opção " + opcaoTipoRelVaga);
            layout();

            //Percorre o vetor e seleciona as vagas que tiverem o cod igual ao tipo desejado
            for (int i = 0; i < infoVagas.length; i++) {
                if (infoVagas[i].tipoVaga == opcaoTipoRelVaga) {
                    System.out.println("Código Vaga: " + infoVagas[i].codigoVaga);
                    System.out.println("Descrição: " + infoVagas[i].descricao);
                    System.out.println("Empresa: " + infoVagas[i].empresa);
                    System.out.println("Localização: " + infoVagas[i].local);
                    System.out.println("Salario R$: " + formatador.format(infoVagas[i].valor));
                    layout();
                }
            }
            Vagas.continuidadeVagas();
        } else {
            System.out.println("Opção do tipo de vaga Invalida");
            relatVagas();
        }

    }

    static void relatVagasPorSalario() {

        System.out.println("Relatório por Faixa Salarial");
        System.out.println("Escolha as opções para exibição");

        System.out.println("1. Até 1.000,00 Reais");
        System.out.println("2. De 1.001,00 até 2.000,00 Reais");
        System.out.println("3. Maior que 2.000,00 Reais");

        int opcaoTipoRelSalario = 0;
        opcaoTipoRelSalario = Checagem.checarNumero(opcaoTipoRelSalario);
        if (opcaoTipoRelSalario >= 1 && opcaoTipoRelSalario <= 3) {
            System.out.println("Relatório de vagas");
            System.out.println("Você selecionou a opção " + opcaoTipoRelSalario);
            layout();

            //Percorre o vetor e seleciona as vagas que tiverem o salario dentro do desejado
            for (int i = 0; i < infoVagas.length; i++) {
                if (opcaoTipoRelSalario == 1) {
                    if (infoVagas[i].valor <= 1000) {
                        System.out.println("Código Vaga: " + infoVagas[i].codigoVaga);
                        if (infoVagas[i].tipoVaga == 1) {
                            System.out.println("Tipo da Vaga: 1.Aux.Limpeza");
                        } else if (infoVagas[i].tipoVaga == 2) {
                            System.out.println("Tipo da Vaga: 2. Faxineira");
                        } else {
                            System.out.println("Tipo da Vaga: 3. Diarista");
                        }
                        System.out.println("Descrição: " + infoVagas[i].descricao);
                        System.out.println("Empresa: " + infoVagas[i].empresa);
                        System.out.println("Localização: " + infoVagas[i].local);
                        System.out.println("Salario R$: " + formatador.format(infoVagas[i].valor));
                        layout();
                        Vagas.continuidadeVagas();
                    }
                } else if (opcaoTipoRelSalario == 2) {
                    if (infoVagas[i].valor > 1000 && infoVagas[i].valor <= 2000) {
                        System.out.println("Código Vaga: " + infoVagas[i].codigoVaga);
                        if (infoVagas[i].tipoVaga == 1) {
                            System.out.println("Tipo da Vaga: 1.Aux.Limpeza");
                        } else if (infoVagas[i].tipoVaga == 2) {
                            System.out.println("Tipo da Vaga: 2. Faxineira");
                        } else {
                            System.out.println("Tipo da Vaga: 3. Diarista");
                        }
                        System.out.println("Descrição: " + infoVagas[i].descricao);
                        System.out.println("Empresa: " + infoVagas[i].empresa);
                        System.out.println("Localização: " + infoVagas[i].local);
                        System.out.println("Salario R$: " + formatador.format(infoVagas[i].valor));
                        layout();
                        Vagas.continuidadeVagas();
                    }
                } else if (opcaoTipoRelSalario == 3) {
                    if (infoVagas[i].valor > 2000) {
                        System.out.println("Código Vaga: " + infoVagas[i].codigoVaga);
                        if (infoVagas[i].tipoVaga == 1) {
                            System.out.println("Tipo da Vaga: 1.Aux.Limpeza");
                        } else if (infoVagas[i].tipoVaga == 2) {
                            System.out.println("Tipo da Vaga: 2. Faxineira");
                        } else {
                            System.out.println("Tipo da Vaga: 3. Diarista");
                        }
                        System.out.println("Descrição: " + infoVagas[i].descricao);
                        System.out.println("Empresa: " + infoVagas[i].empresa);
                        System.out.println("Localização: " + infoVagas[i].local);
                        System.out.println("Salario R$: " + formatador.format(infoVagas[i].valor));
                        layout();
                        Vagas.continuidadeVagas();
                    }
                } else {
                    System.out.println("Opção do tipo de vaga Invalida");
                }

            }
        }
    }
}
