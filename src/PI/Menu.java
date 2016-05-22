package PI;

import java.util.Scanner;

public class Menu {

    
    static Scanner leia = new Scanner(System.in);
    
       
    public static void menu() {
        
        
        System.out.println("O que deseja fazer?");
        System.out.println(" 1 - CADASTRAR VAGAS");
        System.out.println(" 2 - LISTAR VAGAS");

        int opcao = leia.nextInt();

        switch (opcao) {
            case 1:
               Vagas.cadastrarVagas();
                break;
            case 2:
                Vagas.mostrarVagas();
                break;
            default: {
                System.out.println("Opção Invalidada");
                Menu.menu();
            }
        }

    }
    
     public static void main(String [] args) { 
         
         //colocar na tela após a tela de login
         Vagas.vPadrao();
         menu();
         
                 
         
    }

}
