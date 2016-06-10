package PI;

import static PI.Layout.layout;
import java.util.Scanner;

public class Menu {

    static Scanner leia = new Scanner(System.in);

    public static void menu() {

        //Menu do Sistema, Apresenta as principais funções do programa.        
        layout();
        System.out.println("O que deseja fazer?");
        System.out.println(" 1 - CADASTRAR VAGAS");
        System.out.println(" 2 - VISUALIZAR VAGAS");
        System.out.println(" 0 - SAIR");
        int opcao = leia.nextInt();
        layout();

        //VERIFICA A OPÇÃO DIGITA
        switch (opcao) {
            //AO DIGITAR 0 O SISTEMA IRA FECHAR.
            case 0:
                layout();
                System.out.println("   Obrigado por utilizar nosso sitema!   ");
                layout();
                System.exit(opcao);
            //AO DIGITAR 1 O SISTEMA INICIARÁ A FUNÇÃO DE CADASTRAR VAGAS
            case 1:
                Vagas.cadastrarVagas();
                break;
            case 2:
                //AO DIGITAR 2 O SISTEMA INCIALIZA A FUNÇÃO ONDE IRÁ MOSTRAR AS VAGAS
                Vagas.mostrarVagas();
                break;
            //CASO A OPÇÃO SEJA INVALIDA, RETORNA A FUNÇÃO MENU,
            //PARA OBTER NOVA TENTIVA    
            default: {
                System.out.println("Opção Invalidada");
                Menu.menu();
                layout();
            }
        }

    }

    public static void main(String[] args) {

    }

}
