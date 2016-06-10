/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PI;

import static PI.Layout.layout;

/**
 *
 * @author GUSTAVO
 */
public class Vagas {

    public static vetorVagas[] infoVagas;
    
    public static void main(String[] args) {
        //cadastrarVagas();

        //vPadrao();
        //selecionaVaga();
        //mostrarVagas();
    }

    public static void vPadrao() {

        infoVagas = new vetorVagas[6];

        //CADASTRO PADRÃO SOLICITADO NO PROJETO
        // INSERE 3 VAGAS NAS 3 PRIMEIRAS POSIÇÕES DO VETOR
        for (int i = 0; i == 0; i++) {

            infoVagas[i] = new vetorVagas();

            infoVagas[i].codigoVaga = 1;
            infoVagas[i].descricao = "Limpeza";
            infoVagas[i].empresa = "MarketData";
            infoVagas[i].local = "Berrini";
            infoVagas[i].valor = 1200;
            infoVagas[i].disp = true;
        }

        for (int i = 1; i == 1; i++) {

            infoVagas[i] = new vetorVagas();

            infoVagas[i].codigoVaga = 2;
            infoVagas[i].descricao = "Faxina";
            infoVagas[i].empresa = "Intelecta";
            infoVagas[i].local = "Paulista";
            infoVagas[i].valor = 1250;
            infoVagas[i].disp = true;

        }

        for (int i = 2; i == 2; i++) {

            infoVagas[i] = new vetorVagas();

            infoVagas[i].codigoVaga = 3;
            infoVagas[i].descricao = "Faxina";
            infoVagas[i].empresa = "Senac";
            infoVagas[i].local = "Jurubatuba";
            infoVagas[i].valor = 1600;
            infoVagas[i].disp = true;

        }

        for (int i = 3; i < infoVagas.length; i++) {
            infoVagas[i] = new vetorVagas();
        }
        //mostrarVagas();

    }

    public static void cadastrarVagas() {

        /**
         * Abre a classe de cadastro de vagas para realizar o cadastro de novas
         * vagas.
         *
         * Cadastra a vaga.
         */
        for (int i = 0; i <= infoVagas.length; i++) {

            if (infoVagas[i].codigoVaga == 0) {

                infoVagas[i] = new vetorVagas();

                System.out.print("Código da Vaga: ");
                infoVagas[i].codigoVaga = Menu.leia.nextInt();
                Menu.leia.nextLine();
                System.out.print("Informe a descrição da Vaga: ");
                infoVagas[i].descricao = Menu.leia.nextLine();
                System.out.print("Informa o nome da Empresa: ");
                infoVagas[i].empresa = Menu.leia.next();
                System.out.print("Salário : ");
                infoVagas[i].valor = Menu.leia.nextFloat();
                System.out.print("Informe a localização: ");
                infoVagas[i].local = Menu.leia.next();
                layout();

                //SETA VAGA DISPONIVEL
                infoVagas[i].disp = true;
                if (infoVagas[i].disp == true) {
                    System.out.println("Vaga Disponivel");

                } else {
                    System.out.println("Vaga Indisponivel");
                }
                cadastrarNovamente();
            }
        }
        /**
         * Ao terminar de cadastrar ira perguntar se deseja fazer um novo
         * cadastro.
         */

    }

    public static void cadastrarNovamente() {
        /**
         * Função cadastrarNovamente.
         */
        layout();
        System.out.println("\nDeseja Cadastrar outra vaga?");
        System.out.println("s ou n?");
        String resposta = Menu.leia.next();
        layout();

        /**
         * ira checar se o usuario quer cadastrar outra vaga ou não.
         *
         */
        switch (resposta) {
            /**
             * CASO "Sim" Retorna para a função cadastrarVAGAS
             */
            case "s": {
                Vagas.cadastrarVagas();
                break;
            }
            /*CASO "Não" Retorna para a função de menu
             */
            case "n": {
                Menu.menu();
                break;
            }
            default: {
                /**
                 * CASO "opção invalida" retornará para a função
                 * cadastrarNovamente para obter a resposta correta
                 */
                System.out.println("Opção Invalidada\n");
                cadastrarNovamente();

            }
        }

    }

    public static void mostrarVagas() {
        /**
         * Mostra Pequenas informações das vagas Cadastradas.
         */
        System.out.println("Relação de Vagas:");
        System.out.println();

        for (int i = 0; i < infoVagas.length; i++) {

            if (infoVagas[i].disp != false) {
                System.out.println("Código Vaga: " + infoVagas[i].codigoVaga);
                System.out.println("Descrição: " + infoVagas[i].descricao);
                System.out.println("Localização:" + infoVagas[i].local);
                layout();

            }

        }
        System.out.println(" 1- Cadastrar Vagas");
        System.out.println(" 2- Detalhes da vaga");
        System.out.println(" 0- Sair");
        int resp = Menu.leia.nextInt();
        layout();

        switch (resp) {
            case 1:
                cadastrarVagas();
                break;
            case 2:
                MostrarVagaCompleta();
                break;
            case 0:
                System.exit(resp);
                break;
            default:
                layout();
                System.out.println("Opção inválida");
                System.out.println("Tente novamente");
                mostrarVagas();
                layout();
                break;

        }

    }

