package PI;

import static PI.Layout.layout;
import java.util.Scanner;

public class Menu {

    
    static Scanner leia = new Scanner(System.in);
    
       
    public static void menu() {
        
        layout();
        System.out.println("O que deseja fazer?");
        System.out.println(" 1 - CADASTRAR VAGAS");
        System.out.println(" 2 - VISUALIZAR VAGAS");
        System.out.println(" 0 - SAIR");
        int opcao = leia.nextInt();
        layout();

        switch (opcao) {
            case 0:
                layout();
                System.out.println("   Obrigado por utilizar nosso sitema!   ");
                layout();
                System.exit(opcao);
            case 1:
               Vagas.cadastrarVagas();
                break;
            case 2:
                Vagas.mostrarVagas();
                break;
            default: {
                System.out.println("Opção Invalidada");
                Menu.menu();
                layout();
            }
        }

    }
     
     public static void main(String [] args) { 
         
         //colocar na tela após a tela de login
         //Vagas.vPadrao();
         //menu();
//         Vagas.cadastrarVagas();
//         Vagas.mostrarVagas();
         
         
         
    }

}
