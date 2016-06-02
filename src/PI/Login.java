package PI;

import static PI.Inicio.pass;
import static PI.Inicio.user;
import static PI.CadastrarNovos.cadastro;
import static PI.Inicio.principal;
import static PI.Layout.layout;

public class Login {

    /**
     *
     * Função Login Condição de acesso ao sistema
     */
    static void login() {

        if (user.equals("UserMaster") && pass.equals("pass123")) {
            layout();
            System.out.println("Seja bem-vindo Mestre");
            Menu.menu();

        } else if (!"UserMaster".equals(user) && !"pass123".equals(pass)) {
            for (int i = 0; i < cadastro.length; i++) {
                if (cadastro[i].nome.equals(user) && cadastro[i].senha.equals(pass)) {
                    System.out.println("Logado com sucesso");
                    Menu.menu();
                } else {
                    System.out.println("Usuário não encontrado na base de dados, TRY AGAIN");
                    principal();
                }
            }
            
            //restaurar essa condição

        } else {
            layout();
            System.out.println("  Usuario ou Senha Inválidos   ");
            System.out.println("  Tente novamente              ");
            layout();
            principal();

        }

    }

}
