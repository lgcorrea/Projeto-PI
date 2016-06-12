/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PI;

import static PI.Layout.layout;
import java.text.DecimalFormat;

/**
 *
 * @author GUSTAVO
 */
public class Vagas {

    public static boolean vagaSelecionada = false;
    public static int num = 3;
    public static vetorVagas[] infoVagas;
    static DecimalFormat formatador = new DecimalFormat("0000.00");

    public static void main(String[] args) {
    }

    public static void vPadrao() {

        infoVagas = new vetorVagas[10];

        //CADASTRO PADRÃO SOLICITADO NO PROJETO
        // INSERE 3 VAGAS NAS 3 PRIMEIRAS POSIÇÕES DO VETOR
        for (int i = 0; i == 0; i++) {

            infoVagas[i] = new vetorVagas();

            infoVagas[i].codigoVaga = 1;
            infoVagas[i].tipoVaga = 1;
            infoVagas[i].descricao = "Aux. Limpeza";
            infoVagas[i].empresa = "MarketData";
            infoVagas[i].local = "Berrini";
            formatador.format(infoVagas[i].valor = 1200);
            infoVagas[i].disp = true;
        }

        for (int i = 1; i == 1; i++) {

            infoVagas[i] = new vetorVagas();

            infoVagas[i].codigoVaga = 2;
            infoVagas[i].tipoVaga = 2;
            infoVagas[i].descricao = "Faxineira";
            infoVagas[i].empresa = "Intelecta";
            infoVagas[i].local = "Paulista";
            formatador.format(infoVagas[i].valor = 1250);
            infoVagas[i].disp = true;

        }

        for (int i = 2; i == 2; i++) {

            infoVagas[i] = new vetorVagas();

            infoVagas[i].codigoVaga = 3;
            infoVagas[i].tipoVaga = 2;
            infoVagas[i].descricao = "Faxineira";
            infoVagas[i].empresa = "Senac";
            infoVagas[i].local = "Jurubatuba";
            formatador.format(infoVagas[i].valor = 1600);
            infoVagas[i].disp = true;

        }

        for (int i = 3; i < infoVagas.length; i++) {
            infoVagas[i] = new vetorVagas();
        }

    }

