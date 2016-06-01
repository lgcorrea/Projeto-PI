package PI;

import PI.AuxCadastrar;
import static PI.Inicio.principal;
import static PI.Layout.layout;
import java.util.Scanner;

/**
 * @author Carlos Eduardo
 */
public class CadastrarNovos {
    
    public static AuxCadastrar cadastro[];

    static void forLogin() {

        Scanner teclado = new Scanner(System.in);
        
        cadastro = new AuxCadastrar[3];

        for (int i = 0; i == 0; i++) {
            
            cadastro[i] = new AuxCadastrar();
            System.out.println("Informe seu nome: ");
            cadastro[i].nome = teclado.next();
                    
            System.out.println("Informe sua senha: ");
            cadastro[i].senha = teclado.next();
        }

//        //Esse  SOUT é uma tentativa de visualizar o que foi armazenado.
        
        

        layout();
        System.out.println("Usuario cadastrado com sucesso");
        System.out.println("Faça login");
        layout();
        principal();

    }

}
