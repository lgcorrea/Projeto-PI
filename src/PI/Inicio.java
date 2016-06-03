package PI;

import static PI.Layout.layout;
import static PI.Login.login;
import static PI.Vagas.mostrarVagas;
import java.util.Scanner;

/**
 * @author Carlos Eduardo
 */
public class Inicio {

    //Declarações publicas utlizadas em funções ou classe
    public int resp = 0;
    public static String pass, user = "";
    public static Scanner teclado = new Scanner(System.in);

    /**
     * Chama as funções
     *
     * @param args
     */
    public static void main(String[] args) {
        Vagas.vPadrao();
        principal();
        //login();
    }

    /**
     * Função principal Direciona o usuário
     */ 
    static void principal() {
        layout();
        System.out.println(" 1. Faça Login                ");
        System.out.println(" 2. Ainda não um possui Login?");
        System.out.println(" 0. Sair                      ");
        int resp = teclado.nextInt();
        layout();

        /**
         * Verificação Principal do Login
         */
        switch (resp) {
            case 1:
                System.out.println("Usuario: ");
                user = teclado.next();
                System.out.println("Senha: ");
                pass = teclado.next();
                login();
                break;
            case 2:
                System.out.println("cadastre-se");
                CadastrarNovos.forLogin();
                break;
            case 0:
                layout();
                System.out.println("   Obrigado por utilizar nosso sitema!   ");
                layout();
                System.exit(resp);
                break;
            default:
                System.out.println(" Opção inválida!        ");
                System.out.println(" Tente uma opção válida!");
                layout();
                principal();
                break;
        }

    }

}