    public static void cadastrarVagas() {

        /**
         * Abre a classe de cadastro de vagas para realizar o cadastro de novas
         * vagas.
         *
         * Cadastra a vaga.
         */
        for (int i = 0; i < infoVagas.length; i++) {

            if (infoVagas[i].codigoVaga == 0) {
                infoVagas[i] = new vetorVagas();
                //Incremento -> controla o codigo das vagas
                num = num + 1;

                System.out.print("Código da Vaga: ");
                infoVagas[i].codigoVaga = Checagem.checarNumero(infoVagas[i].codigoVaga);
                Menu.leia.nextLine();
                System.out.println("Informe o Tipo da Vaga: ");
                //SE A OPÇÃO DE TIPO DE VAGA ESTIVER INCORRETA, O SISTEMA INFORMARÁ
                //E PEDIRÁ PARA CADASTRAR NOVAMENTE
                boolean flagTipoVaga = true;
                int opcaoTipoVaga = 0;
                System.out.println("1.Aux. de Limpeza 2.Faxineira 3.Diarista");
                opcaoTipoVaga = Checagem.checarNumero(opcaoTipoVaga);
                if (opcaoTipoVaga >= 1 && opcaoTipoVaga <= 3) {
                    infoVagas[i].tipoVaga = opcaoTipoVaga;
                } else {
                    System.out.println("Opção do tipo de vaga Invalida");
                    flagTipoVaga = false;
                }
                Menu.leia.nextLine();
                //infoVagas[i].tipoVaga = Checagem.checarNumero(infoVagas[i].tipoVaga);
                System.out.print("Informe a descrição da Vaga: ");
                infoVagas[i].descricao = Menu.leia.nextLine();
                System.out.print("Informe o nome da Empresa: ");
                infoVagas[i].empresa = Menu.leia.next();
                System.out.print("Salário R$: ");
                infoVagas[i].valor = Checagem.checarValor(infoVagas[i].valor);
                Menu.leia.nextLine();
                System.out.print("Informe a localização: ");
                infoVagas[i].local = Menu.leia.nextLine();
                layout();

                //Verifica se o código digitado ja existe
                if (infoVagas[i].codigoVaga < num) {
                    System.out.println("Impossivel cadastrar vaga");
                    System.out.println("Para dar sequência utilize o código :" + num);
                    layout();
                    //Se entrarmos nesta condição seremos obrigados a retirar 1 de num
                    //Pois ao entrar no FOR novamente somara mais 1 e resultará em erro
                    num = num - 1;
                    //Verifica se o código digitado sai da sequencia
                    
                    //se o código estiver errado todas as posições do vetor
                    //voltam para o padrão, assim não gravando infos incorretas.
                    infoVagas[i].codigoVaga = 0;
                    infoVagas[i].descricao = "";
                    infoVagas[i].empresa = "";
                    infoVagas[i].local = "";
                    infoVagas[i].valor = 0;
                    infoVagas[i].disp = false;
                    cadastrarVagas();

                } else {
                    if (Checagem.flagValor == false) {
                        //Se o salario estiver errado, todas as posições do vetor
                        //voltam para o padrão, assim não gravando infos incorretas.
                        System.out.println("Salário invalido");
                        System.out.println("Tente novamente");
                        num = num - 1;
                        infoVagas[i].codigoVaga = 0;
                        infoVagas[i].descricao = "";
                        infoVagas[i].empresa = "";
                        infoVagas[i].local = "";
                        infoVagas[i].valor = 0;
                        infoVagas[i].disp = false;
                        cadastrarVagas();

                    } else if (Checagem.flagNumero == false) {
                        System.out.println("Tente novamente");
                        num = num - 1;
                        infoVagas[i].codigoVaga = 0;
                        infoVagas[i].descricao = "";
                        infoVagas[i].empresa = "";
                        infoVagas[i].local = "";
                        infoVagas[i].valor = 0;
                        infoVagas[i].disp = false;
                        cadastrarVagas();

                    } else if (flagTipoVaga == false) {
                         //Se o tipo da vaga estiver errado, todas as posições do vetor
                        //voltam para o padrão, assim não gravando infos incorretas.
                        System.out.println("Tipo de Vaga invalida");
                        System.out.println("Tente Novamente");
                        num = num - 1;
                        infoVagas[i].codigoVaga = 0;
                        infoVagas[i].descricao = "";
                        infoVagas[i].empresa = "";
                        infoVagas[i].local = "";
                        infoVagas[i].valor = 0;
                        infoVagas[i].disp = false;
                        cadastrarVagas();

                    }
                }

                //SETA VAGA DISPONIVEL
                infoVagas[i].disp = true;
                if (infoVagas[i].disp == true) {
                    System.out.println("Vaga Cadastrada !");

                }
                /**
                 * Ao terminar de cadastrar ira perguntar se deseja fazer um
                 * novo cadastro.
                 */
                cadastrarNovamente();
            }

        }

        for (int i = 9; i == 9; i++) {
            if (infoVagas[i].codigoVaga != 0) {
                System.out.println("Não é possivel Cadastrar Vagas");
                System.out.println("Verifique o armazenamento");

            }
        }
    }

    public static void cadastrarNovamente() {
        /**
         * Função cadastrarNovamente.
         */
        layout();
        System.out.println("\nDeseja Cadastrar outra vaga?");
        System.out.println("Sim ou Nao?");
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
            case "Sim": {
                Vagas.cadastrarVagas();
                break;
            }
            /*CASO "Não" Retorna para a função de menu
             */
            case "Nao": {
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
                System.out.println("   Sessão Finalizada   ");
                Inicio.principal();
                break;
            default:
                layout();
                System.out.println("Opção inválida");
                System.out.println("Tente novamente");
                //resp = 99;
                mostrarVagas();
                layout();
                break;

        }
    }

    public static void MostrarVagaCompleta() {

        // MOSTRA A VAGA COMPLETA 
        System.out.println("Informe o Código da Vaga que deseja detalhar: ");
        int vaga = Menu.leia.nextInt();
        layout();

        for (int i = 0; i < infoVagas.length; i++) {
            if (vaga == infoVagas[i].codigoVaga) {
                if (infoVagas[i].disp != false) {
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
                    if (infoVagas[i].disp == true) {
                        System.out.println("Vaga Disponivel");
                        layout();
                    }
                }
            }
        }
        continuidadeVagas();

    }

