package PI;

import static PI.Inicio.pass;
import static PI.CadastrarNovos.cadastro;
import static PI.Inicio.principal;
import static PI.Inicio.user;
import static PI.Layout.layout;

public class Login {

    /**
     *
     * Função Login - Condição de acesso ao sistema
     */
    static void login() {

        //CadastrarNovos.LoginUsuario();
        //CadastrarNovos.LoginMaster();

        for (int i = 0; i < cadastro.length; i++) {

            if (user.equals(cadastro[i].nome) && pass.equals(cadastro[i].senha)) {
                System.out.println("Seja bem-vindo");
                Menu.menu();

            } else {
                layout();
                System.out.println("  Usuario ou Senha Inválidos   ");
                System.out.println("  Tente novamente              ");
                layout();
                principal();

            }
        }
    }
}