    public static void MostrarVagaCompleta() {

        // MOSTRA A VAGA COMPLETA 
        System.out.println("Informe o Código da Vaga ");
        System.out.println("que deseja Detalhar : ");
        int vaga = Menu.leia.nextInt();
        layout();

        for (int i = 0; i < infoVagas.length; i++) {
            if (vaga == infoVagas[i].codigoVaga) {
                if (infoVagas[i].disp != false) {
                    System.out.println("Código Vaga : " + infoVagas[i].codigoVaga);
                    System.out.println("Descrição : " + infoVagas[i].descricao);
                    System.out.println("Empresa : " + infoVagas[i].empresa);
                    System.out.println("Localização :" + infoVagas[i].local);
                    System.out.println("Salário : " + infoVagas[i].valor);
                    layout();
                    if (infoVagas[i].disp == true) {
                        System.out.println("Vaga Disponivel");
                    }
                }
            }
        }
        continuidadeVagas();

    }

    public static void selecionaVaga() {

        System.out.println("Digite o numero da vaga");
        int vaga = Menu.leia.nextInt();
        layout();

        for (int i = 0; i < infoVagas.length; i++) {

            if (vaga == infoVagas[i].codigoVaga) {
                System.out.println("Descrição: " + infoVagas[i].descricao);
                System.out.println("Empresa: " + infoVagas[i].empresa);
                System.out.println("Local : " + infoVagas[i].local);
                System.out.println("Salario : " + infoVagas[i].valor);
                System.out.println("Código Vaga : " + infoVagas[i].codigoVaga);

            }
        }
        System.out.println();
        System.out.println("CONFIRMA SELEÇÃO DA VAGA? ");
        System.out.println("SIIM (S) OU NÃO (N)");
        String resposta = Menu.leia.next();

        if ("s".equalsIgnoreCase(resposta)) {

            for (int i = 0; i < infoVagas.length; i++) {
                if (vaga == infoVagas[i].codigoVaga) {
                    infoVagas[i].codigoVaga = 0;
                    infoVagas[i].descricao = "";
                    infoVagas[i].empresa = "";
                    infoVagas[i].local = "";
                    infoVagas[i].valor = 0;
                    infoVagas[i].disp = false;

                    layout();
                    System.out.println("Seleção de vaga efetuada com sucesso");
                    for(int j = 0; j <5; j++){
                    reoganiza(infoVagas);
                    }
                    Menu.menu();
                }

            }
        } else if ("n".equalsIgnoreCase(resposta)) {
            Menu.menu();
        } else {
            selecionaVaga();
        }

    }

    public static void continuidadeVagas() {
        layout();
        System.out.println("O que Deseja fazer?");
        System.out.println();
        System.out.println("1 - CADASTRAR VAGAS");
        System.out.println("2 - ESCOLHER VAGAS");
        System.out.println("3 - LISTAR VAGAS");
        System.out.println("0 - Sair");
        int opcao = Menu.leia.nextInt();
        layout();

        switch (opcao) {
            case 1:
                cadastrarVagas();
                break;
            case 2:
                selecionaVaga();
                break;
            case 3:
                mostrarVagas();
                break;
            case 0:
                System.exit(opcao);
            default: {
                System.out.println("Opção Invalidada");
                continuidadeVagas();
            }
        }
    }

    public static int[] reoganiza(vetorVagas[] infoVagas) {
        int[] vetornovo = new int[infoVagas.length];

        for (int i = 0; i < 5; i++) {            
            if (infoVagas[i].codigoVaga == 0) {
                infoVagas[i].codigoVaga = infoVagas[i+1].codigoVaga;
                infoVagas[i].descricao = infoVagas[i+1].descricao;
                infoVagas[i].empresa = infoVagas[i+1].empresa;
                infoVagas[i].local = infoVagas[i+1].local;
                infoVagas[i].valor = infoVagas[i+1].valor;
                infoVagas[i].disp = infoVagas[i+1].disp;
                
            }
            
        }
            for(int i = 0; i< 5; i++) {
                if(infoVagas[i].codigoVaga == infoVagas[i+1].codigoVaga) {
                    infoVagas[i+1].codigoVaga = 0;
                    infoVagas[i+1].descricao = "";
                    infoVagas[i+1].empresa = "";
                    infoVagas[i+1].local = "";
                    infoVagas[i+1].valor = 0;
                    infoVagas[i+1].disp = false;               
                
                }
            
            
            }
                
        
        return vetornovo;
    }
}
