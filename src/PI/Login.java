package PI;

import static PI.Inicio.pass;
import static PI.Inicio.principal;
import static PI.Inicio.user;
import static PI.Layout.layout;

public class Login {

    /**
     *
     * Função Login - Condição de acesso ao sistema
     */
    static void login() {        
        

        if (user.equals("UserMaster") && pass.equals("pass123")) {
            System.out.println("");
            System.out.println("Seja bem-vindo");
            Menu.menu();

        } else {
            layout();
            System.out.println("  Usuario ou Senha Inválidos   ");
            System.out.println("  Tente novamente              ");
            principal();

        }
    }

}
