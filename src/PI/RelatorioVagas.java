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

    static void relatVagas() {

        System.out.println("Selecione o tipo de vaga desejada: ");
        System.out.println(" 1. Aux. Limpeza");
        System.out.println(" 2. Faxineira");
        System.out.println(" 3. Diarista");
        int tipo = Menu.leia.nextInt();

        System.out.println("Relatório de vagas");
        System.out.println("Você selecionou a opção " + tipo);
        layout();
        
        //Percorre o vetor e seleciona as vagas que tiverem o cod igual ao tipo desejado
        for (int i = 0; i < infoVagas.length; i++) {
            if (infoVagas[i].tipoVaga == tipo) {
                System.out.println("Código Vaga: " + infoVagas[i].codigoVaga);
                System.out.println("Descrição: " + infoVagas[i].descricao);
                System.out.println("Empresa: " + infoVagas[i].empresa);
                System.out.println("Localização: " + infoVagas[i].local);
                System.out.println("Salario R$: " + formatador.format(infoVagas[i].valor));
                layout();
            }
        }
        Vagas.continuidadeVagas();
    }
}