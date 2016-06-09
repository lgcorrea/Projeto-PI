package PI;

import static PI.Inicio.principal;
import static PI.Layout.layout;
import java.util.Scanner;

/**
 * @author Carlos Eduardo
 */
public class CadastrarNovos {
    
    //Criado a partir da Classe AuxCadastrar
    public static AuxCadastrar cadastro[];

    static void forLogin() {

        Scanner teclado = new Scanner(System.in);
        
        //Definindo o tamanho do Vetor
        cadastro = new AuxCadastrar[5];

        //Atribui as informações do admnistrador na posição 0
        for (int i = 0; i == 0; i++) {
            cadastro[i] = new AuxCadastrar();

            cadastro[i].nome = "UserMaster";
            cadastro[i].senha = "pass123";
            
        }
        
        //Percorre o array e ao sinal espaço livre armazena um novo usuário
        for (int i = 0; i < cadastro.length; i++) {
            cadastro[i] = new AuxCadastrar();
            
            //Condição de Verificação para 
            if (cadastro[i].nome.equals("")) {
               

                System.out.println("Informe seu nome: ");
                cadastro[i].nome = teclado.next();
                System.out.println("Informe sua senha: ");
                cadastro[i].senha = teclado.next();

                layout();
                System.out.println("Usuario cadastrado com sucesso");
                System.out.println("Seja bem-vindo");
                layout();
                principal();

            }
        }
    }
}
