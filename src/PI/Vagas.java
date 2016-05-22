/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PI;

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

        infoVagas = new vetorVagas[5];

        //CADASTRO PADRÃO SOLICITADO NO PROJETO
        // INSERE 3 VAGAS NAS 3 PRIMEIRAS POSIÇÕES DO VETOR
        for (int i = 0; i < infoVagas.length; i++) {

            infoVagas[i] = new vetorVagas();

            infoVagas[i].codigoVaga = 1;
            infoVagas[i].descricao = "Limpeza";
            infoVagas[i].empresa = "MarketData";
            infoVagas[i].local = "Berrini";
            infoVagas[i].valor = 1200;
            infoVagas[i].disp = true;
            System.out.println("Concluido");
        }

        for (int i = 1; i < infoVagas.length; i++) {

            infoVagas[i].codigoVaga = 2;
            infoVagas[i].descricao = "Faxina";
            infoVagas[i].empresa = "Intelecta";
            infoVagas[i].local = "Paulista";
            infoVagas[i].valor = 1250;
            infoVagas[i].disp = true;
            System.out.println("Concluido");

        }

        for (int i = 2; i < infoVagas.length; i++) {

            infoVagas[i].codigoVaga = 1;
            infoVagas[i].descricao = "Faxina";
            infoVagas[i].empresa = "Senac";
            infoVagas[i].local = "Jurubatuba";
            infoVagas[i].valor = 1600;
            infoVagas[i].disp = true;
            System.out.println("Concluido");

        }
        //mostrarVagas();
        //Menu.menu();

    }

    public static void cadastrarVagas() {

        /**
         * Abre a classe de cadastro de vagas para realizar o cadastro de novas
         * vagas.
         *
         * Cadastra a vaga.
         */
        for (int i = 3; i < infoVagas.length; i++) {

            infoVagas[i] = new vetorVagas();

            System.out.println("Código da Vaga");
            infoVagas[i].codigoVaga = Menu.leia.nextInt();
            Menu.leia.nextLine();
            System.out.print("Informe a descrição da Vaga :");
            infoVagas[i].descricao = Menu.leia.nextLine();
            System.out.println("Informa o nome da Empresa : ");
            infoVagas[i].empresa = Menu.leia.next();
            System.out.print("Salário : ");
            infoVagas[i].valor = Menu.leia.nextFloat();
            System.out.println("Informe a localização : ");
            infoVagas[i].local = Menu.leia.next();

            //SETA VAGA DISPONIVEL
            infoVagas[i].disp = true;
            if (infoVagas[i].disp == true) {
                System.out.println("Vaga Disponivel");

            } else {
                System.out.println("Vaga Indisponivel");
            }
        }
        /**
         * Ao terminar de cadastrar ira perguntar se deseja fazer um novo
         * cadastro.
         */

        cadastrarNovamente();
    }

    public static void cadastrarNovamente() {
        /**
         * Função cadastrarNovamente.
         */
        System.out.println("\nDeseja Cadastrar outra vaga?");
        System.out.println("s ou n?");
        String resposta = Menu.leia.next();

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
         * Mostra Vagas Cadastradas.
         *
         * FAZER ALGORITMO PARA VERIFICAR SE VAGA QUE IRA CADASTRAR JA EXISTE OU
         * NÃO
         *
         */
        System.out.println("Detalhes da Vaga: ");
        for (int i = 0; i < infoVagas.length; i++) {

            if (infoVagas[i].disp == true) {
                System.out.println("Código Vaga : " + infoVagas[i].codigoVaga);
                System.out.println("Descrição : " + infoVagas[i].descricao);
                System.out.println("Empresa : " + infoVagas[i].empresa);
                System.out.println("Localização :" + infoVagas[i].local);
                System.out.println("Salário : " + infoVagas[i].valor);
                if (infoVagas[i].disp == true) {
                    System.out.println("Vaga Disponivel");
                }
            }
        }
        selecionaVaga();
        continuidadeVagas();

    }

    public static void MostrarVagaEspecifica() {

    }

    public static void continuidadeVagas() {

        System.out.println("O que Deseja fazer?");
        System.out.println("1 - CADASTRAR VAGAS");
        System.out.println("2 - SELECIONAR VAGA");
        System.out.println("3 - VOLTAR PARA MENU PRINCIPAL");

        int opcao = Menu.leia.nextInt();

        switch (opcao) {
            case 1:
                cadastrarVagas();
                break;
            case 2:
                selecionaVaga();
                break;
            case 3:
                Menu.menu();
            default: {
                System.out.println("Opção Invalidada");
                continuidadeVagas();
            }
        }
    }

    public static void selecionaVaga() {

        System.out.println("Digite o numero da vaga");
        int n = Menu.leia.nextInt();
        int i = 0;

        while (n != infoVagas[i].codigoVaga) {

            if (n == infoVagas[i].codigoVaga) {
                System.out.println("Descrição: " + infoVagas[i].descricao);
                System.out.println("Empresa: " + infoVagas[i].empresa);
                System.out.println("Local : " + infoVagas[i].local);
                System.out.println("Salario : " + infoVagas[i].valor);
                System.out.println("Código Vaga : " + infoVagas[i].codigoVaga);
            } else {
                System.out.println("Vaga Invalida, tente novamente : ");
            }

            i++;
        }

        System.out.println("CONFIRMA SELEÇÃO DA VAGA? ");
        String resposta = Menu.leia.next();

        switch (resposta) {
            case "s": {
                for (int j = 0; j < infoVagas.length; j++) {
                    infoVagas[j].disp = false;

                }

                for (int j = 0; j < infoVagas.length; j++) {
                    System.out.println(infoVagas[j].disp);
                }
            }

        }
    }

}