    public static void selecionaVaga() {

        System.out.println("Digite o numero da vaga: ");
        int vaga = Menu.leia.nextInt();
        layout();

        for (int i = 0; i < infoVagas.length; i++) {

            if (vaga == infoVagas[i].codigoVaga && vagaSelecionada == false) {
                System.out.println("Código Vaga : " + infoVagas[i].codigoVaga);
                System.out.println("Tipo da Vaga:");
                if (infoVagas[i].tipoVaga == 1) {
                    System.out.println("Tipo da Vaga: 1.Aux.Limpeza");
                } else if (infoVagas[i].tipoVaga == 2) {
                    System.out.println("Tipo da Vaga: 2. Faxineira");
                } else {
                    System.out.println("Tipo da Vaga: 3. Diarista");
                }
                System.out.println("Descrição: " + infoVagas[i].descricao);
                System.out.println("Empresa: " + infoVagas[i].empresa);
                System.out.println("Local : " + infoVagas[i].local);
                System.out.println("Salario : " + infoVagas[i].valor);
            }

            if (vaga == infoVagas[i].codigoVaga && vagaSelecionada == true) {
                System.out.println("\nUma Vaga já foi selecionada");
                System.out.println("Você pode escolher apenas uma vaga.\n");
                Menu.menu();
            }
        }

        System.out.println();
        System.out.println("CONFIRMA SELEÇÃO DA VAGA? ");
        System.out.println("SIM (S) OU NÃO (N)");
        String resposta = Menu.leia.next();

        if ("s".equalsIgnoreCase(resposta)) {

            for (int i = 0; i < infoVagas.length; i++) {
                if (vaga == infoVagas[i].codigoVaga) {
                    infoVagas[i].codigoVaga = 0;
                    infoVagas[i].tipoVaga = 0;
                    infoVagas[i].descricao = "";
                    infoVagas[i].empresa = "";
                    infoVagas[i].local = "";
                    infoVagas[i].valor = 0;
                    infoVagas[i].disp = false;

                    //AO ESCOLHER UMA VAGA, NÃO PODERÁ ESCOLHER OUTRA
                    //A VARIAVEL vagaSelecionada é alterada para TRUE
                    //Para evitar que seja escolhida outra vaga
                    vagaSelecionada = true;
                    layout();
                    System.out.println("Seleção de vaga efetuada com sucesso");
                    for (int j = 0; j < 9; j++) {
                        reorganiza(infoVagas);
                    }
                    Menu.menu();
                }

            }
        } else if ("n".equalsIgnoreCase(resposta)) {
            Menu.menu();
        }
    }

    public static void continuidadeVagas() {
        layout();
        System.out.println("O que Deseja fazer?");
        System.out.println();
        System.out.println("1 - CADASTRAR VAGAS");
        System.out.println("2 - ESCOLHER VAGA");
        System.out.println("3 - BUSCAR VAGAS");
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
                RelatorioVagas.relatVagas();
                break;
            case 0:
                System.exit(opcao);
            default: {
                System.out.println("Opção Invalidada");
                continuidadeVagas();
            }
        }
    }

    public static int[] reorganiza(vetorVagas[] infoVagas) {
        int[] vetornovo = new int[infoVagas.length];

        for (int i = 0; i < 9; i++) {
            if (infoVagas[i].codigoVaga == 0) {
                infoVagas[i].codigoVaga = infoVagas[i + 1].codigoVaga;
                infoVagas[i].tipoVaga = infoVagas[i + 1].tipoVaga;
                infoVagas[i].descricao = infoVagas[i + 1].descricao;
                infoVagas[i].empresa = infoVagas[i + 1].empresa;
                infoVagas[i].local = infoVagas[i + 1].local;
                infoVagas[i].valor = infoVagas[i + 1].valor;
                infoVagas[i].disp = infoVagas[i + 1].disp;

            }

        }
        for (int i = 0; i < 9; i++) {
            if (infoVagas[i].codigoVaga == infoVagas[i + 1].codigoVaga) {
                infoVagas[i + 1].codigoVaga = 0;
                infoVagas[i + 1].tipoVaga = 0;
                infoVagas[i + 1].descricao = "";
                infoVagas[i + 1].empresa = "";
                infoVagas[i + 1].local = "";
                infoVagas[i + 1].valor = 0;
                infoVagas[i + 1].disp = false;

            }

        }

        return vetornovo;
    }
}
